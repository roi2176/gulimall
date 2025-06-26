package com.swjtu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjtu.common.utils.PageUtils;
import com.swjtu.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 14:42:33
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

