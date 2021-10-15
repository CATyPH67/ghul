package com.company;

public class Main {

    public static void main(String[] args) {
        int ghulCoef = 1000;
        while (ghulCoef - 7 > 0) {
            System.out.printf("%d - 7 = %d %n", ghulCoef, ghulCoef - 7);
            ghulCoef -= 7;
        }
        System.out.print("я... гуль");
    }
}
