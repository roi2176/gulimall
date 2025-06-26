package com.swjtu.gulimall.coupon.dao;

import com.swjtu.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 14:42:33
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
