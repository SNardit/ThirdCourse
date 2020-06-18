package lesson1;

import java.util.Arrays;

public class SwapArrayElements {

    public static <T> T[] swapElements (T[] arr, int a, int b) {
        if (a >= 0 && a < arr.length && b >= 0 && b < arr.length) {
            T bNew = arr[a];
            arr[a] = arr[b];
            arr[b] = bNew;
        } else {
            System.out.println("Введен не существующий индекс массива! Изменения не были совершенны!");
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        Float[] arrForError = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        //try {
            System.out.println("arr1:" + '\n' + Arrays.toString(arr1) + '\n' + Arrays.toString(swapElements (arr1, 1, 4)));
            System.out.println("arr2:" + '\n' + Arrays.toString(arr2) + '\n' + Arrays.toString(swapElements (arr2, 0, 3)));
            System.out.println("arrForError:" + '\n' + Arrays.toString(arrForError) + '\n' + Arrays.toString(swapElements (arrForError, 0, 6)));

        /*} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введен не существующий индекс массива");
        }*/

    }
}

