package FirstQuarter.Java2.Lesson2;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Некорректный размер массива, задайте размер 4х4");
    }

    @Override
    public String getMessage() {
        return "Некорректный размер массива, задайте размер 4х4";
    }
}

