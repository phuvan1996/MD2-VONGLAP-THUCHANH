import java.util.Scanner;

public class Thuchanh3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a: ");
        a = input.nextInt();
        System.out.println("enter b : ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0||b==0){
            System.out.println("no greatest common factor");
        }
        while (a!=b){
            if (a>b){
                a =  a-b ;
                System.out.println("a = " + a);
            }else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }
        System.out.println("greatest common factor " + a);
    }
}
