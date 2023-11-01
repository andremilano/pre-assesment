import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String jenisKelamin = sc.nextLine();
        double beratBadan = sc.nextInt();
        double tinggiBadan = sc.nextInt();
        double bmi = beratBadan / (tinggiBadan * tinggiBadan);

        if (jenisKelamin.equalsIgnoreCase("pria")) {
            hitungBMIPria(bmi);
        } else if (jenisKelamin.equalsIgnoreCase("wanita")) {
            hitungBMIWanita(bmi);
        } else {
            System.out.println("Inputan tidak valid");
        }
        sc.close();
    }

    // hitung bmi pria
    public static void hitungBMIPria(double bmi) {

        if (bmi < 20.5) {
            System.out.println("Kurus|pria");
        } else if (bmi >= 20.5 && bmi <= 26.999) {
            System.out.println("ideal|pria");
        } else if (bmi >= 27.00) {
            System.out.println("gemuk|pria");
        }
    }

    // hitung bmi wanita
    public static void hitungBMIWanita(double bmi) {

        if (bmi < 18.50) {
            System.out.println("Kurus|wanita");
        } else if (bmi >= 18.50 && bmi <= 24.999) {
            System.out.println("Normal|wanita");
        } else if (bmi >= 25.00) {
            System.out.println("gemuk|wanita");
        }
    }
}