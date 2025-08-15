package org.example.creationalPattern.Prototype.goodcode;

public class GamePiece implements Prototype<GamePiece> {

    String color;
    String position;



    GamePiece(String color, String position){
        this.color=color;
        this.position=position;
    }


    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public GamePiece copy() {
        return new GamePiece(this.color,this.position);
    }
}
