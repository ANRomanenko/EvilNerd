import java.util.Random;
import java.util.Scanner;

public class Happiness {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner enter = new Scanner(System.in);

        int Happines, Luck, Wealth, Health, Intelligence, Age;
        Happines = 0;
        Luck = 0;
        Wealth = 0;
        Health = 0;
        Intelligence = 0;

        System.out.println("Введи совй возраст:");
        Age = enter.nextInt();
        while (Age<100){
            Happines += random.nextInt(100);
            Luck += random.nextInt(100);
            Wealth += random.nextInt(100);
            Health += random.nextInt(100);
            Intelligence += random.nextInt(100);
            Age++;
        }
        System.out.println("В ваши " + Age + " лет, Вы довольно продвинутый перец!");
        System.out.println("Уровень счасть равен " + Happines + "!!!");
        System.out.println("Уровень удачи равен " + Luck + "!!!");
        System.out.println("Уровень благосостояния равен " + Wealth + "!!!");
        System.out.println("Уровень здоровья равен " + Health + "!!!");
        System.out.println("Уровень интелекта равен " + Intelligence + "!!!");
    }
}
