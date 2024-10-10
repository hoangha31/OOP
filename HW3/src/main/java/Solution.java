package src.main.java;

import java.util.Scanner;

public class Solution {

   public long findFibonacci(int n){
       if(n < 0){
           return -1;
       }
       if(n == 0){
           return 0;
       } else if(n == 1){
           return 1;
       }

       int a = 0;
       int b = 1;
       int c = 0;
       int cnt = 2;
       while(cnt <= n){
           c = a + b;
           a = b;
           b = c;
           cnt++;
       }
       return c;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       Solution solution = new Solution();
       System.out.println(solution.findFibonacci(n));
   }
}
