import java.util.Scanner;

public class Vuvod {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        double fn, sn, result;

        System.out.println("Введите первое число: ");
        fn = id.nextDouble();
        System.out.println("Введите второе число: ");
        sn = id.nextDouble();

        result = fn + sn;
        System.out.println("Сумма равна: " + result);
    }
}
