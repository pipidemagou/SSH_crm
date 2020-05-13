package cn.itcast.dao;

import cn.itcast.domain.LinkMan;
import java.util.List;

public interface LinkManDao {

  void add(LinkMan linkMan);

  List<LinkMan> list();

  LinkMan findOne(Integer linkid);

  void update(LinkMan linkMan);

  List<LinkMan> findCondition(LinkMan linkMan);

  void delete(LinkMan linkMan);
}
