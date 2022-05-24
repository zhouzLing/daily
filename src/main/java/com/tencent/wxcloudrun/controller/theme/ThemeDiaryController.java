package com.tencent.wxcloudrun.controller.theme;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.controller.CounterController;
import com.tencent.wxcloudrun.dao.theme.ThemeDiaryMapper;
import com.tencent.wxcloudrun.model.ThemeDiary;
import com.tencent.wxcloudrun.service.impl.theme.ThemeDiaryServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public ApiResponse getThemeList(Long userId){
        List<ThemeDiary> themeDiaries = themeDiaryService.getThemeList(userId);
        return  ApiResponse.ok(themeDiaries);
    }
}
