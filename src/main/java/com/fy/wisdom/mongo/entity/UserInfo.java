package com.fy.wisdom.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by feiyu on 2015/12/28.
 */
@Document(collection = "user_info")
public class UserInfo {

    @Id
    private String userId;
    private String userName;
    private int age;

    public UserInfo(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "user[id=%s, firstName='%s', lastName='%s']",
                userId, userName, age);
    }
}
