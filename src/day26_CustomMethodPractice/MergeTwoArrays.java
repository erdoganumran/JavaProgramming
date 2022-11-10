package day26_CustomMethodPractice;

public class MergeTwoArrays {
    public static int[] merge(int[] arr1, int[] arr2){
        int[]result=new int[arr1.length+arr2.length];

        int i=0;
        for(int each:arr1){
            result[i++]=each;
        }
        for(int each:arr2){
            result[i++]=each;
        }
        return result;
    }

    public static void main(String[] args) {
        int[]arr1={1,2,3,4};
        int[]arr2={5,6,7,8};

        int[]result= merge(arr1,arr2);
    }
}
