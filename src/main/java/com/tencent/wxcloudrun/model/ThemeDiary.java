package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zhouzl
 */
@Data
public class ThemeDiary implements Serializable {
    private Integer id;

    private Integer userId;

    private String title;

    private String content;

    private Date createTime;

    private Date updateTime;

}
