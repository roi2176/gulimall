package com.swjtu.gulimall.product.dao;

import com.swjtu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author roi
 * @email sunlightcs@gmail.com
 * @date 2025-06-25 00:02:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
