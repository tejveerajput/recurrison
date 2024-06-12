import java.util.*;
public class firstoccur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(first(arr,0,target));
    }
    public static int first(int a[],int st,int target){
        if(st==a.length){
            return -1;
        }
        if(a[st]==target){
            return st;
        }
        return first(a, st+1, target);
    }
    
}
