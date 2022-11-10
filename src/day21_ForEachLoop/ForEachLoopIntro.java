package day21_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int each=0;

        int [] numbers = {1,2,3,4,5,6,7};
        for (int i = 0; i < numbers.length; i++) {//i: indexes of array
            each= numbers[i];
            System.out.println(each);
        }

        for(int eachNum: numbers){// if elements datatype is int here data should be int. each:elements of array
            System.out.println(eachNum);}
    }
}
/*
Syntax
for(dataType variable: dataStructure){//statement}
 */