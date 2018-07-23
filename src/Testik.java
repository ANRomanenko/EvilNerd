import java.util.Scanner;

public class Testik {
    public static void main(String[] args){
        Scanner test = new Scanner(System.in);

        double fn, sn, result;

        System.out.println("Введите первое число: ");
        fn = test.nextDouble();
        System.out.println("Введите второе число: ");
        sn = test.nextDouble();

        result = fn - sn;
        System.out.println("Сумма равна: " + result);
    }
}
