public class Day05_NextPermutation {
    static void nextPermutation(int arr[]){
        int n = arr.length;

        int index = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }

        if(index==-1){
            reverse(arr,0,n-1);
            return;
        }


        for(int i =n-1;i>index;i--){
            if(arr[i]>arr[index]){
                swap(arr,i,index);
                break;
            }
        }

        reverse(arr,index+1,n-1);
    }

    public static void reverse(int arr[],int start,int end){
        while(start<end){
            swap(arr,start++,end--);
        }
    }

    public static void swap(int arr[], int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    


    public static void main(String []args){
        int arr[] = {1,2,1,7,5,0};
        nextPermutation(arr);

        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
