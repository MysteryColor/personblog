package com.mysterycolor.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author XuJie
 * @since 2020-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("BLOG_USER")
public class BlogUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Long id;

    @TableField("USERNAME")
    private String username;

    @TableField("AVATAR")
    private String avatar;

    @TableField("EMAIL")
    private String email;

    @TableField("PASSWORD")
    private String password;

    @TableField("STATUS")
    private Integer status;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("LAST_LOGIN")
    private LocalDateTime lastLogin;


}
