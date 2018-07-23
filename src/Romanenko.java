import java.util.Random;
import java.util.Scanner;

public class Romanenko {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner enter = new Scanner(System.in);

        int Padre, Madre, Yo, Ermana, Full;
        Padre = 0;
        Madre = 0;
        Yo = 0;
        Ermana = 0;


        System.out.println("Введите примерный тест:");
        Full = enter.nextInt();
        while (Full<100){
            Padre += random.nextInt(100);
            Madre += random.nextInt(100);
            Yo += random.nextInt(100);
            Ermana += random.nextInt(100);
            Full++;
        }
        System.out.println("В ваши года в " + Full + " лет, я верю в тесты!");
        System.out.println("Вы счвстливы на " + Padre + "!!!");
        System.out.println("Вы счвстливы на " + Madre + "!!!");
        System.out.println("Вы счвстливы на " + Yo + "!!!");
        System.out.println("Вы счвстливы на " + Ermana + "!!!");
    }
}
