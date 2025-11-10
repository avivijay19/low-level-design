package creationalDesignPattern.prototypeDesignPattern.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

public class GameBoard implements Prototype<GameBoard> {
    private final List<GamePiece> pieces =
        new ArrayList<>();

    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }

    public List<GamePiece> getPieces() {
        return pieces;
    }

    public void showBoard() {
        System.out.println("Current Board:");
        for (GamePiece piece : pieces) {
            System.out.println(piece);
        }
    }

    @Override
    public GameBoard clone() {
        GameBoard clonedBoard = new GameBoard();
        for (GamePiece piece : pieces) {
            clonedBoard.addPiece(piece.clone());
        }
        return clonedBoard;
    }
}
