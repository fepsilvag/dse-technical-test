package com.dse;

import com.dse.exception.BusinessException;
import com.dse.util.AnagramUtil;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(AnagramUtil.generateAnagrams("abc"));
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

}