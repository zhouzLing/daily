package com.tencent.wxcloudrun.controller.theme;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.AppUser;
import com.tencent.wxcloudrun.service.impl.theme.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouzl
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping(value = "/user/info")
    public ApiResponse getUserInfo(@RequestParam("nickName") String nickName, @RequestParam("avatarUrl") String avatarUrl){
        AppUser appUser = userService.getUserInfo(nickName, avatarUrl);
        return ApiResponse.ok(appUser);
    }
}
