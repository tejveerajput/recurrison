public class recurrsion_count_HT {
    public static void main(String[] args) {
        int coin=3;
       System.out.println("\n"+find_ht(coin,"")); ;
    }
    public static int find_ht( int coin,String ans){
        if(coin==0){
            return 1;
        }
        int a=find_ht(coin-1, ans+"H");
        int b=find_ht(coin-1, ans+"T");
        return a+b;
    }
    
}
