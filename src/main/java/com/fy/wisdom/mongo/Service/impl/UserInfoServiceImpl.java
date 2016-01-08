package com.fy.wisdom.mongo.Service.impl;

import com.fy.wisdom.mongo.Service.UserInfoService;
import com.fy.wisdom.mongo.dao.UserRepository;
import com.fy.wisdom.mongo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ltzm01 on 2015/12/28.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserRepository repository;
    @Override
    public UserInfo saveUserInfo(UserInfo userInfo) {
        return repository.insert(userInfo);
    }

    public List<UserInfo> findAll(){
        return repository.findAll();
    }
}
