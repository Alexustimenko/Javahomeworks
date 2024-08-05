package Lesson1Task4;

// Абстрактный класс Employee
abstract class Employee {
    // Абстрактный метод для вычисления зарплаты
    abstract double calculateSalary();
}

// Класс FullTimeEmployee, наследующий от Employee
class FullTimeEmployee extends Employee {
    private final double monthlySalary; // Месячная зарплата сотрудника

    // Конструктор FullTimeEmployee
    public FullTimeEmployee(double salary) {
        this.monthlySalary = salary; // Инициализация месячной зарплаты
    }

    // Реализация метода calculateSalary() для полного рабочего дня
    @Override
    double calculateSalary() {
        return monthlySalary; // Возвращение месячной зарплаты
    }
}

// Класс PartTimeEmployee, наследующий от Employee
class PartTimeEmployee extends Employee {
    private final double hourlyRate;  // Почасовая ставка
    private final double hoursWorked; // Количество отработанных часов

    // Конструктор PartTimeEmployee
    public PartTimeEmployee(double rate, double hours) {
        this.hourlyRate = rate;      // Инициализация почасовой ставки
        this.hoursWorked = hours;    // Инициализация количества отработанных часов
    }

    // Реализация метода calculateSalary() для неполного рабочего дня
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate; // Зарплата = количество часов * почасовая ставка
    }
}

// Класс для демонстрации использования
public class AbstractClassWorkersSalary {
    public static void main(String[] args) {
        // Создание объекта FullTimeEmployee с месячной зарплатой 1000
        Employee fullTimeWorker = new FullTimeEmployee(1000);

        // Создание объекта PartTimeEmployee с почасовой ставкой 3.30 и 10 отработанными часами
        Employee partTimeWorker = new PartTimeEmployee(3.30, 10);

        // Вывод зарплаты полного рабочего дня
        System.out.println("Зарплата рабочего, который работает полный день = " + fullTimeWorker.calculateSalary());

        // Вывод зарплаты рабочего с почасовым окладом
        System.out.println("Зарплата рабочего с почасовым окладом = " + partTimeWorker.calculateSalary());
    }
}
