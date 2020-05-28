import java.util.ArrayList;

public class WordSearchGenerator {

    private String board [][];
    private int length;
    private int numWords;
    private WordSearch word;
    private ArrayList<String> wordList = new ArrayList<String>();


    public WordSearchGenerator(int numWords, int length){
        word = new WordSearch();
        this.length = length;
        this.numWords = numWords;

    }//end of word generator



    public void generate(){ //takes the words and makes it into the game
        int start = 0;
        board = new String[length][length];

        while(start < numWords) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            ArrayList<Integer> Column = new ArrayList<Integer>();
        }//end while






    }//end generate


    public ArrayList<String> getWordList() { //the word list the user inputs
        return wordList;
    }
}// end class
