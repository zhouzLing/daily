package com.tencent.wxcloudrun.dao.theme;

import com.tencent.wxcloudrun.model.ThemeDiary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhouzl
 */
@Mapper
public interface ThemeDiaryMapper {

    /**
     * 获取用户记录日记信息列表
     * @return 返回所有信息列表
     */
    List<ThemeDiary> getThemeDiaryList(@Param("userId") Long userId);

    /**
     * 新增日记
     * @param themeDiary 日记内容
     */
    void saveTheme(ThemeDiary themeDiary);
}
