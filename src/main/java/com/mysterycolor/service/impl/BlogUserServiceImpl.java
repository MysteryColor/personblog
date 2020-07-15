package com.mysterycolor.service.impl;

import com.mysterycolor.entity.BlogUser;
import com.mysterycolor.mapper.BlogUserMapper;
import com.mysterycolor.service.BlogUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XuJie
 * @since 2020-07-15
 */
@Service
public class BlogUserServiceImpl extends ServiceImpl<BlogUserMapper, BlogUser> implements BlogUserService {

}
