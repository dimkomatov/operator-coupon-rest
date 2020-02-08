package ru.mos.suo.operatorcoupon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class OperationCouponExceptionHandler {
        @ExceptionHandler(MissingServletRequestParameterException.class)
        @ResponseStatus(HttpStatus.BAD_REQUEST)
        public ResponseEntity handleMissingParam(MissingServletRequestParameterException ex) {
            return new ResponseEntity<>("{\"ERROR\":\"" + ex.getMessage() + "\"}", HttpStatus.BAD_REQUEST);
        }
}
