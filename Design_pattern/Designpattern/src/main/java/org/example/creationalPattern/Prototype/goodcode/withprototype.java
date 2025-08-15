package org.example.creationalPattern.Prototype.goodcode;

import org.example.creationalPattern.Prototype.goodcode.GameBoard;
import org.example.creationalPattern.Prototype.goodcode.GamePiece;

public class withprototype {


    public static void main(String[] args) {
     GameBoard gameBoard = new GameBoard();

        gameBoard.addPiece(new GamePiece("red","5"));
        gameBoard.addPiece(new GamePiece("blue","4"));


        gameBoard.showBoardState();
        GameBoard copiedBoard = gameBoard.copy();
        copiedBoard.showBoardState();

    }

}
