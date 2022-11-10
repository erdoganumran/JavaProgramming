package day25_CustomMethod_Overloading;

public class maxNumber {
    public static void main(String[] args) {
        int maxInt=maxNumber(new int[]{4,6,8,10,20,4,40,7,30});
        System.out.println(maxInt);

        double maxDouble=maxNumber(new double[]{4.0,6.0,8.0,10.0,20.0,4.0,40.0,7.0,30.0});
        System.out.println(maxDouble);

        long maxLong=maxNumber(new long[]{4,6,8,10,20,4,40,7,30});
        System.out.println(maxLong);

        short maxShort=maxNumber(new short[]{4,6,8,10,20,4,40,7,30});
        System.out.println(maxShort);

        float maxFloat=maxNumber(new float[]{4,6,8,10,20,4,40,7,30});
        System.out.println(maxFloat);

        byte maxByte=maxNumber(new byte[]{4,6,8,10,20,4,40,7,30});
        System.out.println(maxByte);

    }
    public static int maxNumber(int[] numbers){
        int max= numbers[0];
        for (int each:numbers){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static double maxNumber(double[] numbers){
        double max= numbers[0];
        for (double each:numbers){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static long maxNumber(long[] numbers){
        long max= numbers[0];
        for (long each:numbers){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static short maxNumber(short[] numbers){
        short max= numbers[0];
        for (short each:numbers){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static float maxNumber(float[] numbers){
        float max= numbers[0];
        for (float each:numbers){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static byte maxNumber(byte[] numbers){
        byte max= numbers[0];
        for (byte each:numbers){
            if(each>max){
                max=each;
            }
        }
        return max;
    }


}
/*

Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

 */