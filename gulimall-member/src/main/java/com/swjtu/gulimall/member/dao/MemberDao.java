package com.swjtu.gulimall.member.dao;

import com.swjtu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-26 15:00:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
