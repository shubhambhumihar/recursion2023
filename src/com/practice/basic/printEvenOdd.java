package com.practice.basic;

import java.util.Scanner;

public class printEvenOdd {
    public static void printevenOdd(int a,int b){
        if (a>b) return;
//        faith is that p(a+1,b) will print even odd
        if (a%2==0){
            System.out.println(a);
        }
        printevenOdd(a+1,b);
        if (a%2!=0){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
        int b = sc.nextInt();

        printevenOdd(a,b);
    }
}
