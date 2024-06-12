public class Queen_permutation {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[4];
        per(board,tq,0,"");
    }
    public static void per(boolean [] board,int tq,int qspf,String ans ){
        if(qspf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                per(board, tq, qspf+1,ans+"b"+i+"q"+qspf);
                board[i]=false;

            }
        }
    }
    
}
