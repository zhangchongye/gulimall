package com.zcy.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zcy.gulimall.product.entity.BrandEntity;
import com.zcy.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setName("aaa");
//        brandEntity.setDescript("fffffffff");
//        brandEntity.setBrandId(1L);
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

//        brandService.updateById(brandEntity);

        QueryWrapper<BrandEntity> brandId = new QueryWrapper<BrandEntity>().eq("brand_id", "1");
        List<BrandEntity> list =brandService.list(brandId);

        System.out.println("查询成功");
        list.stream().forEach(System.out::println);
    }

}
