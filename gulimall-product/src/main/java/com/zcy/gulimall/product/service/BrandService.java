package com.zcy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcy.common.utils.PageUtils;
import com.zcy.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author zcy
 * @email fff@gmail.com
 * @date 2023-12-11 19:42:45
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

