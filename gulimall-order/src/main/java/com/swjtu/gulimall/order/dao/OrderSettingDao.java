package com.swjtu.gulimall.order.dao;

import com.swjtu.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 15:09:53
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
