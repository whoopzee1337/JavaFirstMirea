package ru.mirea.task6;

import java.util.Arrays;

public class InsertionSort  {
    public static void Sort(Student[] iDNumber) {
        System.out.println(Arrays.toString(iDNumber));
        for (int left = 0 ; left < iDNumber.length; left++){
            Student value = iDNumber[left];
            int i = left - 1;
            for (; i >= 0 ; i--){
                if (value.getId() < iDNumber[i].getId()){
                    iDNumber[i+1] = iDNumber[i];
                }else{
                    break;
                }
            }
            iDNumber[i + 1] = value;
        }
        System.out.println(Arrays.toString(iDNumber));

    }

}
