package com.zcy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcy.common.utils.PageUtils;
import com.zcy.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author zcy
 * @email fff@gmail.com
 * @date 2023-12-12 19:50:09
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

