package cn.itcast.dao;

import cn.itcast.domain.LinkMan;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class LinkManDaoImpl extends HibernateDaoSupport implements LinkManDao {

  @Override
  public void add(LinkMan linkMan) {
    this.getHibernateTemplate().save(linkMan);
  }

  //显示全部数据的list
  @Override
  public List<LinkMan> list() {
    return (List<LinkMan>) this.getHibernateTemplate().find("from LinkMan");
  }

  //查找
  @Override
  public LinkMan findOne(Integer linkid) {
    return this.getHibernateTemplate().get(LinkMan.class, linkid);
  }

  //修改联系人
  @Override
  public void update(LinkMan linkMan) {
    this.getHibernateTemplate().update(linkMan);
  }

  @Override
  public List<LinkMan> findCondition(LinkMan linkMan) {
    String hql = "from LinkMan where 1=1";
    List<Object> p = new ArrayList<Object>();
    if (linkMan.getLkmName() != null && !"".equals(linkMan.getLkmName())) {
      hql += " and lkmName=?";
      p.add(linkMan.getLkmName());
    }
    if (linkMan.getCustomer().getCid() != null && linkMan.getCustomer().getCid() > 0) {
      hql += " and customer.cid=?";
      p.add(linkMan.getCustomer().getCid());
    }
    return (List<LinkMan>) this.getHibernateTemplate().find(hql, p.toArray());
  }

  @Override
  public void delete(LinkMan linkMan) {
    this.getHibernateTemplate().delete(linkMan);
  }


}
