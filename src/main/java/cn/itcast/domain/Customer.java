package cn.itcast.domain;

import java.util.HashSet;
import java.util.Set;

public class Customer {

  private Integer cid;
  private String custName;
  private String custSource;
  private Dict custLevel;
  private String custPhone;
  private String custMobile;
  private Set<LinkMan> setLinkMan = new HashSet<LinkMan>();
  private Set<Visit> setCusVisit = new HashSet<Visit>();

  public Integer getCid() {
    return cid;
  }

  public void setCid(Integer cid) {
    this.cid = cid;
  }

  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }


  public String getCustSource() {
    return custSource;
  }

  public void setCustSource(String custSource) {
    this.custSource = custSource;
  }

  public String getCustPhone() {
    return custPhone;
  }

  public void setCustPhone(String custPhone) {
    this.custPhone = custPhone;
  }

  public String getCustMobile() {
    return custMobile;
  }

  public void setCustMobile(String custMobile) {
    this.custMobile = custMobile;
  }

  public Set<LinkMan> getSetLinkMan() {
    return setLinkMan;
  }

  public void setSetLinkMan(Set<LinkMan> setLinkMan) {
    this.setLinkMan = setLinkMan;
  }

  public Set<Visit> getSetCusVisit() {
    return setCusVisit;
  }

  public void setSetCusVisit(Set<Visit> setCusVisit) {
    this.setCusVisit = setCusVisit;
  }

  public Dict getCustLevel() {
    return custLevel;
  }

  public void setCustLevel(Dict custLevel) {
    this.custLevel = custLevel;
  }
}
