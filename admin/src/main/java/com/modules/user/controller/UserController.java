package com.modules.user.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.modules.buyer.entity.BuyerEntity;
import com.modules.buyer.service.IBuyerService;
import com.modules.shop.entity.ShopEntity;
import com.modules.shop.service.IShopService;
import com.modules.user.dto.UserDo;
import com.modules.user.entity.UserEntity;
import com.modules.user.service.IUserService;
import com.yph.annotation.Pmap;
import com.yph.param.RedisParamenter;
import com.yph.param.SystemParam;
import com.yph.redis.service.RedisService;
import com.yph.util.P;
import com.yph.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author
 * @since 2021-06-01
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    IUserService userService;

    @Autowired
    IShopService shopService;

    @Autowired
    IBuyerService buyerService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/login")
    public R login(@Pmap P p) {
        UserEntity one = userService.getOne(new QueryWrapper<UserEntity>().eq("username", p.getString("userName")));
        if (one == null) {
            return R.error("用户不存在");
        }
        if (!one.getPassword().equals(p.getString("password"))) {
            return R.error("密码错误");
        }
        UserDo userDo = new UserDo();
        if (one.getType().intValue() == 1) {
            ShopEntity user_id = shopService.getOne(new QueryWrapper<ShopEntity>().eq("user_id", one.getUserId()));
            userDo.setShopEntity(user_id);
        } else if (one.getType().intValue() == 2) {
            BuyerEntity user_id = buyerService.getOne(new QueryWrapper<BuyerEntity>().eq("user_id", one.getUserId()));
           userDo.setBuyerEntity(user_id);
        }
        userDo.setUserEntity(one);
        redisService.set(RedisParamenter.USER_REDIS_LOGIN_KEY+one.getUserId(),userDo);
        p.getResponse().addCookie(new Cookie(SystemParam.LOGIN_COOKIE_KEY, one.getUserId().toString()));
        return R.success();
    }

}
