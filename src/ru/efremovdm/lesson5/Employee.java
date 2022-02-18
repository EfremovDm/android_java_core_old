package ru.efremovdm.lesson5;

/**
 * Урок 5. Введение в ООП
 *
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 */
public class Employee {

    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    /**
     * 2. Конструктор класса должен заполнять эти поля при создании объекта.
     *
     * @param fio
     * @param position
     * @param email
     * @param phone
     * @param salary
     * @param age
     */
    public Employee(String fio, String position, String email, String phone, int salary ,int age) {
        setFio(fio);
        setPosition(position);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(age);
    }

    public String getFio() {
        return this.fio;
    }

    public String getPosition() {
        return this.position;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     */
    public void showInfo() {
        System.out.println(
            "ФИО: " + getFio()
                + ", должность: " + getPosition()
                + ", e-mail: " + getEmail()
                + ", телефон: " + getPosition()
                + ", зарплата: " + getSalary()
                + ", возраст: " + getAge()
        );
    }
}
