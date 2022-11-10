package day25_CustomMethod_Overloading;

public class minNumber {
    public static void main(String[] args) {
        int minInt=minNumber(new int[]{4,6,8,10,20,4,40,7,30});
        System.out.println(minInt);

        double minDouble=minNumber(new double[]{4.0,6.0,8.0,10.0,20.0,4.0,40.0,7.0,30.0});
        System.out.println(minDouble);

        long minLong=minNumber(new long[]{4,6,8,10,20,4,40,7,30});
        System.out.println(minLong);

        short minShort=minNumber(new short[]{4,6,8,10,20,4,40,7,30});
        System.out.println(minShort);

        float minFloat=minNumber(new float[]{4,6,8,10,20,4,40,7,30});
        System.out.println(minFloat);

        byte minByte=minNumber(new byte[]{4,6,8,10,20,4,40,7,30});
        System.out.println(minByte);

    }
    public static int minNumber(int[] numbers){
        int min= numbers[0];
        for (int each:numbers){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static double minNumber(double[] numbers){
        double min= numbers[0];
        for (double each:numbers){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static long minNumber(long[] numbers){
        long min= numbers[0];
        for (long each:numbers){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static short minNumber(short[] numbers){
        short min= numbers[0];
        for (short each:numbers){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static float minNumber(float[] numbers){
        float min= numbers[0];
        for (float each:numbers){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static byte minNumber(byte[] numbers){
        byte min= numbers[0];
        for (byte each:numbers){
            if(each<min){
                min=each;
            }
        }
        return min;
    }


}

