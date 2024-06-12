public class recurrsion_in_array {
    public static void main(String[] args) {
        int [] srr={2,3,7,2,9,9,6,8};
        int item=7;
        System.out.println(Index(srr,item,0));
    }
    public static int Index(int []srr,int item,int i){
        if(i==srr.length){
            return -1;
        }
        if(srr[i]==item){
            return i;
        }
        return Index(srr,item,i+1);

    }
    
}
