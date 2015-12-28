package com.fy.wisdom.mongo.dao.impl;

import com.fy.wisdom.mongo.dao.UserRepository;
import com.fy.wisdom.mongo.entity.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ltzm01 on 2015/12/28.
 */
public class UserRepositoryImpl extends MongoRepository<UserInfo,Long> implements UserRepository {
    
}
