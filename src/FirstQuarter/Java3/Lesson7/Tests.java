package FirstQuarter.Java3.Lesson7;

public class Tests {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("test BeforeSuite");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("test1");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("test2");
    }

    @AfterSuite
    public void AfterSuite1(){
        System.out.println("test AfterSuite");
    }

   /* @AfterSuite
    public void AfterSuite2(){
        System.out.println("test AfterSuite");
    }*/

}
