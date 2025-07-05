import java.util.Arrays;
//naive method
class Day04_RotateArrayAtD{

public static void RotateArray(int arr[],int d){
    int n = arr.length;
    for (int i = 0; i<d ; i++){
         int first = arr[0];
         for(int j=0;j<n-1;j++){
            arr[j]=arr[j+1];
         }
         arr[n-1]=first;
    }
}

//better approach temporary array

public static void RevArray(int arr[],int d){
    int n = arr.length;
    d%=n;
    int temp[]=new int[n];
    for(int i =0;i<n-d;i++){
        temp[i]=arr[d+i];
    }

    for(int i=0;i<d;i++){
        temp[n-d+i]=arr[i];
    }

    for (int i = 0; i < n; i++){
            arr[i] = temp[i];
    }

}

public static void main(String args[]){
        int []arr ={1,2,3,4,5,6};
        int d = 2;

        RotateArray(arr,d);
        for(int i=0; i <arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int Arr[]={1,2,3,4,5,6};
        RevArray(Arr,d);
        for(int i=0; i <Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }


    }

}