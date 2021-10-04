

package ChatBot;

import java.util.Scanner;


public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Jhon");
        System.out.println("I was created in 2021");
        System.out.println("Please,remind me your name:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("What a great name you have," + name);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of Dividing your age by 3,5 and 7.");
        int remainder3 = in.nextInt();
        int remainder5 = in.nextInt();
        int remainder7 = in.nextInt();
        int age = (remainder3*70 + remainder5*21 + remainder7*15)%105;
        System.out.println("Your age is " + age + " ;that's a good time to start programming");



    }
}
