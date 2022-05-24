package com.tencent.wxcloudrun.service.theme;


import com.tencent.wxcloudrun.model.AppUser;

/**
 * @author zhouzl
 */
public interface UserService {
    /**
     * 获取用户信息
     * @param nickName 用户昵称
     * @return 用户全部信息
     */
    AppUser getUserInfo(String nickName, String avatarUrl);
}
