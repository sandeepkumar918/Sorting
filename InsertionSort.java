public class InsertionSort{
	public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
	public static void main(String[] args) {
		int arr[]={2,8,5,3,7};
		insertionSort(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}
}

