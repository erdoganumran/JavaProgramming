package day20_Arrays;

public class minNumberOfArray {
    public static void main(String[] args) {
        int []numbers ={10,5,4,20,100,0,-50, 40};
        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];//when array number is smaller than min, min will replace with that array number
            }
        }

        System.out.println(min);

    }
}
