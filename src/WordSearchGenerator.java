import java.util.ArrayList;
import java.util.Random;

public class WordSearchGenerator {

    private char board [][];
    private char length; //word length
    private int numWords;
    char SIZE = 50;
    private ArrayList<Character> wordList = new ArrayList<Character>();


    public WordSearchGenerator(int numWords, char length){
        this.length = length;
        this.numWords = numWords;

    }//end of word generator


    public static void printBoard(char[][] board){
        // Displays a two dimensional array.
        for (char[] wordlist: board) {
            for (char length: wordlist) {
                System.out.print(length + " ");
            }
            System.out.println();
        }
    }

    public static char[][] randomizeBoard(char[][] board){
        // Fills all empty spots on the board with random capital letters.

        Random rnd = new Random();
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == '\u0000'){
                    board[i][j] = (char) (rnd.nextInt(26) + 'A');
                }
            }
        }
        return board;
    }

    public ArrayList<Character> getWordList() { //the word list the user inputs
        return wordList;
    }


        public void print(){


            WordSearchGenerator current = null;
            if(start == null){
                System.out.println("This Word search is empty.");

            }else{
                current = start;
                System.out.println(current.toString());

                while(current.next != null){

                    current = current.next;
                    System.out.println(current.toString());

                }

            }
            System.out.println();
        }//end print

        ///public void solution(){
        public class solution{


        }//end solution

        public Character wordGenerate() {
            while(numWord > SIZE){

                if(spot = char){

                }else{

                }
            }

            return wordGen;
        }


}//end class

