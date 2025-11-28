package boardgame;

public class Piece {

    protected Position position;
    private Board board;


    //assim que criada a posição da peça será null

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // tabuleiro de uso interno camada de tabuleiro
    protected Board getBoard() {
        return board;
    }

   // tira o set para não permitir que o tabuleiro sejá alterado
}
