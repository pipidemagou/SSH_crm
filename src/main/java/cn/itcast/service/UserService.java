package cn.itcast.service;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserService {

  private UserDao userDao;

  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }

  public User loginUser(User user) {
    return userDao.loginUser(user);
  }

  public List<User> finaAll() {
    return userDao.findAll();
  }
}
