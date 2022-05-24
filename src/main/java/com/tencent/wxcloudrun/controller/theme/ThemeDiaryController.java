package com.tencent.wxcloudrun.controller.theme;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.ThemeDiary;
import com.tencent.wxcloudrun.service.impl.theme.ThemeDiaryServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @author zhouzl
 * 记账记录信息
 */
@RestController
public class ThemeDiaryController {
    final Logger  logger = LoggerFactory.getLogger(CounterController .class);
    @Autowired
    private ThemeDiaryServiceImpl themeDiaryService;

    @GetMapping(value = "/theme/list")
    public ApiResponse getThemeList(@RequestParam("userId") Long userId){
        List<ThemeDiary> themeDiaries = themeDiaryService.getThemeList(userId);
        return  ApiResponse.ok(themeDiaries);
    }

    @PostMapping(value = "/theme/save")
    public ApiResponse saveTheme(@RequestBody ThemeDiary themeDiary){
        try {
            if (null != themeDiary){
                themeDiaryService.saveTheme(themeDiary);
            }
        }catch (Exception e){
            ApiResponse.error(e.getMessage());
        }
        return ApiResponse.ok();
    }

}
