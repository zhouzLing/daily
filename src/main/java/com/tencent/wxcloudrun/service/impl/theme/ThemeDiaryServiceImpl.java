package com.tencent.wxcloudrun.service.impl.theme;

import com.tencent.wxcloudrun.dao.theme.ThemeDiaryMapper;
import com.tencent.wxcloudrun.model.ThemeDiary;
import com.tencent.wxcloudrun.service.theme.ThemeDiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouzl
 */
@Service
public class ThemeDiaryServiceImpl implements ThemeDiaryService {
    @Autowired ThemeDiaryMapper themeDiaryMapper;

    @Override
    public List<ThemeDiary> getThemeList(Long userId) {
        return themeDiaryMapper.getThemeDiaryList(userId);
    }
}
