package com.basicJava.Exception;

public class AuthenticationException extends Exception {
    AuthenticationException(String exceptionMsg) {
        super(exceptionMsg);
    }
    AuthenticationException(String exceptionMsg, Throwable te) {
        super(exceptionMsg, te);
    }



}
