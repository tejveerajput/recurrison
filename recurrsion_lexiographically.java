public class recurrsion_lexiographically {
   public static void main(String[] args) {
    int n=1000;
    printcount(0,n);
   }
   public static void printcount(int curr,int n){
    if(curr>n){
        return;
    }
    System.out.println(curr);
    int i=0;
    if(curr==0){
        i=1;
    }
    for(;i<=9;i++){
        printcount(curr*10+i, n);
    }
   }
}
