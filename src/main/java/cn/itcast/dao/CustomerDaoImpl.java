package cn.itcast.dao;

import cn.itcast.domain.Customer;
import cn.itcast.domain.Dict;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder.In;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao {

  //添加客户
//  @Override
//  public void add(Customer customer) {
//    this.getHibernateTemplate().save(customer);
//  }

  //客户列表
//  @SuppressWarnings("all")
//  @Override
//  public List<Customer> finAll() {
//    return (List<Customer>) this.getHibernateTemplate().find("from Customer");
//  }

  //根据id查询
//  @Override
//  public Customer findOne(Integer cid) {
//    return this.getHibernateTemplate().get(Customer.class, cid);
//  }

  //删除用户
//  @Override
//  public void delete(Customer c) {
//    this.getHibernateTemplate().delete(c);
//  }

//  @Override
//  public void update(Customer customer) {
//    this.getHibernateTemplate().update(customer);
//  }

  @SuppressWarnings("all")
  public List<Customer> findPage(Integer begin, Integer pageSize) {
//    方式一:使用底层session实现
//    SessionFactory sessionFactory = this.getHibernateTemplate().getSessionFactory();
//    Session session = sessionFactory.getCurrentSession();
//    Query query = session.createQuery("from Customer");
//    query.setFirstResult(begin);
//    query.setMaxResults(pageSize);
//    List<Customer> list = query.list();
//    方式二：使用离线对象和hibernate模板事项
    DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
    List<Customer> list = (List<Customer>) this.getHibernateTemplate()
        .findByCriteria(detachedCriteria, begin, pageSize);
    return list;
  }

  @SuppressWarnings("all")
  public Integer findCount() {
    List<Object> list = (List<Object>) this.getHibernateTemplate()
        .find("select count(*) from Customer");
    if (list != null && list.size() != 0) {
      Object obj = list.get(0);
      Long lobj = (Long) obj;
      Integer count = lobj.intValue();
      return count;
    }
    return 0;
  }

  @SuppressWarnings("all")
  public List<Customer> findCondition(Customer customer) {
//    方法一
//    SessionFactory sessionFactory = this.getSessionFactory();
//    Session session = sessionFactory.getCurrentSession();
//    Query query = session.createQuery("from Customer  where custName like ?");
//    query.setParameter(0, "%" + customer.getCustName() + "%");
//    List<Customer> list = query.list();
//    方法二
//    List<Customer> list = (List<Customer>) this.getHibernateTemplate()
//        .find("from Customer  where custName like ?", "%" + customer.getCustName() + "%");
//    方法三
//    离线对象
    DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
    detachedCriteria.add(Restrictions.like("custName", "%" + customer.getCustName() + "%"));
    List<Customer> list = (List<Customer>) this.getHibernateTemplate()
        .findByCriteria(detachedCriteria);
    return list;
  }

  //多条件查询
  @Override
  public List<Customer> findMoreCondition(Customer customer) {
//    方式一：
//    String hql = "from Customer where 1=1";
//    List<Object> p = new ArrayList<Object>();
//    if (customer.getCustName() != null && !"".equals(customer.getCustName())) {
//      hql += "and custName=?";
//      p.add(customer.getCustName());
//    }
//    if (customer.getCustLevel() != null && !"".equals(customer.getCustLevel())) {
//      hql += "and custLevel=?";
//      p.add(customer.getCustLevel());
//    }
//    if (customer.getCustSource() != null && !"".equals(customer.getCustSource())) {
//      hql += "and custSource=?";
//      p.add(customer.getCustSource());
//    }
//    System.out.println("hql:" + hql);
//    System.out.println("List:" + p);
//    return (List<Customer>) this.getHibernateTemplate().find(hql, p.toArray());
//    方式二：
    DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
    if (customer.getCustName() != null && !"".equals(customer.getCustName())) {
      detachedCriteria.add(Restrictions.eq("custName", customer.getCustName()));
    }
    if (customer.getCustLevel().getDname() != null && !""
        .equals(customer.getCustLevel().getDname())) {
      detachedCriteria.add(Restrictions.eq("custLevel", customer.getCustLevel().getDname()));
    }
    if (customer.getCustSource() != null && !"".equals(customer.getCustSource())) {
      detachedCriteria.add(Restrictions.eq("custSource", customer.getCustSource()));
    }
    return (List<Customer>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
  }

  @Override
  public List<Dict> findAllDictLevel() {
    return (List<Dict>) this.getHibernateTemplate().find("from Dict");
  }

  @Override
  public List findCountSource() {
    Session session = this.getSessionFactory().getCurrentSession();
    SQLQuery sqlQuery = session
        .createSQLQuery("SELECT COUNT(*) AS num,custSource FROM t_customer GROUP BY custSource");
    sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
    List list = sqlQuery.list();
    return list;
  }

  @Override
  public List findCountLevel() {
    Session session=this.getSessionFactory().getCurrentSession();
    SQLQuery sqlQuery=session.createSQLQuery(" SELECT c.num,d.dname FROM\n"
        + " (SELECT COUNT(*) AS num,custLevel FROM t_customer GROUP BY custLevel) c,\n"
        + " t_dict d\n"
        + " WHERE c.custLevel=d.id;");
    sqlQuery.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
    List list=sqlQuery.list();
    return list;
  }

}
