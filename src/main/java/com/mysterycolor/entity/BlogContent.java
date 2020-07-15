package com.mysterycolor.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.sql.Blob;
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
@TableName("BLOG_CONTENT")
public class BlogContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Long id;

    @TableField("USER_ID")
    private Long userId;

    @TableField("TITLE")
    private String title;

    @TableField("DESCRIPTION")
    private String description;

    @TableField("CONTENT")
    private Blob content;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("STATUS")
    private Integer status;


}
