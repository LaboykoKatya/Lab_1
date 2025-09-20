import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N;

        // Зчитування з командного рядка або клавіатури
        if (args.length >= 1) {
            N = Integer.parseInt(args[0]);
            System.out.println("Дані з командного рядка: N = " + N);
        } else {
            System.out.print("Введіть N (кількість перших чисел Фібоначчі): ");
            N = sc.nextInt();
        }

        // Створюємо масив об'єктів
        FibonacciNumber[] numbers = new FibonacciNumber[N];

        // Заповнюємо масив
        for (int i = 0; i < N; i++) {
            long value = FibonacciNumber.fibonacci(i);
            numbers[i] = new FibonacciNumber (i, value);
        }

        // Виводимо ряд чисел
        System.out.println("\nПерші " + N + " чисел Фібоначчі:");
        for (FibonacciNumber num : numbers) {
            System.out.print(num.getValue() + " ");
        }
        System.out.println();

        // Перевірка умови w³ - 1
        System.out.println("\nЧисла, які дорівнюють w³ - 1:");
        boolean found = false;
        for (FibonacciNumber num : numbers) {
            if (FibonacciNumber.isCubeMinusOne(num.getValue())) {
                System.out.println("Індекс " + num.getIndex() + " → " + num.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Серед перших " + N + " чисел таких немає.");
        }

        sc.close();
    }
}
