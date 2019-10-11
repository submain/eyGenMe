public class Recursion {
    //递归算法求阶乘
    public  static int factorial(int n ){
   if (n<0){
       System.out.println("负数没有阶乘");
       return 0;
   }
   if (n==0||n==1){
       return 1;
   }else {
       return factorial(n-1)*n;
   }
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
