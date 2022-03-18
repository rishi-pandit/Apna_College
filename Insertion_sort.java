package apna;

public class Insertion_sort {
    public static void main(String[] args) {
        int arr[] = {5,8,96,2,5,8,6,5,8,6,653,6,66,3,6,3,};
        System.out.println("Before sorting ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        System.out.println("After sorting ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
