package com.fy.wisdom.mongo.Service;

import com.fy.wisdom.mongo.entity.UserInfo;

import java.util.List;

/**
 * Created by ltzm01 on 2015/12/28.
 */
public interface UserInfoService {
    UserInfo saveUserInfo(UserInfo userInfo);
    List<UserInfo> findAll();
}
