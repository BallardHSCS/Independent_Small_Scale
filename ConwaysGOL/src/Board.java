public class Board {
    private static final int height = 20;
    private static final int width = 20;
    private String[][] gameBoard;
    private int generation = 0;


    public Board(String txt) {
        gameBoard = new String[height][width];
        BoardReader textBoard = new BoardReader(txt);
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                gameBoard[row][col] = textBoard.getNextCell();

            }
        }
    }





    static public String getStatus(String[][] array, int row, int col) {
        String status = array[row][col];
        int aliveNeighbours = 0;


        //goes through every cell
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {

                if (i < 0) {
                }
                else if (i > (width - 1)) {
                }
                else if (j < 0) {
                }
                else if (j > (height - 1)) {
                }
                else {
                    if (array[i][j].equals("#")) {
                        aliveNeighbours++;
                    }
                }

            }

        }//end of going through all the cells

        if (array[row][col].equals("#")) {
            aliveNeighbours--;
            //this is deciding if an alive cell is alive or not
            if (aliveNeighbours <= 1) {
                status = ".";
            }
            else if (aliveNeighbours > 3) {
                status = ".";
            }
        }

        //this is deciding if a dead cell is alive or not
        if (array[row][col].equals(".")) {
            if (aliveNeighbours == 3) {
                status = "#";
            }
        }
        return status;
    }//end of method


    public void getNextGeneration() {


        String[][] nameInTheWorks = new String[height][width];
        for (int row = 0; row < nameInTheWorks.length; row++) {
            for (int col = 0; col < nameInTheWorks[row].length; col++) {
                nameInTheWorks[row][col] = gameBoard[row][col];
            }
        }
        for (int row = 0; row < nameInTheWorks.length; row++) {
            for (int col = 0; col < nameInTheWorks[row].length; col++) {
                gameBoard[row][col] = getStatus(nameInTheWorks, row, col);
            }
        }
    }//end of method



    @Override
    public String toString() {
        String output = "";
        if (generation == 0) {
            generation++;

            for (int row = 0; row < gameBoard.length; row++) {
                for (int col = 0; col < gameBoard[row].length; col++) {
                    output += gameBoard[row][col];
                }
                output += "\n";
            }
        }
        else {
            getNextGeneration();
            for (int row = 0; row < gameBoard.length; row++) {
                for (int col = 0; col < gameBoard[row].length; col++) {
                    output += gameBoard[row][col];
                }
                output += "\n";
            }
            generation++;
        }
        return output;
    }
}
