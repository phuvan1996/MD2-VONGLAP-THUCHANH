import java.util.Scanner;

public class Thuchanh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 so");
       int num = scanner.nextInt();
       if (num < 2) {
           System.out.println(num+ ":khong phai la so nguyen to");
       }else {
           int i = 2;
           boolean check = true;
           while (i<num){
               if (num % i == 0){
                   check = false;
                   break;
               }
               i++;
           }
           if (check)
           System.out.println(num + ":la so nguyen to" );
           else
               System.out.println(num + ":khong phai la so nguyen to");
       }
    }
}
