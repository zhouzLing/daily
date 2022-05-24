package com.tencent.wxcloudrun.dao.theme;

import com.tencent.wxcloudrun.model.AppUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhouzl
 */
@Mapper
public interface UserMapper {

    /**
     * 获取用户信息
     * @param nickName 用户昵称
     * @return 用户全部信息
     */
    AppUser getUserInfo(@Param("nickName") String nickName);

    /**
     * 新增用户信息
     * @param user 用户信息
     */
    void saveUser(AppUser user);
}
