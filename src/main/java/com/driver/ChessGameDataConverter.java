package com.driver;

public class ChessGameDataConverter {
    public ChessGame convertToEntity(ChessGameDTO chessGameDTO) {
        return new ChessGame(chessGameDTO.getPlayerName(), chessGameDTO.getOpponentName(),
                chessGameDTO.getNumberOfMoves(), chessGameDTO.isWin());
    }

    public ChessGameDTO convertToDTO(ChessGame chessGame) {
        return new ChessGameDTO(chessGame.getPlayerName(), chessGame.getOpponentName(),
                chessGame.getNumberOfMoves(), chessGame.isWin());
    }
}
