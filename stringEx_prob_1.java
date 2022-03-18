package apna;

/* Take an array of Strings input from the user & find the cumulative (combined)
  length of all those strings.  */

import java.util.Scanner;

public class stringEx_prob_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        String arr[] = new String[size];

        int totalLength = 0;
        int totalLength2 = 0;

        for (int i=0; i<size; i++){
            arr[i] = sc.next();
            totalLength = arr[i].length();
            System.out.print(totalLength + " ");
            totalLength2 += arr[i].length();
        }
        System.out.println();

        System.out.println(totalLength2);
    }
}
