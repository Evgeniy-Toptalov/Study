package FirstQuarter.Java3.Lesson7;

public class NotUniqueException extends Exception{

    public NotUniqueException(){
        //super(type + " не уникален");
        System.out.println("Метод не уникален");
    }
}
