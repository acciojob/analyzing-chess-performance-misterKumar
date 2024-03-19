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
        List<ChessGame> playerGames = getPlayerGames(playerName);
        int totalMoves = playerGames.stream().mapToInt(ChessGame::getNumberOfMoves).sum();
        double AvgMoves= (double) totalMoves / playerGames.size();
        return Double.isNaN(AvgMoves) ? 0: AvgMoves;
    }

    public double calculateWinRate(String playerName) {
    	//your code goes here
        List<ChessGame> playerGames = getPlayerGames(playerName);
        long wins = playerGames.stream().filter(ChessGame::isWin).count();
        double winRate=(double) wins / playerGames.size() * 100;
        return Double.isNaN(winRate) ? 0 : winRate;
    }

    private List<ChessGame> getPlayerGames(String playerName) {
    	//your code goes here
        return chessGameDataRepository.getAllChessGames().stream()
                .filter(game -> game.getPlayerName().equals(playerName))
                .collect(Collectors.toList());
    }

    public void storeChessGameData(ChessGameDTO chessGameDTO) {
    	//your code goes here
        if (chessGameDTO.getNumberOfMoves() < 0) {
            System.out.println("Error: Invalid number of moves entered.");
            return;
        }
        System.out.println("Data stored successfully!");
        chessGameDataRepository.storeChessGame(new ChessGameDataConverter().convertToEntity(chessGameDTO));
    }
}
