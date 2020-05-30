import java.io.IOException;
import java.util.Scanner;

public class WordSearchMain {

    public static Scanner book = new Scanner(System.in);
    private static char[][] board;



    public static void main(String[] args) throws IOException {
        WordSearchGenerator pen = new WordSearchGenerator( );
        int menu = 0;

        while(menu != 4) {
            System.out.println("Welcome to this Word Search generator!");
            System.out.println("This program will let you randomly create word search puzzles.");
            System.out.println("Please select an option: ");
            System.out.println("1. Generate word search");
            System.out.println("2. Print word search.");
            System.out.println("3. Solution.");
            System.out.println("4. Quit.");
            String response = book.nextLine();
            menu = Integer.parseInt(response);


            switch (menu) {

                case 1:

                    System.out.println("How many words would you like to look for? ");
                    String numWords = book.nextLine();
                    //pen.wordGenerate();
                    break;
                case 2:
                    System.out.println("Printing Word search.");
                    pen.printBoard(board);
                    break;
                case 3:
                    System.out.println("Printing Solutions.");
                    pen.solution(board);
                    break;
                case 4:
                    System.out.println("Thank you for using Word Search.");
                    System.exit(0);

                default:
                    System.out.println("Invalid option, please select again.");
                    break;

            }//end switch
        }//end while

    }//main end



}//class end
