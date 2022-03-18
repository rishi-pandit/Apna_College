package apna;

import java.util.Scanner;

public class factorialEx {
    public static void printFactorial(int n,int fact){
//        if(i==0){
//            fact = 1;
//        }
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact *= n;

        printFactorial(n-1,fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print number : ");
        printFactorial(sc.nextInt(),1);
    }
}
