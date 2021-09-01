package com.atguigu;

import com.atguigu.entity.Product;
import com.atguigu.entity.User;
import com.atguigu.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author 30912
 * @date
 * @apiNote
 */
@SpringBootTest
public class MybatisPlusTest01 {
    @Resource
    private ProductMapper productMapper;

    @Test
    public void test() {
        Product product01 = productMapper.selectById(1L);//a
        Product product02 = productMapper.selectById(1L);//b

        product01.setPrice(product01.getPrice() + 50);
        int i = productMapper.updateById(product01);
        System.out.println("i = " + i);

        product02.setPrice(product02.getPrice() - 30);
        int i1 = productMapper.updateById(product02);
        System.out.println("i1 = " + i1);

        if (i1 == 0) {//更新失败，重试
            System.out.println("小王重试");
            //重新获取数据
            product02 = productMapper.selectById(1L);
            //更新
            product02.setPrice(product02.getPrice() - 30);
            productMapper.updateById(product02);
        }
        Product product = productMapper.selectById(1L);
        Integer price = product.getPrice();
        System.out.println("price = " + price);
    }

}
