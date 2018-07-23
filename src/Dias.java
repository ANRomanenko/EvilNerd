import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner Buenos = new Scanner(System.in);
        double fn, sn, result;

        System.out.println("Введите первое число: ");
        fn = Buenos.nextDouble();
        System.out.println("Введите второе число: ");
        sn = Buenos.nextDouble();

        result = fn + sn;
        System.out.println("Сумма равна: " + result);
    }
}
