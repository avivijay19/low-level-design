package creationalDesignPattern.prototypeDesignPattern.solution;


/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

public class PrototypePattern {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.addPiece(new GamePiece("Green", 1));
        board.addPiece(new GamePiece("Red", 2));
        board.showBoard();

//        Checkpoint teh game
        System.out.println("\nCreating a checkpoint of the current game state...\n");
        GameBoard checkpointGame = board.clone();
        checkpointGame.showBoard();
    }
}
