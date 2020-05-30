import java.util.ArrayList;
import java.util.Random;

public class WordSearchGenerator {


    private char board [][];
    private char length; //word length
    private int numWords;
    char SIZE = 15;
    WordSearchGenerator start = null;
    protected WordSearchGenerator next;
    private ArrayList<Character> wordList = new ArrayList<Character>();



    public WordSearchGenerator(int numWords, char length){
        this.length = length;
        this.numWords = numWords;
        this.next = null;
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

    public static char[][] randBoard(char[][] board){
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

            for(int k = 0; k<100; k++) {
                int path = random.nextInt(4);
                switch (path) {
                    case 0:
                        charArray = stringToCharArray(hiddenWords[i]);
                        place = checkAngel(charArray, board);
                        if (place[0] == -1) {
                            break;
                        } else {
                            doAngle(place, charArray, board);
                            k = 100;
                            break;
                        }
                }
        }//end print

        public char[][] solution(char[][] board){

            Random rnd = new Random();
            for (int i = 0; i < board.length; i++){
                for (int j = 0; j < board.length; j++){
                    if (board[i][j] == '\u0000'){
                        board[i][j] = (char) (rnd.nextInt(Integer.parseInt("X")));
                    }
                }
            }
            return board;
        }//end solution

    /*public void wordGenerate() {


            while(numWords > SIZE){

                if(spot = length){

                }else{

                }
            }


            return wordGen;
        }
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
            System.out.println();*/



    public static int[] findHorizontal(char[][] board, String insert){

        int[] place = new int[2];
        Random random = new Random();
        for (int k = 0; k < 100; k++){
            int hPos = random.nextInt(board.length);
            int lPos = random.nextInt(board.length - insert.length());
            for(int i = 0; i < insert.length(); i++){
                if((board[hPos][lPos +i]!= (insert.charAt(i)) && (board[hPos][lPos +i] != 'X'))){
                    break;
                }
                if(i == insert.length() - 1){
                    place[0] = hPos;
                    place[1] = lPos;
                    return place;

                }
            }

        }
        return new int[]{-1, -1};

    }
    public static int[] findVertical(char[][] board, String insert){

        int[] place = new int[2];
        Random random = new Random();
        for (int k = 0; k < 100; k++){
            int hPos = random.nextInt(board.length- insert.length());
            int lPos = random.nextInt(board.length);
            for(int i = 0; i < insert.length(); i++){
                if((board[hPos][lPos +i]!= (insert.charAt(i)) && (board[hPos +i][lPos] != 'X'))){
                    break;
                }
                if(i == insert.length() - 1){
                    place[1] = hPos;
                    place[0] = lPos;
                    return place;

                }
            }

        }
        return new int[]{-1, -1};

    }
    public static int[] findAngle(char[][] board, String insert){

        int[] place = new int[2];
        Random random = new Random();
        for (int k = 0; k < 100; k++){
            int hPos = random.nextInt(board.length - insert.length());
            int lPos = random.nextInt(board.length - insert.length());
            for(int i = 0; i < insert.length(); i++){
                if((board[hPos][lPos +i]!= (insert.charAt(i)) && (board[hPos +i][lPos +i] != 'X'))){
                    break;
                }
                if(i == insert.length() - 1){
                    place[1] = hPos;
                    place[1] = lPos;
                    return place;

                }
            }

        }
        return new int[]{-1, -1};

    }
    public static int[] findAngle2(char[][] board, String insert){

        int[] place = new int[2];
        Random random = new Random();
        for (int k = 0; k < 100; k++){
            int hPos = random.nextInt(board.length - insert.length());
            int lPos = random.nextInt(board.length - insert.length());
            for(int i = 0; i < insert.length(); i++){
                if((board[hPos][lPos +i]!= (insert.charAt(i)) && (board[hPos +i][lPos +i] != 'X'))){
                    break;
                }
                if(i == insert.length() - 1){
                    place[1] = hPos;
                    place[1] = lPos;
                    return place;

                }
            }

        }
        return new int[]{-1, -1};

    }
    public static char[][] doHorizontal(int[] position, String insert, char[][] board){
        // Places an array of characters horizontally into the board array.

        int hPos = position[0]; // Vertical Position
        int wordLength = insert.length();
        int lPos = position[1]; //Horizontal Position

        for (int wordChar = 0; wordChar < wordLength; wordChar++){
            board[hPos][lPos + wordChar] = insert.charAt(wordChar);
        }
        return board;
    }
    public static char[][] doVertical(int[] position, String insert, char[][] board){
        // Places an array of characters Vertical into the board array.

        int hPos = position[1]; // Vertical Position
        int wordLength = insert.length();
        int lPos = position[0]; //Horizontal Position

        for (int wordChar = 0; wordChar < wordLength; wordChar++){
            board[hPos + wordChar][lPos] = insert.charAt(wordChar);
        }
        return board;
    }
    public static char[][] doAngle(int[] position, String insert, char[][] board){
        // Places an array of characters Angular into the board array.

        int hPos = position[1]; // Vertical Position
        int wordLength = insert.length();
        int lPos = position[1]; //Horizontal Position

        for (int wordChar = 0; wordChar < wordLength; wordChar++){
            board[hPos+ wordChar][lPos + wordChar] = insert.charAt(wordChar);
        }
        return board;
    }
    public static char[][] doAngle2(int[] position, String insert, char[][] board){
        // Places an array of characters Angular into the board array.

        int hPos = position[1]; // Vertical Position
        int wordLength = insert.length();
        int lPos = position[1]; //Horizontal Position

        for (int wordChar = 0; wordChar < wordLength; wordChar++){
            board[hPos+ wordChar][lPos + wordChar] = insert.charAt(wordChar);
        }
        return board;
    }




}//end class

