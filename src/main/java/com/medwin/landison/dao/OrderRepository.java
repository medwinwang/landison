package com.medwin.landison.dao;

import com.medwin.landison.entity.LdsOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by medwin on 2018/10/24.
 */
public interface OrderRepository extends JpaRepository<LdsOrderEntity,Long> {

    LdsOrderEntity findByOrOrderId(String orderId);
}
