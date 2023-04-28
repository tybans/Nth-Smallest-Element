public class NthSmallestArray {
    
    // method for sorting the array
    public void sortArr(int[] arr){
        int size = arr.length;

        for(int i =0; i<size; i++){
            int temp = i;
            for(int j = i+1; j<size; j++){

                if(arr[temp]>arr[j]){
                    temp = j;
                }
            }
            if(temp != i){
                int t = arr[i];
                arr[i] = arr[temp];
                arr[temp] = t;
            }
        }
    }
    // find the nth smallest element of the array
    public int findNthSmallest(int arr[], int n){
        sortArr(arr);

        // as an array is always a zero indexing
        // therefore, the nth smallest element lies at the n-1 index

        return arr[n-1];
    }
    public static void main(String[] args) {
        
        //creating an object of the class NthSmallestArray
        NthSmallestArray obj = new NthSmallestArray();

        int arr[] = {15, 22, 51, 28, 13, 24, 5, 12};
        int n = 4;
        int size = arr.length;

        System.out.println("For the array: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

        int ele = obj.findNthSmallest(arr, n);
        System.out.println();
        System.out.println("The "+ n +"th smallest element of the array is: "+ ele);
        //System.out.println();
    }
}
