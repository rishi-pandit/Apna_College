package apna;

public class StringsEx_2_comparing {
    public static void main(String[] args) {
        String name1 = "Rishi";
        String name2 = "Rishi";

        if(name1.equals(name2)){
            System.out.println("The are the same string");
        }else{
            System.out.println("They are different");
        }

        // Do not use to check for string equality
        //Gives correct answer here
        if(name1 == name2){
            System.out.println("they are equal");
        }else{
            System.out.println("they are not equal");
        }

        //Gives incorrect answer
        if(new String("Tony") == new String("Tonny")){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
