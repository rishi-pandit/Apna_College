package apna;

import java.util.Scanner;

public class StringsEx {
    public static void main(String[] args) {
        //Declaration
        String name = "Tony";

        //Taking input
        Scanner sc = new Scanner(System.in);
      //  String name2= sc.next();

        // Concatenation(Joining of two string)
        String firstName = "Tonny";
        String secondName = "Stark";

        String fullName = firstName + " " + secondName ;
      //  System.out.println(fullName);

        //Print of a length of a string
       // System.out.println(fullName.length());

        //Access of a string
        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }

        //Compare two strings


    }
}
