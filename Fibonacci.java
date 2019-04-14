import java.util.Vector;

public class Fibonacci {
    public static void main(String[] args) {
        Vector<Integer> fib=new Vector<Integer>();
        fib.add(1);
        fib.add(1);
        for(int i=2;i<10;i++){
            fib.add(fib.get(i-1)+fib.get(i-2));
        }
        System.out.print("斐波那契数列前10项：");
        for(Integer val:fib){
            System.out.print(val+" ");
        }
    }

}
