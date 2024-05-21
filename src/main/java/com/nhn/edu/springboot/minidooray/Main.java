package com.nhn.edu.springboot.minidooray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int param = sc.nextInt();

        Calculable expression = new MultiplyExpressionConflictTest();

        System.out.printf("my expression's result : %d \n", expression.calculate(param));
    }
}

interface Calculable {
    int calculate(int param);
}


class MultiplyExpressionConflictTest implements Calculable{
    @Override
    public int calculate(int param) {
        param = param + 1;
        return param * param * param;
    }
}