public class GameLogic {
    //int rows;
    //int cols;
    int[][] board;

    public GameLogic() {
        board = new int[10][10];
    }

    public boolean judge() {
        if (horizontalSearch() || verticalSearch() || crossSearch()){
            return true;
        }
        return false;
    }

    public boolean horizontalSearch() {
        int cnt = 0;
        for(int i = 0; i < board.length; i++) {
            for (int j = 1; j < board[0].length; j++) {
                if (board[i][j] == board[i][j-1] && board[i][j] != 0) {
                    cnt += 1;
                    if (cnt == 4) {
                        return true;
                    }
                }
                else {
                    cnt = 0;
                }
            }
        }
        return false;
    }

    public boolean verticalSearch() {
        int cnt = 0;
        for(int i = 0; i < board[0].length; i++) {
            for (int j = 1; j < board.length; j++) {
                if (board[i][j] == board[i][j-1] && board[i][j] != 0) {
                    cnt += 1;
                    if (cnt == 4) {
                        return true;
                    }
                }
                else {
                    cnt = 0;
                }
            }
        }
        return false;
    }

    public boolean crossSearch() {
        int cnt = 0;
        for (int i = 1; i < board.length - 4; i++) {
            for (int j = 1; j < board[0].length - 4; j++) {
                if (board[i][j] == board[i-1][j-1] && board[i][j] != 0) {
                    cnt += 1;
                    if (cnt == 4) {
                        return true;
                    }
                }
                else {
                    cnt = 0;
                }
            }
        }

        for (int i = board.length; i >= 3; i--) {
            for (int j = board[0].length; j >= 3; j--) {
                if (board[i][j] == board[i+1][j+1] && board[i][j] != 0) {
                    cnt += 1;
                    if (cnt == 4) {
                        return true;
                    }
                }
                else {
                    cnt = 0;
                }
            }
        }
        return false;
    }

    public void input(int colNum, String type) {
        int row = 0;
        while(board[row][colNum] == 0) {
            row += 1;
        }
        if (type.equals("one")) {
            board[row - 1][colNum] = 1;
        }
        if (type.equals("two")) {
            board[row - 1][colNum] = 2;
        }
    }

    public boolean canInputHere(int colNum) {
        if (this.board[0][colNum] != 0) {
            return false;
        }
        return true;
    }

    public int[][] getBoard() {
        return board;
    }

}
