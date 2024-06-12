import java.util.*;

public class recurrsion_leetcode22 {
    public static void main(String[] args) {
        int n=3;
        ArrayList<String> ll=new ArrayList<>();
        combination_paranthesis(n,"",0,0,ll);
        System.out.println(ll);
    }

    public static void combination_paranthesis(int n,String ans,int open,int close,ArrayList<String> ll){
        if(open==n && close==n){
            ll.add(ans);
            return;
        }
        if(open<=n){
            combination_paranthesis(n, ans+"(", open+1, close,ll);
        }
        if(close<open){
            combination_paranthesis(n, ans+")", open, close+1,ll);
        }
    }
    
}
