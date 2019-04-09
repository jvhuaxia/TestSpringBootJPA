package com.jvhuaxia.studyjpa.pojo;

import java.util.StringJoiner;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  private Long id;
  @Column(length = 32)
  private String name;
  @Column(length = 32)
  private String account;
  @Column(length = 64)
  private String pwd;


  public User(Long id, String name, String account, String pwd) {
    this.id = id;
    this.name = name;
    this.account = account;
    this.pwd = pwd;
  }

  public User() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .add("name='" + name + "'")
        .add("account='" + account + "'")
        .add("pwd='" + pwd + "'")
        .toString();
  }
}
