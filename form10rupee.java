public class form10rupee {
    public static void main(String[] args) {
        int [] a={2,3,5};
        int target=10;
        f10(a,target,"");
    }
    public static void f10(int[] a,int target, String ans){
        if(target==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<a.length;i++){
            if(target>=a[i]){
                f10(a,target-a[i],ans+a[i]);
            }
             
        }
    }
    
}
