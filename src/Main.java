public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        short age = 19;

        if (age >= 18) {
            System.out.println("Вам уже " + age + " лет. Вы достигли совершенолетия!");
        } else {
            System.out.println("Вам только " + age + " лет. Вы ещё не достигли совершенолетия, нужно немного подождать.");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");

        byte temp = 6;

        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");

        short speed = 70;

        if(speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
    }

}