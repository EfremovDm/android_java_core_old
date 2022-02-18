package ru.efremovdm.lesson5;

/**
 * Урок 3. Практика: разбор примеров использования базовых элементов языка Java
 *
 */
public class HomeWorkApp5 {

    /**
     * 4. Создать массив из 5 сотрудников.
     * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
     *
     * @param args
     */
    public static void main(String[] args) {

        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 20);
        arr[1] = new Employee("Petrov petr", "CEO", "ivivan@mailbox.com", "892312312", 30000, 30);
        arr[2] = new Employee("Sidorov nikolay", "CIO", "ivivan@mailbox.com", "892312312", 30000, 40);
        arr[3] = new Employee("John Smith", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        arr[4] = new Employee("Joe Satriani", "Guitarist", "satriani@satriani.com", "892312312", 30000, 60);

        for (Employee employee : arr) {
            if (employee.getAge() > 40) {
                employee.showInfo();
            }
        }
    }
}