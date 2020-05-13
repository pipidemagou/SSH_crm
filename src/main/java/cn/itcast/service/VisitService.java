package cn.itcast.service;

import cn.itcast.dao.VisistDao;
import cn.itcast.domain.Visit;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class VisitService {

  private VisistDao visistDao;

  public void setVisistDao(VisistDao visistDao) {
    this.visistDao = visistDao;
  }

  public void addVisit(Visit visit) {
    visistDao.add(visit);
  }

  public List<Visit> findAll() {
    return visistDao.findAll();
  }

  public List<Visit> moreCondition(Visit visit) {
    return visistDao.moreCondition(visit);
  }
}
