import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tieptuc ;
        do {
            System.out.print("Nhap ten: ");
            String name = sc.nextLine();

            System.out.print("Nhap dia chi: ");
            String address = sc.nextLine();

            System.out.print("Nhap tuoi: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Thong tin hoc sinh:");
            System.out.println("Ten: " + name);
            System.out.println("Đia chi: " + address);
            System.out.println("Tuoi: " + age);

            System.out.print("Ban muon tiep tuc khong? (Y/N): ");
            tieptuc = sc.nextLine();

        } while (tieptuc.equalsIgnoreCase("Y"));
        System.out.println("Chuong trinh ket thuc.");
        sc.close();
    }
}
