public class ThreadDemo1 {
    private static int j=10;
    private Object o = new Object();
//    public ThreadDemo1(int j){
//        this.j=j;
//    }
    class Dec extends Thread{
        @Override
        public void run() {
            synchronized (o){
                j--;
                System.out.println(Thread.currentThread().getId()+":"+j+"减");
            }
        }
    }
    class Inc implements Runnable{
        @Override
        public void run() {
            synchronized (o){
                j++;
                System.out.println(Thread.currentThread().getId()+":"+j+"加");
            }
        }
    }

    public static void main(String[] args) {
       new ThreadDemo1().new Dec().start();
       new Thread(new ThreadDemo1().new Inc()).start();
        new ThreadDemo1().new Dec().start();
        new Thread(new ThreadDemo1().new Inc()).start();
    }
}
