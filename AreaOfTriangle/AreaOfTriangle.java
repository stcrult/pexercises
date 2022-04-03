import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1. kenarın uzunluğunu giriniz");
        float side1 = s.nextFloat();
        System.out.println("2. kenarın uzunluğunu giriniz");
        float side2 = s.nextFloat();
        System.out.println("3. kenarın uzunluğunu giriniz");
        float side3 = s.nextFloat();

        float u = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
        System.out.println("Üçgenin Alanı = " + area);
    }
}
