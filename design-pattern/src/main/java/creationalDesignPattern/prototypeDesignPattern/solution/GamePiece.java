package creationalDesignPattern.prototypeDesignPattern.solution;

/**
 * @author : avinashvijayvargiya
 * @created : 08/11/25, Saturday
 **/

public class GamePiece implements Prototype<GamePiece> {
    private String color;

    private int Position;

    public GamePiece(String color, int Position) {
        this.color = color;
        this.Position = Position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return Position;
    }

    public void setPosition(int position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "gamePiece{" +
            "color='" + color + '\'' +
            ", Position=" + Position +
            '}';
    }

    @Override
    public GamePiece clone() {
        return new GamePiece(this.color, this.Position);
    }
}
