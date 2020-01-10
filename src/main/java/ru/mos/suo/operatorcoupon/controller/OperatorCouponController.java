package ru.mos.suo.operatorcoupon.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mos.suo.operatorcoupon.dto.CouponDTO;
import ru.mos.suo.operatorcoupon.repository.OperatorCouponRepository;

import java.io.IOException;

@RestController
public class OperatorCouponController {

    @Autowired
    private OperatorCouponRepository operatorCouponRepository;

    @RequestMapping("/operatorCoupon")
    public ResponseEntity getDataByOperatorLogin(@RequestParam(value="operatorLogin") String operatorLogin) {
        CouponDTO resFromDb = operatorCouponRepository.findLastCoupon(operatorLogin);
        String jsonStringRes = null;
        HttpStatus httpStatus = null;
        if (resFromDb!=null){
            ObjectMapper obj = new ObjectMapper();
            try {
                jsonStringRes = obj.writeValueAsString(resFromDb);
                httpStatus = HttpStatus.OK;
            }
            catch (IOException e) {
                jsonStringRes = "{\"ERROR\":\"" + e.toString() + "\"}";
                httpStatus = HttpStatus.BAD_REQUEST;
            }
        }else{
            jsonStringRes = "{\"ERROR\":\"Данные  для такого operatorLogin не найдены\"}";
            httpStatus = HttpStatus.BAD_REQUEST;
        }
        return ResponseEntity.status(httpStatus).body(jsonStringRes);
    }
}





