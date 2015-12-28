package com.fy.wisdom.mongo.Service.impl;

import com.fy.wisdom.mongo.Service.UserInfoService;
import com.fy.wisdom.mongo.dao.UserRepository;
import com.fy.wisdom.mongo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ltzm01 on 2015/12/28.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserRepository repository;
    @Override
    public void saveUserInfo() {
        repository.insert(new UserInfo("feiyu",20));
    }
}
