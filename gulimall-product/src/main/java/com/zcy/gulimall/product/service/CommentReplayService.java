package com.zcy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcy.common.utils.PageUtils;
import com.zcy.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zcy
 * @email fff@gmail.com
 * @date 2023-12-11 19:42:45
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

