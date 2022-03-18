package apna;


// Time Complexity = nlogn(in Average Case)
public class Ex_MSort {
    public static void Conquer(int arr[], int start, int mid, int end){
        int merge[] = new int[end - start + 1];
        int idx1= start;
        int idx2 = end;
        int x=0;
        while(idx1<=mid && idx2 <= end)
        {
            if(arr[idx1] <= arr[idx2]){
                merge[x++] = arr[idx1++];
            }else{
                merge[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merge[x++] = arr[idx1++];
        }
        while(idx2<=end){
            merge[x++] = arr[idx2++];
        }
        for(int i=0,  j=start; i<merge.length; i++, j++){
            arr[j] = merge[i];
        }
    }
    public static void Divide(int arr[], int start, int end){
        int mid = start + (end - start)/2;
        Divide(arr,start,mid);
        Divide(arr,mid+1,end);
        Conquer( arr, start,  mid,  end);
    }
    public static void main(String[] args) {
        int arr[] = {2,8,6,9,7};
        int n= arr.length;

        Divide(arr,0,n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}
