package ru.mos.suo.operatorcoupon.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="suo_aismfc_coupon")
public class Coupon {

    private static final int serialVersionUID = 1;

    @Id
    private Long id;

    private final String msgId;

    private final Date msgDate;

    private final String operatorEMail;

    private final String couponNumber;

    private final String operatorId;

    private final String serviceTypeCodeSuo;

    private final String serviceTypeNameSuo;

    private final String callIdSuo;

    private final Date created;


    public Coupon(String msgId, Date msgDate, String operatorEMail, String couponNumber, String operatorId, String serviceTypeCodeSuo, String serviceTypeNameSuo, String callIdSuo, Date created) {
        this.msgId = msgId;
        this.msgDate = msgDate;
        this.operatorEMail = operatorEMail;
        this.couponNumber = couponNumber;
        this.operatorId = operatorId;
        this.serviceTypeCodeSuo = serviceTypeCodeSuo;
        this.serviceTypeNameSuo = serviceTypeNameSuo;
        this.callIdSuo = callIdSuo;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public String getMsgId() {
        return msgId;
    }

    public Date getMsgDate() {
        return msgDate;
    }

    public String getOperatorEMail() {
        return operatorEMail;
    }

    public String getCouponNumber() {
        return couponNumber;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public String getServiceTypeCodeSuo() {
        return serviceTypeCodeSuo;
    }

    public String getServiceTypeNameSuo() {
        return serviceTypeNameSuo;
    }

    public String getCallIdSuo() {
        return callIdSuo;
    }

    public Date getCreated() {
        return created;
    }
}
