package com.practice.basic;

public class Fatorial {
    public static int fact(int n){
        if (n==0 || n==1) return 1;
      int subres =  fact(n-1);

      return n*subres;
    }
    public static void main(String[] args) {
       int res= fact(5);
        System.out.println(res);
    }
}
