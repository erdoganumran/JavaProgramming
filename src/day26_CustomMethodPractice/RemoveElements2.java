package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {
    public static void main(String[] args) {

    }

    public static int[] removeElements(int[] array, int index) {
        int [] result={};
        if(index<0||index> array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }
        for (int i=0;i< array.length;i++){
            if(i!=index){
                result= ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;

    }
}
