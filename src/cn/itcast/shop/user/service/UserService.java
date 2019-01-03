/**
 *
 */
package cn.itcast.shop.user.service;

import cn.itcast.shop.user.dao.UserDao;
import cn.itcast.shop.user.vo.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 用户模块业务层代码
 * @Author: chenyihong
 * @Date: 2019年1月3日
 */
@Transactional
public class UserService {

    //注入UserDao
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //按用户名查询用户的方法
    public User findByUsername(String username) {
        return userDao.findByUserName(username);
    }

    //业务层完成用户注册代码
    public void save(User user) {
        // TODO day01 part11 2:02
    }
}
