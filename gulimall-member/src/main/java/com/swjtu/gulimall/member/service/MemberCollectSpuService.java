package com.swjtu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjtu.common.utils.PageUtils;
import com.swjtu.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 15:00:51
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

