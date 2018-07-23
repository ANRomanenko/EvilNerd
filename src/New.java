import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner Bender = new Scanner(System.in);
        double fn, sn, result;

        System.out.println("Введите 2 кота : ");
        fn = Bender.nextDouble();
        System.out.println("Введите второе число: ");
        sn = Bender.nextDouble();

        result = fn * sn ;

        System.out.println("Сумма равна: " + result);
    }
}
