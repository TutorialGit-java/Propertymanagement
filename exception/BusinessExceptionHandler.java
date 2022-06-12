package com.mycompany.propertymanagement.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class BusinessExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorModel>> handlefieldvalidation(MethodArgumentNotValidException mnv) {
        List<ErrorModel> errorModelList = new ArrayList<>();
        ErrorModel errorModel = null;
        List<FieldError> fieldErrorList = mnv.getBindingResult().getFieldErrors();

        for (FieldError ff : fieldErrorList) {

            logger.info("Inside Field validation:{}-{}", ff.getField(), ff.getDefaultMessage());
            logger.debug("Inside Field validation:{}-{}", ff.getField(), ff.getDefaultMessage());
            errorModel = new ErrorModel();
            errorModel.setCode(ff.getField());
            errorModel.setMessage(ff.getDefaultMessage());
            errorModelList.add(errorModel);
        }
        return new ResponseEntity<List<ErrorModel>>(errorModelList, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<List<ErrorModel>> handleBusinessException(BusinessException businessException) {
        for (ErrorModel em : businessException.getErrors()) {
            logger.debug("BusinessException is thrown-level-debug:{} -{}", em.getCode(), em.getMessage());
            logger.info("BusinessException is thrown-level-info:{}-{}", em.getCode(), em.getMessage());
            logger.warn("BusinessException isthrown-level-warn:{}-{}", em.getCode(), em.getMessage());
            logger.error("BusinessException is thrown-level-error:{}-{}", em.getCode(), em.getMessage());
        }
        return new ResponseEntity<List<ErrorModel>>(businessException.getErrors(), HttpStatus.BAD_REQUEST);
    }
}
