package lesson5.HW5;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {  //Создали "геттер" для "age"
        return age;
    }


    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                fullName, position, email, phoneNumber, salary, age);}


    public void print() {
        System.out.println(this);
    }

}

