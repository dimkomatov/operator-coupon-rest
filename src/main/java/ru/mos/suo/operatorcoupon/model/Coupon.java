package ru.mos.suo.operatorcoupon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="suo_aismfc_coupon")
public class Coupon implements Serializable {

    private static final int serialVersionUID = 1;

    @Id
    private Long mid;

    @Column(name="msgid")
    private String msgId;

    private Date msgdate;

    @Column(name = "operatoremail")
    private String operatorEmail;

    @Column(name = "couponnumber")
    private String couponNumber;

    @Column(name="operatorid")
    private String operatorId;

    @Column(name="servicetypecodesuo")
    private String serviceTypeCodeSuo;

    @Column(name="servicetypenamesuo")
    private String serviceTypeNameSuo;

    @Column(name="callidsuo")
    private String callIdSuo;

    private Date created;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Date getMsgdate() {
        return msgdate;
    }

    public void setMsgdate(Date msgdate) {
        this.msgdate = msgdate;
    }

    public String getOperatorEmail() {
        return operatorEmail;
    }

    public void setOperatorEmail(String operatorEmail) {
        this.operatorEmail = operatorEmail;
    }

    public String getCouponNumber() {
        return couponNumber;
    }

    public void setCouponNumber(String couponNumber) {
        this.couponNumber = couponNumber;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getServiceTypeCodeSuo() {
        return serviceTypeCodeSuo;
    }

    public void setServiceTypeCodeSuo(String serviceTypeCodeSuo) {
        this.serviceTypeCodeSuo = serviceTypeCodeSuo;
    }

    public String getServiceTypeNameSuo() {
        return serviceTypeNameSuo;
    }

    public void setServiceTypeNameSuo(String serviceTypeNameSuo) {
        this.serviceTypeNameSuo = serviceTypeNameSuo;
    }

    public String getCallIdSuo() {
        return callIdSuo;
    }

    public void setCallIdSuo(String callIdSuo) {
        this.callIdSuo = callIdSuo;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Coupon(Long mid, String msgId, Date msgdate, String operatorEmail, String couponNumber, String operatorId, String serviceTypeCodeSuo, String serviceTypeNameSuo, String callIdSuo, Date created) {
        this.mid = mid;
        this.msgId = msgId;
        this.msgdate = msgdate;
        this.operatorEmail = operatorEmail;
        this.couponNumber = couponNumber;
        this.operatorId = operatorId;
        this.serviceTypeCodeSuo = serviceTypeCodeSuo;
        this.serviceTypeNameSuo = serviceTypeNameSuo;
        this.callIdSuo = callIdSuo;
        this.created = created;
    }

    public Coupon() {}
}
