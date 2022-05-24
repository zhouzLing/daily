package com.tencent.wxcloudrun.service.impl.theme;

import com.tencent.wxcloudrun.dao.theme.UserMapper;
import com.tencent.wxcloudrun.model.AppUser;
import com.tencent.wxcloudrun.service.theme.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author zhouzl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public AppUser getUserInfo(String nickName, String avatarUrl) {
        AppUser appUser = userMapper.getUserInfo(nickName);
        if (Objects.isNull(appUser)){
            //保存用户信息
            appUser = new AppUser();
            appUser.setAvatarUrl(avatarUrl);
            appUser.setNickName(nickName);
            userMapper.saveUser(appUser);
            appUser = userMapper.getUserInfo(nickName);
        }

        return appUser;
    }
}
