package com.fy.wisdom.mongo.dao;

import com.fy.wisdom.mongo.entity.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ltzm01 on 2015/12/28.
 */
@Repository
public interface UserRepository extends MongoRepository<UserInfo,String>{

}
