import java.util.ArrayList;

public class recurrsion_permutation_of_abc {
    public static void main(String[] args) {
        String s="ABCA";
        ArrayList<String> ll=new ArrayList<>();
        permutation(s,"",ll);
        
    }
    //without repeatation
    /**
     * @param s
     * @param ans
     * @param ll
     */
    public static void permutation(String s,String ans,ArrayList<String> ll){
        if(s.length()==0){
            ll.add(ans);
            if(ll.contains(ans)){
                System.out.println(ans+"");
                return;
            }
            System.out.println(ans+"");
            return;

        }
        for(int i=0;i<s.length();i++){
            String s1=s.substring(0, i);
            String s2=s.substring(i+1);
            char ch=s.charAt(i);
            permutation(s1+s2, ans+ch,ll);
            
        }

        

    }
    //with repeatation
    // public static void permutation(String s,String ans){
    //     if(ans.length()==3){
    //         System.out.println(ans+"");
    //         return;

    //     }
    //     for(int i=0;i<s.length();i++){
    //         String s1=s.substring(0, i+1);
    //         String s2=s.substring(i+1);
    //         char ch=s.charAt(i);
    //         permutation(s1+s2, ans+ch);
            
    //     }

        

    // }
    
}
