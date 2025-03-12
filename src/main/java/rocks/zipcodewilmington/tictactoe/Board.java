package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    int row;
    int col;
    Character[][] data;
    char winner = ' ';
    boolean tie = false;

    public Board(Character[][] matrix) {
//        this.row = matrix.length;
//        this.col = matrix[0].length;
        this.data = matrix;

        int counterO = 0;
        int counterX = 0;
        //check row
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (matrix[row][col] == 'X') {
                    counterX++;
                } else if (matrix[row][col] == 'O') {
                    counterO++;
                }
                if (counterO == 3) {
                    this.winner = 'O';
                    break;
                    //return counterO;
                } else if (counterX == 3) {
                   this.winner = 'X';
                    break;
                }
            }

        }
        //check columns
        counterO = 0;
        counterX = 0;
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                if (matrix[col][row] == 'X') {
                    counterX++;
                } else if (matrix[col][row] == 'O') {
                    counterO++;
                }
                if (counterO == 3) {
                    this.winner = 'O';
                    break;
                    //return counterO;
                } else if (counterX == 3) {
                    this.winner = 'X';
                    break;
                }
            }

        }
        //Check positive diagonal
            counterO = 0;
            counterX = 0;
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (matrix[col][col] == 'X') {
                        counterX++;
                    } else if (matrix[col][col] == 'O') {
                        counterO++;
                    }
                    if (counterO == 3) {
                        this.winner = 'O';
                        break;
                        //return counterO;
                    } else if (counterX == 3) {
                        this.winner = 'X';
                        break;
                    }
                }  break;
            }
        //Check negative diagonal
        counterO = 0;
        counterX = 0;
        for (int row = 0; row <3; row++) {
            for (int col = 2; col > 3; col--) {
                if (matrix[row][col] == 'X') {
                    counterX++;
                } else if (matrix[row][col] == 'O') {
                    counterO++;
                }
                if (counterO == 3) {
                    this.winner = 'O';
                    break;
                    //return counterO;
                } else if (counterX == 3) {
                    this.winner = 'X';
                    break;
                }
            }
        }

        tie = true;

    }


    public Boolean isInFavorOfX() {

        return this.winner =='X';
    }

    public Boolean isInFavorOfO() {
        return this.winner =='O';
    }

    public Boolean isTie() {
        return this.tie;
    }

    public String getWinner() {
        if (this.winner == 'O'){
            return "O";
        } else {
           return "X" ;
        }
    }


}
