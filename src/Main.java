public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4();
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
    public static void task4 (){
        System.out.println("Задача 4");

        byte age = 24;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        } else if (age >=7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        } else if (age >= 19 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Усли возраст человека больше " + age + " лет, то ему пора ходить на работу.");
        }

    }

}