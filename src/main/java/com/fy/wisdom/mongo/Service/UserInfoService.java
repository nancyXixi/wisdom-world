package com.fy.wisdom.mongo.Service;

import com.fy.wisdom.mongo.entity.UserInfo;

import java.util.List;

/**
 * Created by ltzm01 on 2015/12/28.
 */
public interface UserInfoService {
    /**
     * 保存和更新
     * @param userInfo
     * @return
     */
    UserInfo saveUserInfo(UserInfo userInfo);

    /**
     * 查询所有
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 根据id删除
     * @param id
     */
    void deleteById(String id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    UserInfo findById(String id);
}
