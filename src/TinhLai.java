import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        double soTienGui;
        int soThangGui;
        double laiXuat;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        soTienGui = input.nextDouble();
        System.out.println("Nhap so thang gui: ");
        soThangGui = input.nextInt();
        System.out.println("Nhap lai xuat: ");
        laiXuat = input.nextDouble();
        double tienlai = 0;
        for (int i = 0; i < soThangGui; i++) {
            tienlai += soTienGui * (laiXuat / 100) / 12;

        }
        System.out.printf("Tien lai trong %d la %s", soThangGui, tienlai);

    }
}
