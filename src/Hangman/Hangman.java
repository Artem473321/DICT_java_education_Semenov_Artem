package Hangman;

import java.util.*;


public class Hangman {

    public static void main(String[] args) {
        String[] alfabet = new String[]{"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        System.out.println("HANGMAN");

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int health = 8;
        ArrayList<String> allLeters = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> secretWord = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        System.out.println("Type 'play' to play the game, 'exit' to quit:");
        String game = input.next();
        if(Objects.equals(game, "exit")){
            System.exit(0);
        }
        words.add("python");
        words.add("kotlin");
        words.add("java");
        words.add("javascript");
        secretWord.add(words.get(random.nextInt(3)));
        for(int i = 0;i<secretWord.get(0).length();i++){
            letters.add("-".charAt(0));
        }
        while (true){
            int num = 0;
            if (num== letters.size()){
                System.out.println("Вы выиграли");
            }
            if(health==0){
                System.out.println("У вас закончились жизни");
                break;
            }
            for(int i = 0;i<secretWord.get(0).length();i++){
                if (letters.contains(secretWord.get(0).charAt(i))){
                    num+=1;
                    System.out.print(secretWord.get(0).charAt(i));
                    if(num==secretWord.get(0).length()){
                        System.out.println("\nВы выиграли");
                        System.exit(0);
                    }
                }
                else{System.out.print("-");}

            }
            System.out.println("\n" + "Input the letter");
            String letter = input.next();
            if (letter.length()>1){
                System.out.println("You should input a single letter.");
                continue;
            }
            if (!Arrays.asList(alfabet).contains(letter)){
                System.out.println("Please enter a lowercase English letter.");
                continue;
            }

            if (secretWord.get(0).contains(letter)){

                for(int i = 0;i<letters.size();i++){
                    if (letters.get(i).toString().equals(letter)){
                        System.out.println("You've already guessed this letter.");
                        break;
                    }
                    else if (letters.get(i).toString().equals("-")){
                        letters.set(i, letter.charAt(0));
                        break;
                    }
                }
            }
            else{
                if(allLeters.contains(letter)){
                    System.out.println("You've already guessed this letter.");
                }
                else{
                    System.out.println("That letter doesn't appear in the word");
                    health-=1;
                    allLeters.add(letter);}
            }

        }
        }
    }

