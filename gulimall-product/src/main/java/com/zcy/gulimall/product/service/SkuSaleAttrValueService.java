package com.zcy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcy.common.utils.PageUtils;
import com.zcy.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author zcy
 * @email fff@gmail.com
 * @date 2023-12-11 19:42:45
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

