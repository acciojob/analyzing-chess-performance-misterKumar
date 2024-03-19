package com.driver;

import java.util.ArrayList;
import java.util.List;

public class ChessGameDataRepository {
    private List<ChessGame> chessGames;

    public ChessGameDataRepository() {
        this.chessGames = new ArrayList<>();
    }

    public void storeChessGame(ChessGame chessGame) {
    	//your code goes here
        chessGames.add(chessGame);
    }

    public List<ChessGame> getAllChessGames() {
    	//your code goes here
        return new ArrayList<>(chessGames);
    }
}

