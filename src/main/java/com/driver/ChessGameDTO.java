package com.driver;

public class ChessGameDTO {
    private String playerName;
    private String opponentName;
    private int numberOfMoves;
    private boolean isWin;

    public ChessGameDTO(String playerName, String opponentName, int numberOfMoves, boolean isWin) {
        this.playerName = playerName;
        this.opponentName = opponentName;
        this.numberOfMoves = numberOfMoves;
        this.isWin = isWin;
    }

    public String getPlayerName() {
    	//your code goes here
        return playerName;
    }

    public String getOpponentName() {
    	//your code goes here
        return opponentName;
    }

    public int getNumberOfMoves() {
    	//your code goes here
        return numberOfMoves;
    }

    public boolean isWin() {
    	//your code goes here
        return isWin;
    }
}


