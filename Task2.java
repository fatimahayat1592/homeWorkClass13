package homeWorkClass13;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* How would you check if String is palindrome or not? aba=> true
        Abbc =>false*/
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        String reverse="";
        for (int i =word.length()-1; i>=0; i--) {
            reverse = reverse + word.charAt(i);
        }
            if(word.equals(reverse)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }

    }

