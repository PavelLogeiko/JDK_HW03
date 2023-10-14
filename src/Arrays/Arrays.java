package Arrays;

import java.util.Objects;
import java.util.stream.IntStream;

class Arrays
{
    private static <U, V> boolean compareArrays(U[] a, V[] b)
    {
        if (a == b) {
            return true;
        }

        if (a == null || b == null) {
            return false;
        }

        if (!a.getClass().equals(b.getClass())) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        return IntStream.range(0, a.length).allMatch(i -> Objects.equals(a[i], b[i]));
    }

    public static void main(String[] args)
    {
        String[] a = { "public", "static", "void", "main" };
        String[] b = { "public", "static", "void", "fun" };

        System.out.println("\nИмеется строковый массив <a> со следующими значениями:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }
        System.out.println("\nИмеется строковый массив <b> со следующими значениями:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(b[i]);
        }

        System.out.println("\nЗапускаем метод <compareArrays>, чтобы сравнить массивы.\n");
        if (compareArrays(a, b)) {
            System.out.println("Результат сравнения - массивы идентичны.");
        }
        else {
            System.out.println("Результат сравнения - массивы не идентичны.");
        }
    }
}