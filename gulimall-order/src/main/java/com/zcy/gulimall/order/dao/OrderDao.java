package com.zcy.gulimall.order.dao;

import com.zcy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zcy
 * @email fff@gmail.com
 * @date 2023-12-12 20:04:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
