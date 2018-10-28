package com.medwin.landison.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by medwin on 2018/10/24.
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "lds_order", schema = "lds_center", catalog = "")
public class LdsOrderEntity {
    private int id;
    private Integer userId;
    private Date createTime;
    private String info;
    private Date updateTime;
    private String status;
    private String orderId;
    private String reservationType;
    private String payInfo;
    private String payStatus;

    @Basic
    @Column(name = "pay_status")
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    @Basic
    @Column(name = "pay_info")
    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }

    @Basic
    @Column(name = "update_time")
    @LastModifiedDate
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "order_id")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "reservation_type")
    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "create_time")
    @CreatedDate
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LdsOrderEntity entity = (LdsOrderEntity) o;

        if (id != entity.id) return false;
        if (userId != null ? !userId.equals(entity.userId) : entity.userId != null) return false;
        if (createTime != null ? !createTime.equals(entity.createTime) : entity.createTime != null) return false;
        if (info != null ? !info.equals(entity.info) : entity.info != null) return false;
        if (updateTime != null ? !updateTime.equals(entity.updateTime) : entity.updateTime != null) return false;
        if (status != null ? !status.equals(entity.status) : entity.status != null) return false;
        if (orderId != null ? !orderId.equals(entity.orderId) : entity.orderId != null) return false;
        return reservationType != null ? reservationType.equals(entity.reservationType) : entity.reservationType == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (reservationType != null ? reservationType.hashCode() : 0);
        return result;
    }
}
