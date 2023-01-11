import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("İlk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c = input.nextInt();
        if (a > b && a > c && b > c) {
            System.out.println(a + ">" + b + ">" + c);
        }
        if (a > b && a > c && c > b) {
            System.out.println(a + ">" + c + ">" + b);
        }
        if (b > a && b > c && a > c) {
            System.out.println(b + ">" + a + ">" + c);
        }
        if (b > a && b > c && c > a) {
            System.out.println(b + ">" + c + ">" + a);
        }
        if (c > a && c > b && a > b) {
            System.out.println(c + ">" + a + ">" + b);
        }
        if (c > a && c > b && b > a) {
            System.out.println(c + ">" + b + ">" + a);
        }
    }
}