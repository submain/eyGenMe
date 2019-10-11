//实现java栈的功能
public class JavaStack<E> {
    //栈的长度
    public int length;
    //栈
    public E []array;
    //栈的下标
    public int index=-1;
    //初始化栈
    public JavaStack(int length){
       this.length=length;
       array = (E[]) new Object[length];
    }
    //入栈
    public void pull(E obj){
         if (isFull()){
             System.out.println("栈满");
         }else {
             array[++index]=obj;
         }

    }
    //判断栈是否满
    public boolean isFull(){
        return length==index+1;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return index==-1;
    }
    //出栈
    public E pop(){
        if (isEmpty()){
            System.out.println("栈空");
            return null;
        }
        return array[index--];
    }
    public static void main(String[] args) {
        JavaStack javaStack = new JavaStack<Integer>(1);
//        for (Integer i = 0;i<10;i++){
//            javaStack.pull(i);
//        }
        javaStack.pull(2);
        javaStack.pull(3);
        System.out.println(javaStack.pop());
        System.out.println(javaStack.pop());


    }
}
