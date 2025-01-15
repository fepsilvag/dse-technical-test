package com.dse.exception;

import lombok.EqualsAndHashCode;

import static com.dse.constant.ErrorCodeEnum.ANG001;

/**
 * Exception thrown when the input string is null.
 */
@EqualsAndHashCode(callSuper=false)
public class NullAnagramException extends BusinessException {

    public NullAnagramException() {
        super(ANG001);
    }

}