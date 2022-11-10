package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String [] names= {"umran gulle", "eren erdogan", "buse ozdemir", "ayse bayramhan", "dilara gulle",
                "esra gulle", "gulsen gulle", "yasemin gulle", "emine gulle", "alper bayramhan" };

        for (String name : names) {
            String initial= name.charAt(0)+"."+ name.charAt(name.indexOf(" ")+1);
            System.out.println(initial);

        }

    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */