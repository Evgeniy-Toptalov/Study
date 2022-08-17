package FirstQuarter.Java3.Lesson1;

import java.util.ArrayList;
import java.util.List;

public class Tasks12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,};
        int[] arr2 = {5, 6, 7,};

        //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        arrUpheaval(arr);
        //2. Написать метод, который преобразует массив в ArrayList;
        System.out.println(arrToList(arr2));

    }

    public static void arrUpheaval(int[] arr) {
        int a = arr[0];
        int b = arr[arr.length - 1];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == 0) {
                arr[i] = b;
            } else if (i == arr.length - 1) {
                arr[i] = a;
            }
            System.out.println(arr[i]);
        }
    }

    public static List<Integer> arrToList(int[] arr) {
        List<Integer> listArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            listArr.add(arr[i]);
        }
        return listArr;
    }
}
