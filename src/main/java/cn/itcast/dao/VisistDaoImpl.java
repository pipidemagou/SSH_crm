package cn.itcast.dao;

import cn.itcast.domain.Customer;
import cn.itcast.domain.Visit;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class VisistDaoImpl extends HibernateDaoSupport implements VisistDao {

  //添加客户拜访方法
  @Override
  public void add(Visit visit) {
    this.getHibernateTemplate().save(visit);
  }

  @SuppressWarnings("all")
  @Override
  public List<Visit> findAll() {
    return (List<Visit>) this.getHibernateTemplate().find("from Visit ");
  }

  @Override
  public List<Visit> moreCondition(Visit visit) {
    DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Visit.class);
    if (visit.getUser().getId() != null && visit.getUser().getId() > 0) {
      detachedCriteria.add(Restrictions.eq("user.id", visit.getUser().getId()));
    }
    if (visit.getCustomer().getCid() != null && visit.getCustomer().getCid() > 0) {
      detachedCriteria.add(Restrictions.eq("customer.cid", visit.getCustomer().getCid()));
    }
    return (List<Visit>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
  }
}
