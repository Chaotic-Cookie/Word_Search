import java.util.ArrayList;
import java.util.Random;

public class WordSearchGenerator {

    private char board [][];
    private char length; //word length
    private int numWords;
    private WordSearch search;
    private ArrayList<Character> wordList = new ArrayList<Character>();


    public WordSearchGenerator(int numWords, char length){
        search = new WordSearch();
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


    public class WordSearch {
        char SIZE = 50;
        private WordSearchGenerator start;
        public WordSearch(){ //creates an empty node
            start = null;
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
            //find way to get it to show random letters as X
            //adapt this to work?
            //Also a neat thing i found
            public boolean exist(char[][] board, String word){

                char[] chars = word.toCharArray();
                for(int i = 0; i < board.length; i++){
                    for(int j = 0; j < board[0].length; j++){
                        if(exist(board, i, j, chars, 0)){
                            return true;
                        }
                    }
                }
                return false;

            }

        }//end solution

        public Character wordGenerate() {
            while(numWord > SIZE){

                if(spot = char){

                }else{

                }
            }

            return wordGen;
        }

    /* neat thing that can help in the future
    * private void fillUpEmptyTiles() {
		for (int x = 0; x < fieldRows; x++){
			for (int y = 0; y < fieldColums; y++){
				if (tField.getTileFieldObject(x, y).getCharacterToDraw() == null){
					tField.getTileFieldObject(x, y).setCharacterToDraw("" + randomChars.charAt(Random.nextInt(randomChars.length())));
				}
			}
		}
	}
    * */
    }//end class


}// end class
