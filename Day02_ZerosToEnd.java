public class Day02_ZerosToEnd {
    //naive method

    static void ZerosToEnd(int arr[]){
        
        int n=arr.length;
        int temp[] = new int[n];

        int j = 0 ;

        for(int i = 0 ; i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            } 
        }
        while(j<n){
                temp[j]=0;
                j++;
            }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    //better approach(two traversals)


    static void zeroesEnd(int arr[]){
        int count = 0;
        for (int i = 0 ; i<arr.length ; i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
            while(count<arr.length){
                arr[count++]=0;
            }
    } 
    //Expected approach(one traverse)
    // Skipped optimal one-pass (in-place) approach for now — will revisit during revision



    public static void main(String[] args) {
        int []arr = {5,0,9,0};
        ZerosToEnd(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        zeroesEnd(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
