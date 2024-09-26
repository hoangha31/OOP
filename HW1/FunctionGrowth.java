import java.util.Scanner;

public class FunctionGrowth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print((int)Math.log(n) + "\t");
        System.out.print(n + "\t");
        System.out.print( (int)(n * Math.log(n))+ "\t");
        System.out.print(n  * n + "\t");
        System.out.println(n * n * n);

    }
}
