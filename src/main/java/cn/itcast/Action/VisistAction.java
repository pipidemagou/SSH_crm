package cn.itcast.Action;

import cn.itcast.domain.Customer;
import cn.itcast.domain.LinkMan;
import cn.itcast.domain.User;
import cn.itcast.domain.Visit;
import cn.itcast.service.CustomerService;
import cn.itcast.service.UserService;
import cn.itcast.service.VisitService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.List;
import org.apache.struts2.ServletActionContext;

public class VisistAction extends ActionSupport implements ModelDriven<Visit> {

  private VisitService visitService;
  private CustomerService customerService;
  private UserService userService;
  private Visit visit = new Visit();

  public void setVisitService(VisitService visitService) {
    this.visitService = visitService;
  }

  public void setCustomerService(CustomerService customerService) {
    this.customerService = customerService;
  }

  public void setUserService(UserService userService) {
    this.userService = userService;
  }

  //添加拜访记录
  public String toAddPage() {
//    查询所有的客户
    List<Customer> listCustomer = customerService.findAll();
//        查询所有的用户
    List<User> listUser = userService.finaAll();
    ServletActionContext.getRequest().setAttribute("listCustomer", listCustomer);
    ServletActionContext.getRequest().setAttribute("listUser", listUser);
    return "toAddPage";
  }

  //添加拜访记录
  public String addVisit() {
    System.out.println(visit.getCustomer().getCid() + visit.getUser().getId());
    visitService.addVisit(visit);
    return "addVisit";
  }

  public String list() {
    List<Visit> list = visitService.findAll();
    ServletActionContext.getRequest().setAttribute("list", list);
    return "list";
  }

  //  到客户拜访记录查询的页面
  public String toSelectPage() {
    List<Customer> listCustomer = customerService.findAll();
    List<User> listUser = userService.finaAll();
    ServletActionContext.getRequest().setAttribute("listCustomer", listCustomer);
    ServletActionContext.getRequest().setAttribute("listUser", listUser);
    return "toSelectPage";
  }

  //  多条件查询拜访记录
  public String moreCondition() {
    List<Visit> list=visitService.moreCondition(visit);
    ServletActionContext.getRequest().setAttribute("list",list);
    return "moreCondition";
  }

  //模型驱动
  @Override
  public Visit getModel() {
    return visit;
  }
}
