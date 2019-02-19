package com.itheima.git;

import org.junit.Test;

public class SecondClass {

@Test
    public void main() {
        SecondClass fs = new SecondClass();
        int result = fs.add(5);
        System.out.println(result);
    }

    public  static int add(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }

        return sum;

    }

    public int add1(int a) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += i;
        }

        return sum;


    }
}


