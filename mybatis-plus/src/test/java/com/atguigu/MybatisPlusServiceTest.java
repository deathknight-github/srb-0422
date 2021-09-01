package com.atguigu;

import com.atguigu.entity.User;
import com.atguigu.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@SpringBootTest
public class MybatisPlusServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void  testSelectAll(){
        User byId = userService.getById(1L);
        System.out.println("byId = " + byId);
    }
    @Test
    public void  testSaveUsers(){
        List<User> userList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            User user = new User();
            user.setName("Tom"+i);
            user.setAge(18);
            user.setEmail("Tom"+i+"@baomidou.com");
            userList.add(user);
        }
        userService.saveBatch(userList);
    }
    @Test
    public void testGetCount(){
        int count = userService.count();
        System.out.println("count = " + count);
    }
    @Test
    public void testGetByIds(){
        List<User> userList = userService.listByIds(Arrays.asList(1, 2, 3, 4));
        System.out.println("userList = " + userList);
    }
    @Test
    public void testSelect(){
        List<User> userList = userService.list(new QueryWrapper<User>().ge("id", 1));
        System.out.println("userList = " + userList);
    }
    @Test
    public void testSelectAll2(){
        List<User> userList = userService.selectAll();
        System.out.println("userList = " + userList);
    }
}
