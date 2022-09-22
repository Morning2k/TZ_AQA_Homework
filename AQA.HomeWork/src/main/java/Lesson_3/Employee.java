package Lesson_3;

public class Employee {
    //Поля класса
    String firstLastName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    //Конструктор
    public Employee(String firstLastName, String position, String email, String phone, int salary, int age) {
        this.firstLastName = firstLastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s Должность: %s Email: %s Номер телефона: %s Зарплата: %d  Возраст: %d",
                firstLastName, position, email, phone, salary, age);
    }

    // Метод вывода в консоль
    public void print() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Employee[] personArray = new Employee[5];
        personArray[0] = new Employee("Ivanov Ivan", "QA", "QAivan@mailbox.com", "892312312", 30000, 30);
        personArray[1] = new Employee("Ivanov Maksim", "Dev", "Devivan@mailbox.com", "123456789", 31000, 41);
        personArray[2] = new Employee("Ivanov Ilya", "PM", "PMivan@mailbox.com", "987654321", 32000, 49);
        personArray[3] = new Employee("Ivanov Andrej", "BA", "BAivan@mailbox.com", "123498765", 30000, 29);
        personArray[4] = new Employee("Ivanov Artem", "HR", "HRivan@mailbox.com", "987651234", 30000, 34);
        for (Employee Employee : personArray) {
            if (Employee.age > 40) System.out.println(Employee);
        }
    }
}