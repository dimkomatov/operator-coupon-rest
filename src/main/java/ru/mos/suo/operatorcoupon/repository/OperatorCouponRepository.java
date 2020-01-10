package ru.mos.suo.operatorcoupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mos.suo.operatorcoupon.dto.CouponDTO;
import ru.mos.suo.operatorcoupon.model.Coupon;


@Repository
public interface OperatorCouponRepository extends JpaRepository<Coupon, Long> {

    @Query(nativeQuery = true, value="SELECT CouponNumber,CallIdSuo FROM suo_aismfc_coupon where operatorEmail=:operatorLogin order by msgdate desc limit 1")
    CouponDTO findLastCoupon(@Param(value = "operatorLogin")String operatorLogin);

}
