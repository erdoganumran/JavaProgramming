package day24__CustomMethod_Return;

import java.util.Arrays;
import java.util.Scanner;

public class replit_zombi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        int day = 0;
        int population = 1;
        int[] arr = new int[inhabitants.length];
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        while (population > 0) {
            //
            population = 0;
            for (int each : inhabitants) {
                population += each;
            }
            day++;
            //
            if(population==0){
                System.out.println("---- EXTINCT ----");
                System.exit(0);}

            for (int i = 0; i < arr.length; i++) {
                arr[i]=inhabitants[i];
            }
            if (arr[1] == 0) {
                inhabitants[0] = arr[0] / 2;
              }

             for (int i = 1; i < inhabitants.length - 1; i++) {
                if (arr[i - 1] == 0 || arr[i + 1] == 0) {
                inhabitants[i] = arr[i] / 2;
                }
             }
             if (arr[inhabitants.length - 2] == 0) {
                 inhabitants[inhabitants.length - 1] = arr[inhabitants.length - 1] / 2;
             }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        }

    }
}


/*        int total = 0;
        for (int each : inhabitants) {
            total += each; // population at the beginning
        }

        int day = 0;
        int length = inhabitants.length;

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        while (total > 0) {//because I don't know when population will be zero, that is why I want to repeat this loop until population is zero
            int [] temp = Arrays.copyOf(inhabitants, length);
            if (inhabitants[1] == 0) {
                inhabitants[0] = inhabitants[0] / 2;
            }

            for (int i = 1; i < inhabitants.length - 1; i++) {
                if (inhabitants[i - 1] == 0 || inhabitants[i + 1] == 0) {
                    inhabitants[i] = inhabitants[i] / 2;
                }
            }
            if (inhabitants[inhabitants.length - 2] == 0) {
                inhabitants[inhabitants.length - 1] = inhabitants[inhabitants.length - 1] /2;
            }

            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));


            total = 0;
            for (int each : inhabitants) {
                total += each; // population at the next days
            }
       }
        System.out.println("---- EXTINCT ----");
        input.close();
    }*/

        /*while (average != 0) {
            System.out.println("Day " + day + Arrays.toString(inhabitants));
            //for (int i=0; i<inhabitants[i]; i++)

            for (int i = 0; i < inhabitants.length; i++) {
                while (inhabitants[i] > average && inhabitants[i] != 0) {
                    inhabitants[i] = inhabitants[i] / 2;
                    total -= inhabitants[i];
                }
                average = total / inhabitants.length;
                day++;
            }

        }*/




/*
An array **inhabitants** represents cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:

```
[3, 6, 0, 4, 3, 2, 7, 0]
```

Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives. After each day, **any city that is adjacent to a zombie-ridden city will lose half of its population (City that has a 0 population)**.

Write a program to loop though each city population and make it lose half of its population if it is adjacent(right or left) to a city with zero people until all cities have no humans are left.

Make updates to each element in the array and print the array like below for each day:

Note: A city can only be affected once each day

```
Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
```

Write the program in a way that it will handle any number of people in cities, above was just an example.

 */
