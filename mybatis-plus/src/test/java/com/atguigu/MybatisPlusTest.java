package com.atguigu;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.nio.file.Path;
import java.util.List;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@SpringBootTest
public class MybatisPlusTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testDeleteById(){
        userMapper.deleteById(6L);
    }

    @Test
    public void testMybatisPlus01(){
        User user = userMapper.selectById(1L);
        System.out.println(user+"master");
    }

    @Test
    public void testSelectAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
    @Test
    public void testUpdateById(){
        User user = new User();
        user.setId(7L);
        user.setName("Tom1");
        user.setAge(30);
        int i = userMapper.updateById(user);
        System.out.println("i="+i);
    }
    @Test
    public void testInsert(){
        User user = new User();
        user.setName("Jom");
        user.setAge(30);
        user.setEmail("Jom@baomidou.com");
        int i = userMapper.insert(user);
        System.out.println("i="+i);
        System.out.println(user.getId());
    }
    @Test
    public void testPage(){
        Page<User> page = new Page<>(1,5);
        Page<User> userPage = userMapper.selectPage(page, null);
        System.out.println("userPage = " + userPage);

    }


    @Test
    public void testPages(){
        Page<User> page = new Page<>(1,2);
        userMapper.selectPageByPage(page,18);
        List<User> records = page.getRecords();
        System.out.println("records = " + records);
    }
}
