// public class power {
//     public static void main(String[] args) {
//         int a=2;
//         int b=5;
//         System.out.println(powerOf(a,b));
//     }
//     public static int powerOf(int a,int b){
//         if(b==1){
//             return a;
//         }
//         int r=powerOf(a, b-1);
//         return r*a;
//     }
    
// }


// print decreasing

public class power {
    public static void main(String[] args) {
        int b=5;
        pd(b);
    }
    public static void pd(int b){
        if(b==0){
            return;
        }
        System.out.println(b);
        pd(b-1);

    }
    
}

