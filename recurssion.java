import java.util.Scanner;
import java.util.*;
public class recurssion {
    public static void main(String[] args) {
        //int n = 5;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=recurssion_fibo(n);
        System.out.println(ans);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=a;
        //int answer=finding_power_using_recurssion(a, b,c);
        //System.out.println(answer);
        //int n=sc.nextInt();
        // int ans=fact(n);
        // System.out.println(ans);
        //printing_nat(n-1);
        //printing_no_withoutreturn(n);
        //int ans=printing_no_using_tail_recurrsion(n,1);
        //System.out.println(ans);
    }
    //for factorial recursive no
    // public static int fact(int n){
    //     //base case
    //     if(n==0){
    //         return 1;
    //     }
    //     int fn=fact(n-1);
    //     return n*fn;
    // }
    // recursive fun for printing natural no 
    // public static void printing_nat(int n){

    //     System.out.println(n);
    //     //base case
    //     if(n==1){
    //         return ;
    //     }
    //     printing_nat(n-1);
    //     //return n*fn;
        
    // }
    //for printing 1to5 through recursive
    // public static void printing_nat(int n){

        
    //     //base case
    //     if(n==0){
    //         return ;
    //     }
    //     printing_nat(n-1);
    //     System.out.println(n);
    //     //return n*fn;
        
    // }
    //tail recurssion is that when there is no statemnt after recurrson recall and head is that when recurrsion call is not at last
 //tail recurssion is good because it convert into while loop   
 //printing no without retun statement
    // public static void printing_no_withoutreturn(int n){
    //     if(n>0){
    //         printing_no_withoutreturn(n-1);
    //         System.out.println(n);

    //     }
    // }
    //printing using tail recurssion.
    // public static int printing_no_using_tail_recurrsion(int n, int ans){
    //     if(n==0){
    //         return ans;
    //     }
    //     return printing_no_using_tail_recurrsion(n-1, ans*n);

    // }
    // public static int finding_power_using_recurssion(int a,int b,int c){
    //     if(b==1){
    //         return a;
    //     }
    //     return finding_power_using_recurssion(a*c,b-1,c);

    // }
    
    public static int recurssion_fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=recurssion_fibo(n-1);
        int f2=recurssion_fibo(n-2);
        return f1+f2;
    }
    

}

