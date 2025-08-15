package org.example.creationalPattern.Prototype.goodcode;



import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype {

    private List<GamePiece> pieces = new ArrayList<>();


    public  void  addPiece(GamePiece piece){
        pieces.add(piece);
    }


    public List<GamePiece> getPieces(){
        return pieces;
    }


    public void showBoardState(){
        System.out.println("current board state ");

        for(GamePiece piece:pieces){
            System.out.println(piece);

        }


    }

    // creating a new gameboard and new game pieces
    @Override
    public GameBoard copy() {
        GameBoard newBoard = new GameBoard();
        for (GamePiece piece:pieces){
            newBoard.addPiece(piece.copy());
        }

        return newBoard;
    }
}
