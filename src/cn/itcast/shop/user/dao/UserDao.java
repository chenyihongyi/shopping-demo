/**
 * 
 */
package cn.itcast.shop.user.dao;

import cn.itcast.shop.user.vo.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * 用户模块持久层代码
 * @Description: 
 * @Author: chenyihong
 * @Date: 2019年1月3日
 */
public class UserDao extends HibernateDaoSupport {
    //按名次查询是否有该用户；
    public User findByUserName(String username) {
        String hql = "from User where username = ?";
        List<User> list = this.getHibernateTemplate().find(hql, username);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

}
