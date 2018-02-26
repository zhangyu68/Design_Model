package com.zy;

import com.Department;

public class SqlserverDep implements IDepartment {
    @Override
    public void Insert(Department department) {
        System.out.println("sql部门插入成功");
    }

    @Override
    public Department GetDepartment(int id) {
        System.out.println(id+"号部门");
        return null;
    }
}
