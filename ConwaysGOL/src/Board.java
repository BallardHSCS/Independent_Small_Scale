public class Board {

    public static final int SIZE = 20;
    String[][] boardArray = new String[SIZE][SIZE];
    BoardReader board;

    public Board(String fileName) {
        BoardReader boardPrint = new BoardReader(fileName);
        board = boardPrint;
        for (int row = 0; row < boardArray.length; row++) {
            for (int col = 0; col < boardArray[row].length; col++) {
                boardArray[row][col] = boardPrint.getNextCell();
            }
        }
    }

    public String toString() {
        String output = "";
        for (int row = 0; row < boardArray.length; row++) {
            for (int col = 0; col < boardArray[row].length; col++) {
                output += boardArray[row][col];


            }
            output += "\n";
        }
        return output;
    }

    private int getNeighbors(int rowPos, int colPos) {
        int neighborCount = 0;
        int startRow = rowPos - 1;
        int endRow = rowPos + 1;
        int startCol = colPos - 1;
        int endCol = colPos + 1;

        if(rowPos == 0){
            startRow=0;
        }
        if(rowPos == boardArray.length){
            endRow = boardArray.length;
        }
        if (colPos == 0){
            startCol = 0;
        }
        if(colPos == boardArray.length){
            endCol = boardArray.length;
        }

        for (int row =startRow; row == endRow; row++) {
            for(int col = startCol; col == endCol; col++){
                if(boardArray[row][col].contains("#")){
                    neighborCount++;
                }

            }
        }


        return neighborCount;
    }
    public  String[][] nextBoard(){
        for(int row = 0; row < boardArray.length; row++){
            for(int col = 0; col < boardArray[row].length; col++){
                if(getNeighbors(row, col)< 3){

                }
            }
        }

        String[][] newBoard = boardArray;

        return newBoard;
    }

}
