package com.driver;

import java.util.List;
import java.util.stream.Collectors;

public class ChessMetricsService {
    private ChessGameDataRepository chessGameDataRepository;

    public ChessMetricsService(ChessGameDataRepository chessGameDataRepository) {
        this.chessGameDataRepository = chessGameDataRepository;
    }

    public double calculateAverageMoves(String playerName) {
    	//your code goes here
        return (double) totalMoves / playerGames.size();
    }

    public double calculateWinRate(String playerName) {
    	//your code goes here
        return (double) wins / playerGames.size() * 100;
    }

    private List<ChessGame> getPlayerGames(String playerName) {
    	//your code goes here
        return chessGameDataRepository.getAllChessGames().stream()
                .filter(game -> game.getPlayerName().equals(playerName))
                .collect(Collectors.toList());
    }

    public void storeChessGameData(ChessGameDTO chessGameDTO) {
    	//your code goes here
    }
}
