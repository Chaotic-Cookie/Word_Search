import java.util.ArrayList;

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



    public void generate(){ //takes the words and makes it into the game
        int start = 0;
        board = new char[length][length];

            ArrayList<Integer> row = new ArrayList<Integer>();
            ArrayList<Integer> Column = new ArrayList<Integer>();

            String word = search.wordGenerate();
            wordList.add(word);
            for (char length : wordList) {

                if(start < numWords){

                }



            }


    }//end generate


    public ArrayList<String> getWordList() { //the word list the user inputs
        return wordList;
    }
}// end class
