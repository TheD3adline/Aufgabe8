package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            int a, b;
            a = i % 3;
            b = i % 4;
            if(a == 0 && b != 0) {
                System.out.println(i + " teilbar durch 3");
            }
            else if(b == 0 && a != 0) {
                System.out.println(i + " teilbar durch 4");
            }
            else if(a == 0 && b == 0) {
                System.out.println(i + " teilbar durch 3 und 4");
            }
            else {
                System.out.println(i);
            }

        }

    }
}
