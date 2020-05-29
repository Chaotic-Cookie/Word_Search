public class WordSearch {
    int SIZE = 100;
    private WordSearchGenerator start;
    public WordSearch(){ //creates an empty node
        start = null;
    }

    public void print(){
        String[] randLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

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

    public String wordGenerate() {
        while(numWord > SIZE){

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

