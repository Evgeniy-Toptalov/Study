package FirstQuarter.Lesson5;

public class HWLesson5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Сидоров Пётр", "Инженер", "123@mail",
                1234, 60000, 30);
        Employee employee2 = new Employee("Иванов Сергей", "Уборщик", "124@mail",
                1235, 30000, 50);
        Employee employee3 = new Employee("Петров Иван", "Програмист", "125@mail",
                1236, 100000, 35);
        Employee employee4 = new Employee("Васильев Павел", "Бухгалтер", "126@mail",
                1237, 50000, 45);
        Employee employee5 = new Employee("Жуков Илья", "Директор", "127@mail",
                1238, 120000, 55);

        Employee[] empArgs = new Employee[5];
        empArgs[0] = employee1;
        empArgs[1] = employee2;
        empArgs[2] = employee3;
        empArgs[3] = employee4;
        empArgs[4] = employee5;

        for (int i = 0; i < empArgs.length; i++) {
            if(empArgs[i].getAge() > 40){
                System.out.println(empArgs[i].toString());
            }
        }
    }
}
