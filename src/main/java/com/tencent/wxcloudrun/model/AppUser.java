package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zhouzl
 */
@Data
public class AppUser implements Serializable {
    private Long id;

    private String userId;

    private String openId;

    private String unionId;

    private String nickName;

    private String avatarUrl;

    private Integer gender;

    private String phone;

    private String city;

    private String province;

    private String country;

    private Date createTime;

    private Date updateTime;
}
