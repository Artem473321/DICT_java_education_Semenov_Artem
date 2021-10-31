package com.company.CoffeeMachine;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Collections;

class Machine{
    private int milk = 540;
    private int water = 400;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;

    public void takeMoney(){
        System.out.println("I give you " + this.money);
        this.money = 0;
    }

    public void setIngridients(Scanner input){
        System.out.println("Write how many ml of water the coffee machine has:");
        this.water += input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        this.milk += input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        this.beans += input.nextInt();
        System.out.println("Write how many cups the coffee machine has:");
        this.cups += input.nextInt();
    }

    public void getIngridients(){
        System.out.println("The coffee machine has:\n" +
                this.water + " of water\n" +
                this.milk + " of milk\n" +
                this.beans + " of coffee beans\n" +
                this.cups + " of disposable cups\n" +
                this.money + " of money");
    }

    public int getWater() {
        return water;
    }

    public int getCups() {
        return cups;
    }

    public int getBeans() {
        return beans;
    }

    public int getMilk() {
        return milk;
    }

    public void examination(int water, int milk, int beans, int money){

        if(getWater()-water>=0 && getMilk()-milk>=0 && getCups()>0 && getBeans()-beans>=0){
            this.water -= water;
            this.milk -= milk;
            this.cups -= 1;
            this.beans -= beans;
            this.money += money;
            System.out.println("Coffee is ready");
            }
        else{
            System.out.println("Such ingredients are missing:");
            if (getWater()-water<0){
                System.out.println("Water");
                }
            if (getMilk()-milk<0){
                System.out.println("Beans");
                }
            if (getCups() == 0){
                System.out.println("Cups");
                }
            if(getBeans()-beans<0){
                System.out.println("Beans");
                }
            }
        }
    }



public class CoffeeMachine {
    public static void main(String[] args) {
        Machine person = new Machine();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String move = input.next();
            if(Objects.equals(move, "buy")){
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back – to main menu:");
                String move_2 = input.next();
                if(Objects.equals(move_2, "1")){
                    person.examination(250,0,16, 4);
                }
                else if(Objects.equals(move_2, "2")){
                    person.examination(350,75,20, 7);
                }
                else if(Objects.equals(move_2, "3")){
                    person.examination(200,100,12, 6);
                }
            }
            else if(Objects.equals(move, "fill")){
                person.setIngridients(input);
            }
            else if(Objects.equals(move, "take")){
                person.takeMoney();
            }
            else if(Objects.equals(move, "remaining")){
                person.getIngridients();
            }
            else if(Objects.equals(move,"exit")){
                System.exit(0);
            }


        }


    }
}
