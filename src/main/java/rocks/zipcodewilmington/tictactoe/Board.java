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
                if (counterO == 3 || counterX == 3) {
                    if (counterX == 3) {
                        this.winner = 'X';
                    } else {
                        this.winner = 'O';
                    }
                    //return counterO;
                }
            }counterX = 0;
            counterO = 0;
            //break;
        }
        //check columns
//        counterO = 0;
//        counterX = 0;
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                if (matrix[row][col] == 'X') {
                    counterX++;
                } else if (matrix[row][col] == 'O') {
                    counterO++;
                }
                if (counterO == 3 || counterX == 3) {
                    if (counterO == 3 ){
                        this.winner = 'O';
                    } else {
                        this.winner = 'X';
                    }
                    //return counterO;
                }

            }
            counterX = 0;
            counterO = 0;
        }
        //Check positive diagonal

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (matrix[col][col] == 'X') {
                        counterX++;
                    } else if (matrix[col][col] == 'O') {
                        counterO++;
                    }
                    if (counterO == 3 || counterX == 3) {
                        if (counterO == 3 ){
                            this.winner = 'O';
                        } else {
                            this.winner = 'X';
                        }
                        //return counterO;
                    }
                }
                break;
            }
        //Check negative diagonal
        counterO = 0;
        counterX = 0;
        for (int row = 2; row >0; row--) {
            for (int col = 0; col< 3; col++) {
                if (matrix[row][col] == 'X') {
                    counterX++;
                } else if (matrix[row][col] == 'O') {
                    counterO++;
                }
                if (counterO == 3 || counterX == 3) {
                    if (counterO == 3 ){
                        this.winner = 'O';
                    } else {
                        this.winner = 'X';
                    }
                    counterX = 0;
                    counterO = 0;
                    //return counterO;
                }
                row--;
            }
            break;
        }

//        if (counterO != 3 && counterX != 3) {
//            this.winner = ' ';
//        }



    }


    public Boolean isInFavorOfX() {
        return this.winner =='X';
    }

    public Boolean isInFavorOfO() {
        return this.winner =='O';
    }

    public Boolean isTie() {
        return this.winner == ' ';
    }

    public String getWinner() {
        if (this.winner == 'O'){
            return "O";
        } else if (this.winner == 'X'){
           return "X" ;
        } else {
            return "";
        }
    }
}
