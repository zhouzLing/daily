package com.tencent.wxcloudrun.service.theme;

import com.tencent.wxcloudrun.model.ThemeDiary;

import java.util.List;

/**
 * @author zhouzl
 */
public interface ThemeDiaryService {
    /**
     * 获取用户记录日记信息列表
     * @param  userId 用户id
     * @return 返回所有信息列表
     */
    List<ThemeDiary> getThemeList(Long userId);
}
