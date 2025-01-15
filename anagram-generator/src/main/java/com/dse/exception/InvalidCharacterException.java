package com.dse.exception;

import lombok.EqualsAndHashCode;

import static com.dse.constant.ErrorCodeEnum.ANG003;

/**
 * Exception thrown when the input contains invalid characters.
 */
@EqualsAndHashCode(callSuper=false)
public class InvalidCharacterException extends BusinessException {

    public InvalidCharacterException() {
        super(ANG003);
    }

}