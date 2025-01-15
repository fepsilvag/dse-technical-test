package com.dse.exception;

import lombok.EqualsAndHashCode;

import static com.dse.constant.ErrorCodeEnum.ANG002;

/**
 * Exception thrown when the input is empty.
 */
@EqualsAndHashCode(callSuper=false)
public class EmptyInputException extends BusinessException {

    public EmptyInputException() {
        super(ANG002);
    }

}