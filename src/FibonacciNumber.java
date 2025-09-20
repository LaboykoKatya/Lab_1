/**
 * Клас FibonacciNumber представляє число Фібоначчі з його індексом та значенням.
 * Містить методи для обчислення чисел Фібоначчі та перевірки певної умови.
 */
public class FibonacciNumber {
    /** Індекс числа у послідовності. */
    private int index;   // номер числа
    /** Значення числа Фібоначчі. */
    private long value;  // значення числа
    /**
     * Конструктор для створення об'єкта FibonacciNumber.
     * @param index індекс числа у послідовності
     * @param value значення числа Фібоначчі
     */
    public FibonacciNumber(int index, long value) {
        this.index = index;
        this.value = value;
    } //конструктор
    /**
     * Отримати індекс числа.
     * @return індекс числа
     */
    public int getIndex() {
        return index;
    }
    /**
     * Отримати значення числа.
     * @return значення числа Фібоначчі
     */
    public long getValue() {
        return value;
    }
    /**
     * Обчислює n-те число Фібоначчі, починаючи з Fib(0)=0, Fib(1)=1.
     * @param n індекс числа
     * @return n-те число Фібоначчі
     */
    // Обчислення n-го числа Фібоначчі (починаючи з Fib(0)=0, Fib(1)=1)
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    /**
     * Перевіряє, чи є число на одиницю меншим від деякого куба (w³ - 1).
     * @param num число для перевірки
     * @return true, якщо число = w³ - 1, інакше false
     */
    // Перевірка: чи число дорівнює w³ - 1
    public static boolean isCubeMinusOne(long num) {
        if (num < 0) return false;
        long w = Math.round(Math.cbrt(num + 1));
        return (w * w * w - 1 == num);
    }

}
