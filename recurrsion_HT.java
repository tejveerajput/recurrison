public class recurrsion_HT {
    public static void main(String[] args) {
        int coin=3;
        find_ht(coin,"");
    }
    public static void find_ht( int coin,String ans){
        if(coin==0){
            System.out.println(ans+"");
            return;
        }
        find_ht(coin-1, ans+"H");
        find_ht(coin-1, ans+"T");
    }
    
}
