package Lesson_1_task_1;

import java.util.Arrays; // Импорт класса Arrays для работы с массивами
import java.util.Random; // Импорт класса Random для генерации случайных чисел
import java.util.Scanner; // Импорт класса Scanner для чтения ввода пользователя

public class randomArrayTask1MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Создание объекта Scanner для ввода данных с клавиатуры
        Random sizeRandom = new Random(); // Создание объекта Random для генерации случайных чисел

        System.out.println("Введите сколько минимум элементов хотите видеть в массиве: ");
        int minimumSize = input.nextInt(); // Чтение минимального размера массива от пользователя

        System.out.println("Введите сколько максимум элементов хотите видеть в массиве: ");
        int maximumSize = input.nextInt(); // Чтение максимального размера массива от пользователя

        if (maximumSize <= minimumSize) { // Проверка, что максимальный размер больше минимального
            System.out.println("Значение максимального количества элементов должно быть больше минимального");
            return; // Завершение программы, если условие не выполнено
        }

        int size = minimumSize + sizeRandom.nextInt(maximumSize - minimumSize + 1); // Вычисление случайного размера массива в заданном диапазоне
        int[] arrayToSearchIn = new int[size]; // Создание массива с случайным размером

        System.out.println("Введите минимальное значение массива: ");
        int minimumValue = input.nextInt(); // Чтение минимального значения элементов массива от пользователя

        System.out.println("Введите максимальное значение массива: ");
        int maximumValue = input.nextInt(); // Чтение максимального значения элементов массива от пользователя

        if (maximumValue <= minimumValue) { // Проверка, что максимальное значение больше минимального
            System.out.println("Значение максимального элемента должно быть больше минимального");
            return; // Завершение программы, если условие не выполнено
        }

        for (int i = 0; i < arrayToSearchIn.length; i++) { // Заполнение массива случайными числами в заданном диапазоне
            arrayToSearchIn[i] = minimumValue + sizeRandom.nextInt(maximumValue - minimumValue + 1);
        }

        System.out.println("Массив размера " + size + ": ");
        System.out.println(Arrays.toString(arrayToSearchIn)); // Вывод массива на экран

        // Вывод максимального элемента массива. Метод max() возвращает OptionalInt, поэтому необходимо его обработать
        System.out.println("Максимальный элемент в массиве = " + Arrays.stream(arrayToSearchIn).max());
    }
}
