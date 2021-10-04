
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
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = in.nextInt();
        for(int i = 0;i<num+1;i++){
           System.out.println(i + " !");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("How old is Artem?");
        System.out.println("1. 17");
        System.out.println("2. 18");
        System.out.println("3. 19");
        System.out.println("4. 20");
        int great = 0;
        while (true){
            int years = in.nextInt();
            if (years == 2){
                System.out.println("Great, you right.");
                break;
            }
            System.out.println("Please, try again");

        }



    }
}
