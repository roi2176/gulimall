package com.swjtu.gulimall.product;

import com.swjtu.gulimall.GulimallProductApplication;
import com.swjtu.gulimall.product.entity.BrandEntity;
import com.swjtu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("asus");
		brandService.save(brandEntity);
		System.out.println("保存成功");
	}

}
