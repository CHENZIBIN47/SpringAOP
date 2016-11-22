package cn.chan.service.impl;

import cn.chan.dao.UserDao;
import cn.chan.entity.User;
import cn.chan.service.UserService;

/**
 * Created by Administrator on 2016/11/22.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }
}
