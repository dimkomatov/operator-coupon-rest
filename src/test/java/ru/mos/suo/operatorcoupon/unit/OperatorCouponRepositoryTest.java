package ru.mos.suo.operatorcoupon.unit;

import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import ru.mos.suo.operatorcoupon.dto.CouponDTO;
import ru.mos.suo.operatorcoupon.model.Coupon;
import ru.mos.suo.operatorcoupon.repository.OperatorCouponRepository;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class OperatorCouponRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private OperatorCouponRepository operatorCouponRepository;

    @Test
    public void controllerTest() throws JSONException {

        Coupon coupon = new Coupon(1L,"1",new Date(),"1","1","1","1","1","1",new Date());
        
        entityManager.persist(coupon);
        entityManager.flush();

        CouponDTO found = operatorCouponRepository.findLastCoupon(coupon.getOperatorEmail());

        Assert.assertEquals(found.getCallIdSuo(),coupon.getCallIdSuo());
        System.out.println("1. Expected: " + found.getCallIdSuo()+ " Actual:" + coupon.getCallIdSuo());
        Assert.assertEquals(found.getCouponNumber(),coupon.getCouponNumber());
        System.out.println("2. Expected: " + found.getCouponNumber()+ " Actual:" + coupon.getCouponNumber());

    }

}
