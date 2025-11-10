package creationalDesignPattern.prototypeDesignPattern.problem;

/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

public class GameWithoutPrototypePattern {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.addPiece(new GamePiece("Green", 1));
        board.addPiece(new GamePiece("Red", 2));
        board.showBoard();

//        Checkpoint teh game
        System.out.println("\nCreating a checkpoint of the current game state...\n");
        GameBoard checkpointGame = new GameBoard();
        for (GamePiece piece : board.getPieces()) {
            checkpointGame.addPiece(new GamePiece(piece.getColor(), piece.getPosition()));
        }
        checkpointGame.showBoard();
    }
}
