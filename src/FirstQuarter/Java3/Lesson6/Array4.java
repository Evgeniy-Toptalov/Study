package FirstQuarter.Java3.Lesson6;


public class Array4 {

    int[] arr = {1, 4, 7, 4, 2};
    //int[] arrReturn = new int[2];

    public Array4() {
    }


    public int[] returnArr(int[] arr) {
        int[] arrReturn = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                if (arrReturn[0] == 0) {
                    arrReturn[0] = arr[i + 1];
                } else {
                    arrReturn[1] = arr[i + 1];
                }
            }
        }
        return arrReturn;
    }
}
