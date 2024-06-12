public class Queen_combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[4];
        com(board,tq,0,"",0);
    }
    public static void com(boolean [] board,int tq,int qspf,String ans,int idx){
        if(qspf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                com(board, tq, qspf+1,ans+"b"+i+"q"+qspf,i+1);
                board[i]=false;

            }
        }
    }
    
}
