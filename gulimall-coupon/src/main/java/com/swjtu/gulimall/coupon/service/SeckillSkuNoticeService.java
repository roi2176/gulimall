package com.swjtu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjtu.common.utils.PageUtils;
import com.swjtu.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 14:42:33
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

