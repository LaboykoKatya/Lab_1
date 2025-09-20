public class FibonacciNumber {
    private int index;   // номер числа
    private long value;  // значення числа

    public FibonacciNumber(int index, long value) {
        this.index = index;
        this.value = value;
    } //конструктор

    public int getIndex() {
        return index;
    }

    public long getValue() {
        return value;
    }

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

    // Перевірка: чи число дорівнює w³ - 1
    public static boolean isCubeMinusOne(long num) {
        if (num < 0) return false;
        long w = Math.round(Math.cbrt(num + 1));
        return (w * w * w - 1 == num);
    }

}
