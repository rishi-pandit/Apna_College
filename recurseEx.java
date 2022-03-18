package apna;
// print the any continous number
public class recurseEx {
    public static void printEx(int n){
        if(n<0) return;
        System.out.print(n + " ");
        printEx(n-1);
    }
    public static void main(String[] args) {
        printEx(5);
    }
}
