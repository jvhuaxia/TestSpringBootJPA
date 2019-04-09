package com.jvhuaxia.studyjpa.dao;

import com.jvhuaxia.studyjpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

  User getByName(String name);
}
