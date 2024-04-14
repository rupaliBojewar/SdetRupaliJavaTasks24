package com.basicJava.Exception;

public class TestException {
    public static void main(String[] args)  {
        try {
            throw new AuthenticationException("Provide right credentials");
            //throw new AuthenticationException("Provide right credentials and try again", new Throwable("Element not found"));

        }catch (AuthenticationException ae){
                 ae.printStackTrace();
        }
    }
}
