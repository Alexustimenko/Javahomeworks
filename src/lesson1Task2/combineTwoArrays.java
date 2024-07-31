package lesson1Task2;

import java.util.Scanner; // Импорт класса Scanner для ввода данных с клавиатуры
import java.util.Random; // Импорт класса Random для генерации случайных чисел
import java.util.Arrays; // Импорт класса Arrays для работы с массивами

public class combineTwoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Создание объекта Scanner для ввода данных с клавиатуры
        Random randomSize = new Random(); // Создание объекта Random для генерации случайных чисел

        System.out.println("Введите сколько минимум элементов хотите видеть в массиве: ");
        int minimumSize = input.nextInt(); // Чтение минимального размера первого массива от пользователя

        System.out.println("Введите сколько максимум элементов хотите видеть в массиве: ");
        int maximumSize = input.nextInt(); // Чтение максимального размера первого массива от пользователя

        if (maximumSize <= minimumSize) { // Проверка, что максимальный размер больше минимального
            System.out.println("Значение максимального количества элементов должно быть больше минимального");
            return; // Завершение программы, если условие не выполнено
        }

        int size = minimumSize + randomSize.nextInt(maximumSize - minimumSize + 1); // Вычисление случайного размера первого массива в заданном диапазоне
        int[] firstArray = new int[size]; // Создание первого массива с вычисленным размером

        System.out.println("Введите минимальное значение массива: ");
        int minimumValue = input.nextInt(); // Чтение минимального значения элементов первого массива от пользователя

        System.out.println("Введите максимальное значение массива: ");
        int maximumValue = input.nextInt(); // Чтение максимального значения элементов первого массива от пользователя

        if (maximumValue <= minimumValue) { // Проверка, что максимальное значение больше минимального
            System.out.println("Значение максимального элемента должно быть больше минимального");
            return; // Завершение программы, если условие не выполнено
        }

        for (int i = 0; i < firstArray.length; i++) { // Заполнение первого массива случайными числами в заданном диапазоне
            firstArray[i] = minimumValue + randomSize.nextInt(maximumValue - minimumValue + 1);
        }

        System.out.println("Первый массив размера: " + size + ": ");
        System.out.println(Arrays.toString(firstArray)); // Вывод первого массива на экран

        System.out.println("Введите сколько минимум элементов хотите видеть во втором массиве: ");
        minimumSize = input.nextInt(); // Чтение минимального размера второго массива от пользователя

        System.out.println("Введите сколько максимум элементов хотите видеть во втором массиве: ");
        maximumSize = input.nextInt(); // Чтение максимального размера второго массива от пользователя

        if (maximumSize <= minimumSize) { // Проверка, что максимальный размер второго массива больше минимального
            System.out.println("Значение максимального количества элементов должно быть больше минимального");
            return; // Завершение программы, если условие не выполнено
        }

        size = minimumSize + randomSize.nextInt(maximumSize - minimumSize + 1); // Вычисление случайного размера второго массива в заданном диапазоне
        int[] secondArray = new int[size]; // Создание второго массива с вычисленным размером

        System.out.println("Введите минимальное значение второго массива: ");
        minimumValue = input.nextInt(); // Чтение минимального значения элементов второго массива от пользователя

        System.out.println("Введите максимальное значение второго массива: ");
        maximumValue = input.nextInt(); // Чтение максимального значения элементов второго массива от пользователя

        if (maximumValue <= minimumValue) { // Проверка, что максимальное значение второго массива больше минимального
            System.out.println("Значение максимального элемента должно быть больше минимального");
            return; // Завершение программы, если условие не выполнено
        }

        for (int i = 0; i < secondArray.length; i++) { // Заполнение второго массива случайными числами в заданном диапазоне
            secondArray[i] = minimumValue + randomSize.nextInt(maximumValue - minimumValue + 1);
        }

        System.out.println("Второй массив размера: " + size + ": ");
        System.out.println(Arrays.toString(secondArray)); // Вывод второго массива на экран

        System.out.println("Объединенный массив: ");
        int[] combinedArray = new int[firstArray.length + secondArray.length]; // Создание массива для хранения объединенных данных

        System.arraycopy(firstArray, 0, combinedArray, 0, firstArray.length); // Копирование первого массива в объединенный массив
        System.arraycopy(secondArray, 0, combinedArray, firstArray.length, secondArray.length); // Копирование второго массива в объединенный массив

        System.out.println(Arrays.toString(combinedArray)); // Вывод объединенного массива на экран
    }
}
