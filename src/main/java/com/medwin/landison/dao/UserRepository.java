package com.medwin.landison.dao;

import com.medwin.landison.entity.LdsUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


/**
 * Created by medwin on 2018/10/24.
 */
public interface UserRepository extends JpaRepository<LdsUserEntity,Long> {

    LdsUserEntity findByUsername(String username);

    @Modifying
    @Transactional(readOnly = false)
    @Query("update  LdsUserEntity u set u.info = :info, u.loginNum=u.loginNum+1,u.lastLoginTime=:time,u.updateTime=:time where u.username = :username")
    int loginUser(@Param("username")String username, @Param("info")String info, @Param("time")Date time);
}
