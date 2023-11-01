import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number + number2;

        System.out.println(konversiKalimat(sum));

        sc.close();
    }

    public static String konversiKalimat(int sum) {

        // Inisiasi konversi int ke string memakai Array String
        String[] satuan = { "", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan" };
        String[] puluhan = { "", "sepuluh", "dua puluh", "tiga puluh", "empat puluh", "lima puluh", "enam puluh",
                "tujuh puluh", "delapan puluh", "sembilan puluh" };
        String[] ratusan = { "", "seratus", "dua ratus", "tiga ratus", "empat ratus", "lima ratus", "enam ratus",
                "tujuh ratus", "delapan ratus", "sembilan ratus" };

        int ratus = sum / 100;
        int puluh = (sum % 100) / 10;
        int satuanAngka = sum % 10;
        String kalimat = ratusan[ratus] + " " + puluhan[puluh] + " " + satuan[satuanAngka];

        kalimat = kalimat.trim();
        return kalimat;
    }
}
