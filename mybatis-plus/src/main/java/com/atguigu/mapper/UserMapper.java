package com.atguigu.mapper;

import com.atguigu.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> selectAll();
    Page<User> selectPageByPage(Page<?> page,Integer age);
}
