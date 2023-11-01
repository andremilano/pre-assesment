import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        String enkripsiNum = enkripsi(number);
        String enkripsiNum2 = enkripsi(number2);
        String enkripsiNum3 = enkripsi(number3);

        System.out.println(enkripsiNum);
        System.out.println(enkripsiNum2);
        System.out.println(enkripsiNum3);

        sc.close();
    }

    public static String enkripsi(int number) {
        int digit1 = (number / 1000 + 5) % 10;
        int digit2 = (number / 100 % 10 + 5) % 10;
        int digit3 = (number / 10 % 10 + 5) % 10;
        int digit4 = (number % 10 + 5) % 10;

        // return 4 variable above from order digit1, digit 4, digit 3 and digit2
        // without sum any of them
        return digit1 + "" + digit4 + "" + digit3 + "" + digit2;

    }
}
