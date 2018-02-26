package com;

import com.zy.IDepartment;
import com.zy.IUser;

import java.lang.reflect.InvocationTargetException;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User();
        Department department = new Department();

        //生成某数据库的用户表
        IUser iUser = DataAccess.CreateUser();
        iUser.Insert(user);

        //生成部门表
        IDepartment iDepartment = DataAccess.CreateDep();
        iDepartment.Insert(department);



    }
}
