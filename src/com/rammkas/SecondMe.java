package com.rammkas;


public class SecondMe {
    private int variable_1;

    public SecondMe(int var)
    {
        variable_1 = var;
    }
    public void printMe()
    {
        System.out.printf("Inner variable is: %d%n", variable_1);
    }
}