package com.huarui.dao.impl;

import com.huarui.dao.UsersDao;
import com.huarui.entity.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/3.
 */
//自动找错误的快借鉴  alt+enter
public class UserDaoImpl implements UsersDao{
    @Override
    public List<Users> findall() {
        List<Users> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            Users users = new Users();
            users.setUid(i);
            users.setUname("zoukx"+i);
            list.add(users);
        }
        return list;
    }
}
