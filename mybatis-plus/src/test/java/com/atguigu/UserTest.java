package com.atguigu;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@SpringBootTest
public class UserTest {

    @Resource
    private UserMapper userMapper;

    /**
     * 查询名字中包含n，年龄大于等于10且小于等于20，email不为空的用户
     * lt：less than 小于
     * le：less than or equal to 小于等于
     * eq：equal to 等于
     * ne：not equal to 不等于
     * ge：greater than or equal to 大于等于
     * gt：greater than 大于
     */
    @Test
    public void test01(){
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper
                .like("name","n")
                .between("age",10,20)
                .isNotNull("email");
        List<User> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
        System.out.println("---------------------------------------------------------------------");
        System.out.println(userMapper.selectList(new QueryWrapper<User>().like("name","n").between("age",0,30).isNotNull("email")));
    }

    /**
     * 按年龄降序查询用户，如果年龄相同则按id升序排列
     *
     */
    @Test
    public void test02(){
        System.out.println(userMapper.selectList(new QueryWrapper<User>().orderByDesc("age").orderByAsc("id")));
    }

    /**
     * 查询名字中包含n，且（年龄小于18或email为空的用户），并将这些用户的年龄设置为18，邮箱设置为 user@atguigu.com
     */
    @Test
    public void test03(){
        User user = new User();
        user.setAge(18);
        user.setEmail("atguigu@baobidou.com");
        System.out.println(userMapper.update(user,
                new QueryWrapper<User>()
                    .like("name","n")
                    .and(i->i.isNotNull("email") .or().lt("age",18))
        ));
    }
    /**
     * 查询所有用户的用户名和年龄和邮箱
     */
    @Test
    public void test04(){
        System.out.println(userMapper.selectMaps(new QueryWrapper<User>().select("name","age","email")));
    }

    /**
     * 查询id不大于3的所有用户的id列表
     */
    @Test
    public void test05(){
        System.out.println(userMapper.selectObjs(new QueryWrapper<User>().in("id",1,2,3)));
    }

    /**
     * 查询名字中包含n，且（年龄小于18或email为空的用户），并将这些用户的年龄设置为18，邮箱设置为 user@atguigu.com
     */
    @Test
    public void test06(){
        User user = new User();
        user.setAge(20);
        user.setEmail("test01@baobidou.com");
        System.out.println(userMapper.update(
                user,new UpdateWrapper<User>()
                        .like("name","n")
                        .and(
                                i->i.lt("age",18)
                                .or()
                                .isNotNull("email")
                        )
        ));
    }
}
