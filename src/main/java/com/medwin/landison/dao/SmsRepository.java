package com.medwin.landison.dao;

import com.medwin.landison.entity.LdsSmsLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by medwin on 2018/10/24.
 */
public interface SmsRepository  extends JpaRepository<LdsSmsLogEntity,Long> {
}
