package FirstQuarter.Lesson2;

public class HWLesson2 {
    public static void main(String[] args) {
        boolean x = check(5, 3);
        System.out.println(x);

        numberType1(5);

        boolean y = numberType2(7);
        System.out.println(y);

        printer("GigBrains", 5);

        boolean z = leapYear(2022);
        System.out.println(z);

    }

    public static boolean check(int a, int b) {
        // boolean c;
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else
            return false;
    }

    public static void numberType1(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else
            System.out.println("число отрицательное");
    }

    public static boolean numberType2(int a) {
        if (a >= 0) {
            return false;
        } else
            return true;
    }

    public static void printer(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else
            return false;
    }


}
