package com.zy;

import com.User;

public class SqlserverUser implements IUser {
    @Override
    public void Insert(User user) {
        System.out.println("SQL插入成功");
    }

    @Override
    public User GetUser(int id) {
        System.out.println("查询成功");
        return null;
    }
}
