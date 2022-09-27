import java.util.Scanner;

public class Thuchanh2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laiSuat = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền gui:");
        money = input.nextDouble();
        System.out.println("nhap so thang");
        month = input.nextInt();
        System.out.println("nhập lãi suất hàng năm theo tỷ lệ phần trăm");
        laiSuat = input.nextDouble();
        double tongLaiSuat = 0;
        for (int i = 0; i < month; i++) {
            tongLaiSuat += money * (laiSuat/100)/12 * month;
        }
        System.out.println("tong lai suat la : " + tongLaiSuat);
    }
}
