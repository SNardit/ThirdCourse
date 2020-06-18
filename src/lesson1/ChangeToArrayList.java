package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeToArrayList {

    public static <T> ArrayList<T> changeToArrayList (T[] arr) {

        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        return arrayList;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {5, 2, 6, 8};
        Double[] arr2 = {5.62, 7.39, 9.0, 1.4};
        String [] arr3 = {"cat", "dog", "bird"};

        System.out.println(changeToArrayList(arr1) + " " + changeToArrayList(arr1).getClass().getSimpleName());
        System.out.println(changeToArrayList(arr2) + " " + changeToArrayList(arr2).getClass().getSimpleName());
        System.out.println(changeToArrayList(arr3) + " " + changeToArrayList(arr3).getClass().getSimpleName());



    }
}
