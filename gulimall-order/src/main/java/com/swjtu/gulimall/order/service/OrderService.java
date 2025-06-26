package com.swjtu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjtu.common.utils.PageUtils;
import com.swjtu.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 15:09:53
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

