package com.zcy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zcy.common.utils.PageUtils;
import com.zcy.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author zcy
 * @email fff@gmail.com
 * @date 2023-12-12 19:50:09
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

