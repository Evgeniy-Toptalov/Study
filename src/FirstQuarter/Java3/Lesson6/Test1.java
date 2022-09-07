package FirstQuarter.Java3.Lesson6;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*При запуске теста вылетает ошибка
java.lang.NoClassDefFoundError: org/opentest4j/AssertionFailedError
не смог никак её убрать, если подскажите что с ней делать то смогу доделать второй метод
*/


public class Test1 {
    @Test
    void testArray() {
        Array4 array4 = new Array4();
        int[] arr1 = {1, 4, 7, 4, 2};
        int[] arrTest1 = array4.returnArr(arr1);
        int[] arrRes1 = {2, 3};
        assertArrayEquals(arrRes1, arrTest1, "Неверное преобразование");

    }
}
