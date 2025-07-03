import java.util.Arrays;
//naive approach(temporary array)
public class Day03_ArrayReverse {
    static void ReverseArray(int arr[]){
        int n = arr.length;
        int temp[]=new int[n];
        int j = 0;
        for (int i = n-1; i>=0;i--){
            temp[j++]=arr[i];
        }
        for (int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }

    //expected approach(swapping elements-O(n)tc,O(1)sc

    static void RevArray(int arr[]){
        int n=arr.length;
        for (int i = 0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }


    //another approach using recursion
    static void ReverseArr(int []arr,int l,int r){
        if(l>=r)return;
        
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;


            ReverseArr(arr,l+1,r-1);
        


        
    }
    public static void main(String []args){
        int []arr={1,4,3,2,6,5};
        ReverseArray(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        int arrr[]={1,2,3,4,5};
        RevArray(arrr);
        for (int i = 0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
        System.out.println();
        int Arr[]={3,4,5,6,7,8};
        ReverseArr (Arr,0 , Arr.length-1);
        for (int i =0;i < Arr.length;i++){
            System.out.print( Arr[i]+" ");
        }
    }
}
