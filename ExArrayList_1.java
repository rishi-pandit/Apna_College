package apna;


import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class ExArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<Boolean> list4= new ArrayList<Boolean>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       // System.out.println(list);

        //to get a element
        int element = list.get(0);   // 0 is the index
      //  System.out.println(element);

      //add element in between
        list.add(1,9);
      //  System.out.println(list);

        // set element
        list.set(0,0);
    //    System.out.println(list);

        //delete element
        list.remove(0);
       // System.out.println(list);

        // size of list
        int size= list.size();
       // System.out.println(size);

        //Loops on lists
        for(int i=0; i<list.size(); i++ ){
          //  System.out.print(list.get(i) + " ");
        }
       // System.out.println();

        //Sorting the list
        list.add(0);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
