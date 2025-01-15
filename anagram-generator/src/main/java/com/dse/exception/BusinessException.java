package com.dse.exception;

import com.dse.constant.ErrorCodeEnum;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The <b>BusinessException</b> class represents a custom exception used to handle business logic errors. It extends
 * the <i>RuntimeException</i> class and includes additional information such as an error code and description.
 */
@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class BusinessException extends RuntimeException {

    protected final ErrorCodeEnum code;
    protected final String description;

    public BusinessException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getDescription());

        this.code = errorCodeEnum;
        this.description = errorCodeEnum.getDescription();
    }

    public BusinessException(ErrorCodeEnum errorCodeEnum, String description) {
        super(description);

        this.code = errorCodeEnum;
        this.description = description;
    }

}