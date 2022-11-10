package day24__CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        int [] nums={10,45,50,100,45,200, 567, 345, 675,54};
        int maximum= maxNumber(nums);//maxNumber(nums)--> this represents return max; which is below in other method
        //to reuse max num, I assign it here a new int so maximum=max;
        System.out.println("maximum = " + maximum);
        System.out.println("maximum *2= " + maximum*2);//maximum *2= 1350

    }

    public static int maxNumber(int [] nums){

        int max=nums[0];
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            if (max<=nums[i]){
                max=nums[i];
            }
        }
        return max;// i will use this max in main method above.i use this max as this function result here.

    }



}
