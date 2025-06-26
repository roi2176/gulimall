package com.swjtu.gulimall.member.dao;

import com.swjtu.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 15:00:50
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
