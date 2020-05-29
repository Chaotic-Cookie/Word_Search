public class WordSearch {
    int SIZE = 100;
    private WordSearchGenerator start;
    public WordSearch(){ //creates an empty node
        start = null;
    }

    public void print(){
        String[] randLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",  "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

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

    public void solution(){
        //find way to get it to show random letters as X


    }//end solution

    public String wordGenerate() {
        while(numWord > SIZE){

        }

        return wordGen;
    }
}//end class

