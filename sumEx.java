package apna;

public class sumEx {
    public static void printSum(int n){
        if(n==0) return ;
        int sum =0;

        printSum(n-1);
        sum += n;
       // System.out.println(sum);
       // return sum;
    }
    public static void main(String[] args) {

      //  System.out.println( printSum(10));
        printSum(10);
    }
}
