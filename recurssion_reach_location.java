import java.nio.file.ProviderMismatchException;

public class recurssion_reach_location {
    public static void main(String[] args) {
        int n=3;
        int m=4;
       System.out.println( ways(n,m,0,0,""));
    }
    public static int  ways(int n,int m,int cr,int cc,String ans){
        if(cc==m-1 && cr==n-1){
            System.out.println(ans);
            return 1;
        }
        if(cc>=m || cr>+n){
            return 0;
        }

       int a= ways(n,m,cr+1,cc,ans+"V");
       int b= ways(n,m,cr,cc+1,ans+"H");
       return a+b;
    }
}
