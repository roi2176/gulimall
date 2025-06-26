package com.swjtu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjtu.common.utils.PageUtils;
import com.swjtu.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 15:16:50
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

