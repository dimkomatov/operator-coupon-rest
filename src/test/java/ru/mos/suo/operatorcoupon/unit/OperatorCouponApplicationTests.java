package ru.mos.suo.operatorcoupon;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.mos.suo.operatorcoupon.dto.CouponDTO;
import ru.mos.suo.operatorcoupon.model.Coupon;
import ru.mos.suo.operatorcoupon.repository.OperatorCouponRepository;

import java.util.Date;

@RunWith(SpringRunner.class)
@DataJpaTest
//@SpringBootTest
class OperatorCouponApplicationTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private OperatorCouponRepository operatorCouponRepository;


    @Test
    public void getFromReporitoryTest() {
        Coupon coupon = new Coupon(1L,"1", new Date(),"1","1","1",
                "1","1","1", new Date());
        entityManager.persist(coupon);
        entityManager.flush();

        CouponDTO found = operatorCouponRepository.findLastCoupon(coupon.getOperatorEMail());

        Assert.assertEquals(found.getCallIdSuo(),coupon.getCallIdSuo());
        Assert.assertEquals(found.getCouponNumber(),coupon.getCouponNumber());

    }

}
