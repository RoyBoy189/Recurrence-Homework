public class Recurrences {

    public static void main(String[] args){

        System.out.println("C(100) = " + C(100));
        System.out.println("F(47) = " + C(47));
        System.out.println("D(20) = " + C(20));
        System.out.println("U(19) = " + C(19));
    }

    private static long C(int n){
        if(n == 5) {
            return 1; 
        }
        if(n == 10) {
            return 1;
        }
        else{
        return C(n - 10) + C(n - 5);
        }
    }


    private static long F(int n){
        if(n == 0 || n == 4 || n == 5 || n == 6 || n ==2) {

        return 1;
        }
        if(n == 1 || n==3) {
            return 0;
        }
        if(n == 7) {
            return 3;
        }
        else{
           return F(n-2) + F(n - 5) + f(n-7);
        }
    }


    private static long D(int n){
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 3
        }

        return D(n-1) + D(n-2);
    }


    private static long U(int n){
        int a = 3
        int x = 2
        if( n == 2) {
            return 3;
        }
        if(n == 1) {
            return 2;
        }
        else {
            return U(n -2) + U(n-1)
        }
    }
    
}

