package apna;

import java.util.Scanner;

public class ReverseStringEx_StringBuilder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      //  StringBuilder sb = new StringBuilder(sc.next());
       // sb = new StringBuilder(sc.next());
        int size = sc.nextInt();

        String arr[] = new String[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.next();
        }


     /*   for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-i-1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);   */
    }
}
