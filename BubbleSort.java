public class BubbleSort{
	public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr.length-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
    }
	public static void main(String[] args) {
		int arr[]={5,8,9,2,1};
		bubbleSort(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}
}
