package FirstQuarter.Java2.Lesson2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        super("В ячейке " + i + " " + j + " находится не корректное значение");
    }
        public String getMessage (int i, int j) {
            return "В ячейке " + i + " " + j + " находится не корректное значение";
        }
    }
