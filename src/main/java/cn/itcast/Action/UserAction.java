package cn.itcast.Action;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;


public class UserAction extends ActionSupport {

  private UserService userService;

  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  private String username;
  private String password;

  public UserService getUserService() {
    return userService;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  //登陆方法
  public String login() {
    //封装到实体类对象
    User user = new User();
    user.setPassword(password);
    user.setUsername(username);
    User userExist = userService.loginUser(user);
    if (userExist != null) {//成功
      HttpServletRequest httpServlet = ServletActionContext.getRequest();
      httpServlet.getSession().setAttribute("user", userExist);
      return "loginsuccess";
    } else {//失败
      return "login";
    }
  }
}
