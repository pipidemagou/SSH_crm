package cn.itcast.Action;

import cn.itcast.domain.Customer;
import cn.itcast.domain.Dict;
import cn.itcast.domain.PageBean;
import cn.itcast.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.List;
import org.apache.struts2.ServletActionContext;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

  private CustomerService customerService;

  //  模型驱动分装，前提：表单输入项的名字和属性名字一致
  private Customer customer = new Customer();

  @Override
  public Customer getModel() {
    return customer;
  }

  public void setCustomerService(CustomerService customerService) {
    this.customerService = customerService;
  }

  //到添加customer的页面
  public String toAddPage() {
    List<Dict> list=customerService.findAllDictLevel();
    ServletActionContext.getRequest().setAttribute("list",list);
    return "toAddPage";
  }

  //添加用户
  public String add() {
    customerService.add(customer);
    return "add";
  }

  private List<Customer> list;

  public List<Customer> getList() {
    return list;
  }

  //  显示客户列表
  public String list() {
//    放到域对象
//    List<Customer> list = customerService.findAll();
//    ServletActionContext.getRequest().setAttribute("list", list);
//    放到值栈
    list = customerService.findAll();
    return "list";
  }

  //删除的方法
  public String delete() {
//    使用模型驱动获取表单提交cid值
//    先根据cid查询，在把获取的Customer删除，不然多表的级联删除就不行了
    Integer cid = customer.getCid();
    System.out.println(cid);
//    查询
    Customer c = customerService.findOne(cid);
//    删除
    System.out.println(customer.toString());
    customerService.delete(c);
    return "delete";
  }

  //  修改的方法
  public String showCustomer() {
    Integer cid = customer.getCid();
    Customer c = customerService.findOne(cid);
    List<Dict> list=customerService.findAllDictLevel();
    ServletActionContext.getRequest().setAttribute("customer", c);
    ServletActionContext.getRequest().setAttribute("listDict",list);
    return "showCustomer";
  }

  public String update() {
    customerService.update(customer);
    return "update";
  }

  //  分页
  private Integer currentPage;

  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }

  public String listpage() {
    PageBean pageBean = customerService.listpage(currentPage);
    ServletActionContext.getRequest().setAttribute("pageBean", pageBean);
    return "listpage";
  }

  //单条件查询
  public String listCondition() {
    if (customer.getCustName() != null && !"".equals(customer.getCustName())) {
      List<Customer> list = customerService.findCondition(customer);
      ServletActionContext.getRequest().setAttribute("list", list);
    } else {
      list = customerService.findAll();
    }
    return "listCondition";
  }

  //到多条件查询的页面
  public String toSelectCustomerPage() {
    return "toSelectCustomerPage";
  }
//  多条件查询
  public String moreCondition(){
    List<Customer> list=customerService.findMoreCondition(customer);
    ServletActionContext.getRequest().setAttribute("list",list);
    return "moreCondition";
  }
  public String countSource(){
    List list=customerService.findCountSource();
    ServletActionContext.getRequest().setAttribute("list",list);
    return "countSource";
  }
  public String countLevel(){
    List list=customerService.findCountLevel();
    ServletActionContext.getRequest().setAttribute("list",list);
    return "countLevel";
  }
}
