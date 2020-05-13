package cn.itcast.service;

import cn.itcast.dao.LinkManDao;
import cn.itcast.dao.LinkManDaoImpl;
import cn.itcast.domain.LinkMan;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class LinkManService {

  private LinkManDao linkManDao;

  public void setLinkManDao(LinkManDao linkManDao) {
    this.linkManDao = linkManDao;
  }

  public void addLinkMan(LinkMan linkMan) {
    linkManDao.add(linkMan);
  }

  public List<LinkMan> listLinkMan() {
    return linkManDao.list();
  }

  public LinkMan findOne(Integer linkid) {
    return linkManDao.findOne(linkid);
  }

  public void updateLink(LinkMan linkMan) {
    linkManDao.update(linkMan);
  }

  public List<LinkMan> findCondition(LinkMan linkMan) {
    return linkManDao.findCondition(linkMan);
  }

  public void delete(LinkMan linkMan) {
    linkManDao.delete(linkMan);
  }
}
