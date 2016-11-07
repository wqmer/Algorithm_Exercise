package test;
import java.util.Scanner;

import crackingCodeOneString.*;
import leetcode.*;


public class Game_test {	
public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in); 
         System.out.println( "plase input a 4-bit nubmer : ");
    String your_num  = sc.nextLine(); 
         System.out.println( "plase input the solution : ");
    String answer = sc.nextLine();
                    sc.close();
         NumberPuzzle NewGame = new NumberPuzzle();
         System.out.println( NewGame.check (answer,your_num) );
  
}

}

