package creationalDesignPattern.prototypeDesignPattern.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

public class GameBoard {
    private List<GamePiece> pieces = new ArrayList<>();

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

}
