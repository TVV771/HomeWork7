public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }


    public static void task1() {
        System.out.println("Задача 1");
        int save = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + save;
            System.out.println("Месяц " + i + "," + "сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationY = 12_000_000;
        int bornY = 17;
        int deathY = 8;
        int dif = bornY - deathY;
        for (int i = 1; i <= 10; i++) {
            populationY += populationY * dif / 1000;
            System.out.println("Год " + i + " численость населения составляет " + populationY);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 12000000) {
            i++;
            total += (total * 0.07);
            total = total + salary;
            System.out.println("Месяц " + i + " сумма " + total);
        }
    }


    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; total < 12_000_000; i++) {
            total += (total * 0.07);
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(total);
    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = salary;
            salary *= 1 + 0.07 * 6;
                System.out.printf("Месяц %d , итого %d \n", i, salary-sumBefore);
            }
        }


    public static void task7() {
        System.out.println("Задача 7");
        int mountFriday = 7;
        for (int currentFriday = mountFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница " + currentFriday + "-е число.Необходимо подготовить отчет ");
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i <= ending; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }

        }
    }
}




