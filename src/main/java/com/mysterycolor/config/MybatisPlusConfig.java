package com.mysterycolor.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: XuJie
 * @Date: 2020/7/15 13:47
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.mysterycolor.mapper")
public class MybatisPlusConfig {
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
