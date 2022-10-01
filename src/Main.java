import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 5");
        System.out.println("определение времени года");
        System.out.println("Введите месяц:");
        int monthNumber = sc.nextInt();
        if (monthNumber >= 13) {
            System.out.println( "Иди учись в школу!!!");
        } else {
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }
        }
    }

    private static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 4");
        System.out.println("Определение времени доставки");
        System.out.println("Введите расстояние в километрах:");
        int deliveryDistance = sc.nextInt();

        if (deliveryDistance <20 ) {
            System.out.printf("Потребуется 1 день для доставки на расстояние %d км", deliveryDistance);
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.printf("Потребуется 2 дня для доставки на расстояние %d км", deliveryDistance);
            }
        else if (deliveryDistance >= 60 && deliveryDistance <100){
            System.out.printf("Потребуется 3 дня для доставки на расстояние %d км", deliveryDistance);
        } else {
            System.out.println("в такую ж..у мы не доставляем");
        }
        System.out.println();
    }

        private static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 3");
        System.out.println("Вычисление високосного года");
        System.out.println("введите год :");

        int year = sc.nextInt();

        if (year%400 == 0) { System.out.printf("%d год високосный", year); }
        else if ( year % 4 == 0 && year%100 != 0) {
                System.out.printf("%d год високосный", year);
            } else {System.out.printf("%d год не високосный", year);}
        System.out.println();


    }

    private static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 2");
        System.out.println("введите 1 если у вас iOS и введите 0 если Android :");

        int clientOS = sc.nextInt();
        System.out.println("введите год выпуска вашей модели в формате ХХХХ");
        int yearOfRelease = sc.nextInt();
        if (clientOS > 0) {
            if (yearOfRelease >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        else {
            if (yearOfRelease >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        }
        System.out.println();
    }

    private static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 1");
        System.out.println("введите 1 если у вас iOS и введите 0 если Android :");

        int clientOS = sc.nextInt();
        if (clientOS > 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

}