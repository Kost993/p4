import java.util.Scanner;

class DataInputAndFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних користувачем
        System.out.printf("Введіть ціле число: ");
        int intValue = scanner.nextInt();

        System.out.printf("Введіть число з плаваючою точкою: ");
        double doubleValue = scanner.nextDouble();

        System.out.printf("Введіть рядок: ");
        scanner.nextLine();  // для захоплення символу нової строки після nextDouble()
        String stringValue = scanner.nextLine();

        System.out.printf("Введіть логічне значення (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // Виведення даних у різних форматах
        System.out.printf("\nФорматований вивід:\n");

        // Формат 1: Стандартний вивід
        System.out.printf("1. Стандартний вивід:\n");
        System.out.printf("Ціле число: %d\n", intValue);
        System.out.printf("Число з плаваючою точкою: %f\n", doubleValue);
        System.out.printf("Рядок: %s\n", stringValue);
        System.out.printf("Логічне значення: %b\n", booleanValue);

        // Формат 2: Виведення цілого числа у восьміричному форматі
        System.out.printf("\n2. Восьміричний формат для цілого числа:\n");
        System.out.printf("Ціле число (восьміричний формат): %o\n", intValue);

        // Формат 3: Виведення цілого числа у шістнадцятковому форматі
        System.out.printf("\n3. Шістнадцятковий формат для цілого числа:\n");
        System.out.printf("Ціле число (шістнадцятковий формат): %x\n", intValue);

        // Формат 4: Число з плаваючою точкою з двома знаками після коми
        System.out.printf("\n4. Число з плаваючою точкою з двома знаками після коми:\n");
        System.out.printf("Число з плаваючою точкою: %.2f\n", doubleValue);

        // Формат 5: Рядок з обмеженням довжини (перші 5 символів)
        System.out.printf("\n5. Рядок з обмеженням довжини (перші 5 символів):\n");
        System.out.printf("Рядок: %.5s\n", stringValue);

        // Формат 6: Рядок з мінімальною довжиною поля (15 символів)
        System.out.printf("\n6. Рядок з мінімальною довжиною поля (15 символів):\n");
        System.out.printf("Рядок: %-15s\n", stringValue);

        // Формат 7: Число з плаваючою точкою в експоненціальній формі
        System.out.printf("\n7. Число з плаваючою точкою в експоненціальній формі:\n");
        System.out.printf("Число з плаваючою точкою: %e\n", doubleValue);

        // Формат 8: Логічне значення у верхньому регістрі
        System.out.printf("\n8. Логічне значення у верхньому регістрі:\n");
        System.out.printf("Логічне значення: %B\n", booleanValue);

        // Формат 9: Число з плаваючою точкою з фіксованою шириною поля (20 символів)
        System.out.printf("\n9. Число з плаваючою точкою з фіксованою шириною поля (20 символів):\n");
        System.out.printf("Число з плаваючою точкою: %20.3f\n", doubleValue);

        // Формат 10: Ціле число з фіксованою шириною поля (10 символів)
        System.out.printf("\n10. Ціле число з фіксованою шириною поля (10 символів):\n");
        System.out.printf("Ціле число: %10d\n", intValue);
    }
}
