package apna;

import jdk.swing.interop.SwingInterOpUtils;

public class StringBuilderEx {
    public static void main(String[] args) {
        //Declaration
        StringBuilder sb = new StringBuilder ("Apna College");

        // Get a character from a index
      //  System.out.println(sb.charAt(0));

        //Set a character at index
   /*     sb.setCharAt(0,'P');
        System.out.println(sb);  */

        // Insert a character at some index
      //  sb.insert(2,'S');
      //  System.out.println(sb);

        // Delete a character at some index
        sb.delete(0,1);
      //  System.out.println(sb);

        // Append a character (append a character to add something at the end )
        sb.append("  Rishi");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
