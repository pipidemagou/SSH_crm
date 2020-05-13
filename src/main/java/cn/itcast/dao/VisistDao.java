package cn.itcast.dao;

import cn.itcast.domain.Visit;
import java.util.List;

public interface VisistDao {

  void add(Visit visit);

  List<Visit> findAll();

  List<Visit> moreCondition(Visit visit);
}
