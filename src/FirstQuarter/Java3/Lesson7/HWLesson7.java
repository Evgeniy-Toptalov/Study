package FirstQuarter.Java3.Lesson7;

public class HWLesson7 {

    private static Object obj;
    public static void main(String[] args) throws NotUniqueException {

        Tests classForTesting = new Tests();
        TestsHandler.start(classForTesting.getClass());

    }
}
