package com.practice.basic;

import java.util.Scanner;

public class Printatob {
    public static void printatob(int a,int b){
       if (a>b) return;
        System.out.println(a);
        printatob(a+1,b);

    }
    public static void printbtoa(int a,int b){
        if (a>b) return;
        printbtoa(a+1,b);
        System.out.println(a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int  b = sc.nextInt();
        printatob(a,b);
        printbtoa(a,b);
    }
}
