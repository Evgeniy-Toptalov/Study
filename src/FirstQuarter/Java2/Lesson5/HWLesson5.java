package FirstQuarter.Java2.Lesson5;

import java.util.Arrays;

public class HWLesson5 {
    public static void main(String[] args) throws InterruptedException {
        int size = 10_000_000;
        int half = size / 2;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        float[] leftHalf = new float[half];
        float[] rightHalf = new float[half];


        firstMethod(arr);
        secondMethod(arr, size, half);
    }


    public static void firstMethod(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                    / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }

    public static void secondMethod(float[] arr, int size, int half) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        float[] leftHalf = new float[half];
        float[] rightHalf = new float[half];

        System.arraycopy(arr, 0, leftHalf, 0, half);
        System.arraycopy(arr, half, rightHalf, 0, half);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < leftHalf.length; i++) {
                    leftHalf[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                            / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < rightHalf.length; i++) {
                    rightHalf[i] = (float) (rightHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i
                            / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        float[] mergedArray = new float[size];
        System.arraycopy(leftHalf, 0, mergedArray, 0, half);
        System.arraycopy(rightHalf, 0, mergedArray, half, half);

        System.out.println("Two thread time: " + (System.currentTimeMillis() -
                startTime) + " ms.");
    }
}
