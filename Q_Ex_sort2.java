package apna;

// Time Complexity = nlogn  (in worst case - n^2)

public class Q_Ex_sort2 {
    public static int Partition(int arr[], int low, int high){
         int pivot = arr[high];
         int i = low-1;
         for(int j=low; j<high; j++){
             if(arr[j]<pivot){
                 i++;
                 //Swap
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j]= temp;
             }
         }
         i++;
         int temp = arr[i];
         arr[i] = arr[high];
         arr[high] = temp;
         return i;
    }
    public static void QuickSort(int arr[], int low, int high){
        if(low<high){
            int pdx = Partition(arr,low,high);

            QuickSort(arr, low, pdx - 1);
            QuickSort(arr, pdx +1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,9,6,7};
        int n= arr.length;

        QuickSort( arr,0,5);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
