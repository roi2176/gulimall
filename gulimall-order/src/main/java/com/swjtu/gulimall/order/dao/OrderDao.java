package com.swjtu.gulimall.order.dao;

import com.swjtu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 15:09:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
