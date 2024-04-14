package com.basicJava.Exception;

public class OrderOfExceptions {
    public static void main(String[] args) {
        try {
            int i = 5 / 0;
        } catch (NullPointerException npe)//child exception
        {
            npe.printStackTrace();

        } catch (RuntimeException re)//child exception
        {
            re.printStackTrace();
        } catch (Exception e) //parent exception
        {

            e.printStackTrace();
        }

        System.out.println("Testing is successfully done");

    }

}
