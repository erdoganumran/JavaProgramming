package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a=85;
        int b=2;
        int c=a;
        int d = b;
        int i=0;
        int n=0;

        while(a>=b){
           i++;
            a-=b;

        }

        for (int j = 1; j <= d; j++) {
            n+=c;
        }

        System.out.println("division " + i + " with remainder of "+ a);
        System.out.println("multiplacation "+ n);

    }
}
