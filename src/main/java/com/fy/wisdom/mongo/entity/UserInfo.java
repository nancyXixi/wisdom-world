package com.fy.wisdom.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by feiyu on 2015/12/28.
 * @Document表示待持久化的数据是一个集合。如果集合没有指定名字，那么默认会使用实体类的类名作为集合名。
 */
@Document(collection = "user_info")
public class UserInfo {

    //@Id表示被注解的域被映射到集合中的_id列。如果实体类中未使用此注释，那么默认名为id的域会被映射到集合中的_id列。
    // 而且此域的值由MongoDB的驱动包自动产生，它的值在在POJO中是不可用的。
    @Id
    private String userId;
    private String userName;
    private int age;

    public UserInfo() {
    }

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
