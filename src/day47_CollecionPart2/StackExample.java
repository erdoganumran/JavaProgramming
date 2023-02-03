package day47_CollecionPart2;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> numsStack = new Stack<>();
        numsStack.add(70);
        numsStack.add(75);
        numsStack.add(800);
        numsStack.add(60);
        numsStack.add(55);
        numsStack.add(45);
        numsStack.add(75);
        numsStack.add(1000);
        numsStack.add(500);

        System.out.println(numsStack);
        //check value on the top of the stack
        System.out.println(numsStack.peek());

        //read value on the top of the stack and then remove it
        numsStack.pop();

        System.out.println(numsStack);

        System.out.println(numsStack.peek());
        System.out.println(numsStack.get(0));



        System.out.println(numsStack.peek());
        //last element we write, will be removed first
        System.out.println(numsStack.pop());
        System.out.println(numsStack);

        System.out.println(numsStack.peek());//55
        //last element we write, will be removed first
        System.out.println(numsStack.pop());
        System.out.println(numsStack);

    }
}
