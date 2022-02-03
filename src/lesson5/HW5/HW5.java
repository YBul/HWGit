package lesson5.HW5;

public class HW5 {

    public static void main(String[] args) {
        Employee[] stateArray = new Employee[5];
        stateArray[0] = new Employee("Ложкин Сергей Иванович", "Генеральный директор", "ls@company.ru", "+79856667755", 550000, 55);
        stateArray[1] = new Employee("Кулаков Дмитрий Владимирович", "Коммерческий директор", "kd@company.ru", "+79857778899", 300000, 39);
        stateArray[2] = new Employee("Иванова Наталья Петровна", "Главный бухгалтер", "in@company.ru", "+79165674534", 250000, 35);
        stateArray[3] = new Employee("Петрова Анастасия Сергеевна", "Секретарь", "pa@company.ru", "+79163452345", 50000, 21);
        stateArray[4] = new Employee("Сидоров Анатолий Иванович", "Водитель", "company.ru", "+79038907656", 90000, 45);

        for (int i = 0; i < stateArray.length; i++)
            if (stateArray[i].getAge() > 40) {
                stateArray[i].print();
            }
    }
}