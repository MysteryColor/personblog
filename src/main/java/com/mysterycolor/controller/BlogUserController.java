package com.mysterycolor.controller;


import com.mysterycolor.common.lang.Result;
import com.mysterycolor.service.BlogUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author XuJie
 * @since 2020-07-15
 */
@RestController
@RequestMapping("/blog-user")
public class BlogUserController {
    @Autowired
    private BlogUserService blogUserService;

    @GetMapping("/index")
    public Object index(){
        return Result.success(blogUserService.getById(1l));
    }
}
