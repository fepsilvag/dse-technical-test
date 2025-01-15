package com.dse.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The <b>ErrorCodeEnum</b> class provides a list of error codes and their descriptions.
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

    ANG001("The input is null. Please provide a valid input."),
    ANG002("The input is empty. Please provide a valid input."),
    ANG003("The input contains invalid characters. Only letters are allowed.");

    private final String description;

}