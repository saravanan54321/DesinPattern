package org.example.creationalPattern.Prototype.badcode;

public class WithoutPrototype {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();

        gameBoard.addPiece(new GamePiece("red","5"));
        gameBoard.addPiece(new GamePiece("blue","4"));


        gameBoard.showBoardState();


        // adding above data to this board
        GameBoard copiedBoard = new GameBoard();
        for(GamePiece piece: gameBoard.getPieces()){
            // this will not cretae a new object . it copies the reference of gameboard piece
            //copiedBoard.addPiece(piece);


            // this will create a new object
            copiedBoard.addPiece(new GamePiece(piece.color, piece.position));
        }

    }
}
