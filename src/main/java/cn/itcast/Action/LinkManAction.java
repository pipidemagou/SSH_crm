package cn.itcast.Action;

import cn.itcast.domain.Customer;
import cn.itcast.domain.LinkMan;
import cn.itcast.service.CustomerService;
import cn.itcast.service.LinkManService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.aspectj.util.FileUtil;


public class LinkManAction extends ActionSupport implements ModelDriven<LinkMan> {

  //依赖注入的属性
  private LinkManService linkManService;
  private CustomerService customerService;
  //  模型驱动封装的对象
  private LinkMan linkMan = new LinkMan();
  //上传文件
//  名称和前端name值要一致
  private File upload;
  //名称=前端name+"FileName"
  //文件名称
  private String uploadFileName;

  //依赖注入
  public void setLinkManService(LinkManService linkManService) {
    this.linkManService = linkManService;
  }

  //依赖注入
  public void setCustomerService(CustomerService customerService) {
    this.customerService = customerService;
  }

  public LinkManService getLinkManService() {
    return linkManService;
  }

  public File getUpload() {
    return upload;
  }

  public void setUpload(File upload) {
    this.upload = upload;
  }

  public String getUploadFileName() {
    return uploadFileName;
  }

  public void setUploadFileName(String uploadFileName) {
    this.uploadFileName = uploadFileName;
  }

  //模型驱动封装
  @Override
  public LinkMan getModel() {
    return linkMan;
  }

  //到新增联系人的页面
  public String toAddPage() {
//    需要把所有客户的list传到页面中
    List<Customer> list = customerService.findAll();
    ServletActionContext.getRequest().setAttribute("listCustomer", list);
    return "toAddPage";
  }

  //添加联系人
  public String addLinkMan() throws IOException {
    if (upload != null) {
      File serverFile = new File("E:\\SSh_crm_img" + "/" + uploadFileName);
      FileUtils.copyFile(upload, serverFile);
//      但是sturts上传文件最大为2M，可以在sturts中设置常量
//        <constant name="struts.multipart.maxSize" value="209715200"/>
//      如果还是超过了最大容量，struts会自动返回"input",所以在struts配置文件配置就好了
    }
//linkman的数据是可以通过模型驱动封装的，但是cid不行，因为在linkman中是没有这个字段，所以要把cid封装到linkman中的customer中
//    方式一：原始方法
//    String scid = ServletActionContext.getRequest().getParameter("cid");
//    Integer cid = Integer.parseInt(scid);
//    Customer customer = new Customer();
//    customer.setCid(cid);
//    linkMan.setCustomer(customer);
//    方式二：<select name="customer.cid">
    linkManService.addLinkMan(linkMan);
//    上传文件（流）
//    上传文件名称
//    定义成员变量：一个表示上传文件，一个表示文件名称
//    生成get和set方法
    return "addLinkMan";
  }

  //  联系人列表
  public String list() {
    List<LinkMan> list = linkManService.listLinkMan();
    ServletActionContext.getRequest().setAttribute("list", list);
//    会出现no session问题
//    解决：
//    (1):让session延迟关闭，在action操作之后在关闭
//    (2):过滤器中配置session的关闭
    return "list";
  }

  //回显所有的客户名称，到修改页面
  public String showLinkMan() {
//    模型驱动封装
    Integer linkid = linkMan.getLinkid();
    LinkMan linkMan = linkManService.findOne(linkid);
    List<Customer> customerList = customerService.findAll();
//    放到域对象
    ServletActionContext.getRequest().setAttribute("linkman", linkMan);
    ServletActionContext.getRequest().setAttribute("listCustomer", customerList);
    return "showLinkMan";
  }

  //修改数据
  public String updateLinkMan() {
    linkManService.updateLink(linkMan);
    return "updateLinkMan";
  }

  //显示可选择的用户
  public String toSelectPage() {
    List<Customer> list = customerService.findAll();
    ServletActionContext.getRequest().setAttribute("list", list);
    return "toSelectPage";
  }

  //  多条件查询
  public String moreCondition() {
    List<LinkMan> list = linkManService.findCondition(linkMan);
    ServletActionContext.getRequest().setAttribute("list", list);
    return "moreCondition";
  }
  public String delete(){
    Integer linkid=linkMan.getLinkid();
    LinkMan linkMan=this.linkManService.findOne(linkid);
    this.linkManService.delete(linkMan);
    return "delete";
  }
}
