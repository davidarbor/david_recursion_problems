public class Runner{
    public static void main(String[] args){
        System.out.println(triangle(14));
    }
    public static int factorial(int n){
        if (n == 1) {
            return n;
        }
        return n*factorial(n - 1);
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int sumDigits(int n){
        if(n<10){
            return n;
        }
        return n%10+sumDigits(n/10);
    }
    public static int countX(String str){
        if(str.length()==0){
            return 0;
        }
        if(str.charAt(0)=='x'){
            return 1+countX(str.substring(1));
        }
        return countX(str.substring(1));
    }
    public static int triangle(int rows){
        if(rows==0){
            return rows;
        }
        return rows+triangle(rows-1);
    }
}