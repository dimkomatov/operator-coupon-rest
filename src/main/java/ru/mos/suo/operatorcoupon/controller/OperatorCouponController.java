package ru.mos.suo.operatorcoupon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mos.suo.operatorcoupon.dto.CouponDTO;
import ru.mos.suo.operatorcoupon.repository.OperatorCouponRepository;

@RestController
public class OperatorCouponController {

    @Autowired
    private OperatorCouponRepository operatorCouponRepository;

    @GetMapping("/operatorCoupon")
    public ResponseEntity getDataByOperatorLogin(@RequestParam(value="operatorLogin") String operatorLogin) {

        CouponDTO resultFromDb = operatorCouponRepository.findLastCoupon(operatorLogin);

         if (resultFromDb != null) {
             return new ResponseEntity<>(resultFromDb, HttpStatus.OK);
         }else {
             return new ResponseEntity<>("{\"ERROR\":\"Данные  для такого operatorLogin не найдены\"}", HttpStatus.BAD_REQUEST);
         }

    }
}





