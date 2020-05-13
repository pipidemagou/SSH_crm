package cn.itcast.service;

import cn.itcast.dao.CustomerDaoImpl;
import cn.itcast.domain.Customer;
import cn.itcast.domain.Dict;
import cn.itcast.domain.PageBean;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class CustomerService {

  private CustomerDaoImpl customerDao;

  public void setCustomerDao(CustomerDaoImpl customerDao) {
    this.customerDao = customerDao;
  }

  public void add(Customer customer) {
    customerDao.add(customer);
  }

  public List<Customer> findAll() {
    return customerDao.findAll();
  }

  public Customer findOne(Integer cid) {
    return customerDao.findOne(cid);
  }

  public void delete(Customer c) {
    customerDao.delete(c);
  }

  public void update(Customer customer) {
    customerDao.update(customer);
  }

  public PageBean listpage(Integer currentPage) {
    PageBean pageBean = new PageBean();
    pageBean.setCurrentPage(currentPage);
//    总的记录数
    Integer totalCount = customerDao.findCount();
    pageBean.setTotalCount(totalCount);
//    每页显示的条数
    Integer pageSize = 6;
//    总的页数
    Integer totalPage;
    if (totalCount % pageSize == 0) {
      totalPage = totalCount / pageSize;
    } else {
      totalPage = totalCount / pageSize + 1;
    }
    pageBean.setTotalPage(totalPage);
    Integer begin = (currentPage - 1) * pageSize;
    List<Customer> list = customerDao.findPage(begin, pageSize);
    pageBean.setList(list);
    return pageBean;
  }

  public List<Customer> findCondition(Customer customer) {
    return customerDao.findCondition(customer);
  }

  public List<Customer> findMoreCondition(Customer customer) {
    return customerDao.findMoreCondition(customer);
  }

  public List<Dict> findAllDictLevel() {
    return customerDao.findAllDictLevel();
  }

  public List findCountSource() {
    return customerDao.findCountSource();
  }

  public List findCountLevel() {
    return customerDao.findCountLevel();
  }
}
