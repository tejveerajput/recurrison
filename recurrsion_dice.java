public class recurrsion_dice {
    public static void main(String[] args) {
        int n=4;
        String store="";
        dice_combination(0,n,store);
    }
    public static void dice_combination(int src,int desc,String store){
        if(src==desc){
         System.out.println(store); 
         return;  
        }
        if(src>desc){
            return;
        }
        // dice_combination(src+1,desc,store+1);
        // dice_combination(src+2,desc,store+2);
        // dice_combination(src+3, desc, store+3);
        for(int dice=1;dice<=3;dice++){
            dice_combination(src+dice, desc, store+dice);
        }
    }
}
