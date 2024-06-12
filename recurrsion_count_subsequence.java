

public class recurrsion_count_subsequence {
    public static void main(String[] args) {
        String ques="abc";
        //subsequence(ques,"");
        System.out.println("\n"+subsequence(ques,""));

        //System.out.println("\n"+count);
    }
    //using global variable
    // static int count=0;
    // public static void subsequence(String ques,String ans){
    //     if(ques.length()==0){
    //         System.out.println(ans+"");
    //         count++;
    //         return;
    //     }
    //     char ch=ques.charAt(0);
    //     subsequence(ques.substring(1), ans);
    //     subsequence(ques.substring(1), ans+ch);
    // }
    //without using global variable
    public static int subsequence(String ques,String ans){
        if(ques.length()==0){
            return 1;
        }
        char ch=ques.charAt(0);
        int a=subsequence(ques.substring(1), ans);
        int b=subsequence(ques.substring(1), ans+ch);
        return a+b; 
    }
    
}
