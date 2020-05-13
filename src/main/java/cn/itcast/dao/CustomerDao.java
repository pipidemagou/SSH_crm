package cn.itcast.dao;

import cn.itcast.domain.Customer;
import cn.itcast.domain.Dict;
import java.util.List;

public interface CustomerDao extends BaseDao<Customer> {

//  void add(Customer customer);

//  List<Customer> finAll();

//  Customer findOne(Integer cid);

//  void delete(Customer c);

  //  void update(Customer customer);

  Integer findCount();

  List<Customer> findPage(Integer begin, Integer pageSize);

  List<Customer> findCondition(Customer customer);

  List<Customer> findMoreCondition(Customer customer);


  List<Dict> findAllDictLevel();

  List findCountSource();

  List findCountLevel();
}
