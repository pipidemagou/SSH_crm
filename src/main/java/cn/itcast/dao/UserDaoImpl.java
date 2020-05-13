package cn.itcast.dao;

import cn.itcast.domain.User;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

  @SuppressWarnings("all")
  @Override
  public User loginUser(User user) {
    List<User> list = (List<User>) this.getHibernateTemplate()
        .find("from User where username=? and password=?", user.getUsername(), user.getPassword());
    if (list.size() != 0 && list != null) {
      User u = list.get(0);
      return u;
    }
    return null;
  }

  @SuppressWarnings("all")
  @Override
  public List<User> findAll() {
    return (List<User>) this.getHibernateTemplate().find("from User");
  }
}
