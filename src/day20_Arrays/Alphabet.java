package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char [] ch= new char[26];// 26 characters I assigned
        char f='z';

        //ch[0]='z';ch [1]='y'; ....
        for (int i = 0; i < ch.length; i++, f--) {
            ch[i]=f;//I will assign every index number of my array to a new char until my condition is false. char[0]='z'; char[1]='z'; char[26]='a'
        }

        System.out.println(Arrays.toString(ch));// you always have to use toString method to have an array like [a,b,c,d..]
        //System.out.println(ch[0]);//it will give spesific element 'z'
        System.out.println(ch);//it will give like this abcdef..... not like array [a,b,c,d..]
    }
}
