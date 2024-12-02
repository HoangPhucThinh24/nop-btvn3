import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so a");
        double a = scanner.nextDouble();
        System.out.println("nhap so b");
        double b = scanner.nextDouble();

        System.out.println("nhap phep toan");
        char pheptinh = scanner.next().charAt(0);

        double ketqua = 0;
        boolean valid = true;

        switch (pheptinh) {
            case '+':
                ketqua = a + b;
                break;
            case '-':
                ketqua = a - b;
                break;
            case '*':
                ketqua = a * b;
                break;
            case '/':
                ketqua = a / b;
                break;
            case '%':
                ketqua = a % b;
                break;
            default:
                System.out.println("Lỗi: Phép toán không hợp lệ.");
                valid = false;
        }
        if (valid) {
            System.out.println("Kết quả: " + ketqua);
        }
    }
}