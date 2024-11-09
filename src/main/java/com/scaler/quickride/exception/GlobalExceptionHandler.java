package com.scaler.quickride.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.InputMismatchException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InputMismatchException.class)
    public void handleInputMismatchException() {

    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public void handleArrayIndexOutOfBoundException() {

    }


}