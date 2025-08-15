package org.example.creationalPattern.Prototype.badcode;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    private List<GamePiece>  pieces = new ArrayList<>();


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
}
