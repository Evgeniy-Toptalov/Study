package FirstQuarter.Lesson3;


import java.util.Arrays;

public class HWLesson3 {
    public static void main(String[] args) {
        //task 1
        int[] array1 = {1, 1, 0, 1, 0, 0};
        for (int i = 0; i <= array1.length - 1; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array1));

        //task 2
        int[] array2 = new int[101];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i;
        }
        System.out.println(Arrays.toString(array2));

        //task 3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <= array3.length - 1; i++) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array3));

        //task 4
        int matriceLength = 5;
        int[][] matrice1 = new int[matriceLength][matriceLength];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                if (i == j) {
                    matrice1[i][j] = 1;
                }
                if (i + j == matriceLength - 1) {
                    matrice1[i][j] = 1;
                }
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }

        //task 5
        int[] x = arrayCreation(5, 3);
        System.out.println(Arrays.toString(x));

        //task 6
        int[] array4 = {-1, 4, 6, 15, 8, -3};
        int a = array4[0];
        int b = array4[0];
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] > a) {
                a = array4[i];
            }
            if (array4[i] < b) {
                b = array4[i];
            }
        }
        System.out.println(a);
        System.out.println(b);

        //task 7
        int[] array5 = {1, 4, 6, 2, 10, 3};
        boolean y = checkBalance(array5);
        System.out.println(y);

        //task 8
        int[] array6 = {1, 2, 3};
        arrayOffset(array6, 1);


    }

    public static int[] arrayCreation(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static boolean checkBalance(int[] arr){
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            c += arr[i];
        }
        int a = 0;
        int b = 0;
        out:
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
            b = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                b += arr[j];
                if (a == b) {
                    break out;
                }
            }
        }
        if (a == c){
            return false;
        } else {
            return true;
        }
    }

    public static void arrayOffset(int[] arr, int n){



    }




}

