package FirstQuarter.Java2.Lesson2;

public class HWJava2Lesson2 {
    public static void main(String[] args) {

        String[][] array4x4 = {{"1", "2", "3", "4" }, {"5", "6", "7", "8" },
                {"9", "10", "11", "12" }, {"13", "14", "15", "16"}};

        try {
            sumArray(array4x4);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sumArray(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException();
                }
                if (!isInt(arr[i][j])) {
                    throw new MyArrayDataException(i, j);
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        System.out.println(sum);
    }

    private static boolean isInt(String arr) throws NumberFormatException {
        try {
            Integer.parseInt(arr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


