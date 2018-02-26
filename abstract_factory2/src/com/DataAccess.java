package com;

import com.zy.IDepartment;
import com.zy.IUser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DataAccess {
    private static String db = "com.zy.Sqlserver";

    public static IUser CreateUser() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       Class cls = Class.forName(db+"User");
       Constructor c = cls.getConstructor();
       IUser iUser = (IUser)c.newInstance();
       return iUser;
    }

    public static IDepartment CreateDep() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class cls = Class.forName("com.zy.SqlserverDep");
        Constructor c = cls.getConstructor();
        IDepartment iDepartment = (IDepartment)c.newInstance();
        return  iDepartment;
    }
}
