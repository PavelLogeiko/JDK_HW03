package Pair;

public class PairTest {
    public static void main(String[] args) {
        String[] words = {"name1", "b", "name3", "c", "name2", "a"};

        System.out.println("Задан следующий строковый массив <words>:\n");
        for (int i = 0; i < 6; i++) {
            System.out.println(words[i]);
        }
        System.out.println("\nВыполним поиск минимального и максимального значений,\n" +
                "упакованные в пару.");

        Pair<String> mm = ArrayAlg.minmax(words);

        System.out.println("\nВыводим результат сравнения:\n");
        System.out.println("1) Минимальное значение массива <words> = " + mm.getFirst());
        System.out.println("\n2) Максимальное значение массива <words> = " + mm.getSecond());
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        this.first = null;
        this.second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }


    public void setFirst(T first) {
        this.first = first;
    }


    public T getSecond() {
        return second;
    }


    public void setSecond(T second) {
        this.second = second;
    }
}

class ArrayAlg {

    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}
