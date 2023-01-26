package day29_ArrayList;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 != 0 ){
                list.remove(i);//because collection size is dynamic that means when we remove something at every iteration index number will change and it is not going to give correct result
            }//that is why we have remove if method
        }
*/
        System.out.println(list);
//LAMBDA EXPRESSION. it is in iterable interface. removeIf function uses iterable implicitly. it can work with any collection type.
        list.removeIf( p ->  p < 5 ); //Lambda Expression
//p is variable name(each elements name) -> that means ARROW token is you are giving lambda expression. and it s already includes for method and iterator implicitly
        System.out.println(list);

        System.out.println("------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//REMOVEIF: Whenever you have a condition use this method.
        list2.removeIf( each ->  each%2 ==0 );

        System.out.println(list2);


        System.out.println("------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));
//STARTSWITH
        list3.removeIf( p ->  p.startsWith("J") );

        System.out.println(list3);


        System.out.println("------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf(name-> !StringUtility.isPalindrome(name));

        System.out.println(names);


    }
}
