
public class recurrsion_back_traverse {
    public static void main(String[] args) {
        int [] srr={2,3,5,2,9,7,6,9};
        int item=7;
        int ans=-1;
        System.out.println(Index(srr,item,srr.length,ans));
    }
    public static int Index(int []srr,int item,int i,int ans){
        if(i==0 || i==1){
            return -1;
        }
        if(srr[i-1]==item){
            return i-1;
        }
        return Index(srr,item,i-1,ans);

    }
    
}