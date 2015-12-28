package com.fy.wisdom.mongo.dao;

import com.fy.wisdom.mongo.entity.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ltzm01 on 2015/12/28.
 */
public interface UserRepository extends MongoRepository<UserInfo,Long>{
}
