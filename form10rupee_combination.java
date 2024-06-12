public class form10rupee_combination {
    public static void main(String[] args) {
        int [] a={2,3,5};
        int target=10;
        f10(a,target,"",0);
    }
    public static void f10(int[] a,int target, String ans,int idx){
        if(target==0){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<a.length;i++){
            if(target>=a[i]){
                f10(a,target-a[i],ans+a[i],i);
            }
             
        }
    }
    
}
