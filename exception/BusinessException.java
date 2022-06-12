package com.mycompany.propertymanagement.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class BusinessException extends RuntimeException
    {
        List<ErrorModel>errors;
        public BusinessException(List<ErrorModel>errors)
        {
            this.errors=errors;
        }


    }

