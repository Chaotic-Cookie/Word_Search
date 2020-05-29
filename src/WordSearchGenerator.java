import java.util.ArrayList;

public class WordSearchGenerator {

    private char board [][];
    private int length;
    private int numWords;
    private WordSearch search;
    private ArrayList<String> wordList = new ArrayList<String>();


    public WordSearchGenerator(int numWords, int length){
        search = new WordSearch();
        this.length = length;
        this.numWords = numWords;

    }//end of word generator



    public void generate(){ //takes the words and makes it into the game
        int start = 0;
        board = new char[length][length];


        while(start < numWords) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            ArrayList<Integer> Column = new ArrayList<Integer>();

            String word = search.wordGenerate();
            wordList.add(word);
        }//end while






    }//end generate


    public ArrayList<String> getWordList() { //the word list the user inputs
        return wordList;
    }
}// end class
