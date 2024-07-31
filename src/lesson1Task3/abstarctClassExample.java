package lesson1Task3;

// Абстрактный класс Shape
abstract class Shape {
    // Абстрактный метод для вычисления площади
    abstract double calculateArea();
}

// Класс Circle, наследующий от Shape
class Circle extends Shape {
    private double r; // Радиус круга

    // Конструктор Circle
    public Circle(double rad) {
        this.r = rad; // Инициализация радиуса
    }

    // Реализация метода calculateArea() для круга
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(r, 2); // Площадь круга: π * r^2
    }
}

// Класс Rectangle, наследующий от Shape
class Rectangle extends Shape {
    private double width;  // Ширина прямоугольника
    private double height; // Высота прямоугольника

    // Конструктор Rectangle
    public Rectangle(double width, double height) {
        this.width = width;   // Инициализация ширины
        this.height = height; // Инициализация высоты
    }

    // Реализация метода calculateArea() для прямоугольника
    @Override
    double calculateArea() {
        return width * height; // Площадь прямоугольника: width * height
    }
}

// Класс для демонстрации использования
public class abstarctClassExample {
    public static void main(String[] args) {
        // Создание объекта Circle с радиусом 10
        Shape circle = new Circle(10);

        // Создание объекта Rectangle с шириной 22 и высотой 100
        Shape rectangle = new Rectangle(22, 100);

        // Вывод площади круга
        System.out.println("Площадь круга = " + circle.calculateArea());

        // Вывод площади прямоугольника
        System.out.println("Площадь прямоугольника = " + rectangle.calculateArea());
    }
}
