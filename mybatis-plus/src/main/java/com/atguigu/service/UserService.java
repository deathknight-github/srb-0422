package com.atguigu.service;

import com.atguigu.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author 30912
 * @date
 * @apiNote
 */
public interface UserService extends IService<User> {
    List<User> selectAll();
}
