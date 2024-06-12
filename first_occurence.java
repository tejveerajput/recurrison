// import java.util.*;
// public class first_occurence {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int []arr=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int key=sc.nextInt();
//         System.out.println(FO(arr,0,key));
//     }
//     public static int FO(int arr[],int start,int key){
//         if(start==arr.length){
//             return -1;
//         }
//         if(arr[start]==key){
//             return start;
//         }
//         return FO(arr,start+1,key);


//     }
    
// }

//All occurence

import java.util.ArrayList;

public class first_occurence{
    public static void main(String[] args) {
        int arr[]={1,2,5,3,4,3,9,3};
        int item=3;
        ArrayList<Integer> brr=new ArrayList<>();
        AO(arr,brr,0,item);
    }
    public static void AO(int []arr,ArrayList<Integer>brr,int i,int item){
        if(i==arr.length){
            System.out.println(brr);
            return;
        }
        if(arr[i]==item){
            brr.add(i);
        }
        AO(arr,brr,i+1,item);
        
    }
}
