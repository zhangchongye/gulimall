package com.zcy.gulimall.product.dao;

import com.zcy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zcy
 * @email fff@gmail.com
 * @date 2023-12-11 19:42:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
