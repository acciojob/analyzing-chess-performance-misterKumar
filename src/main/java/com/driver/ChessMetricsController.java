package com.driver;

import java.util.Scanner;

public class ChessMetricsController {
    private ChessMetricsService chessMetricsService;

    public ChessMetricsController(ChessMetricsService chessMetricsService) {
        this.chessMetricsService = chessMetricsService;
    }

    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    storeChessGameData(scanner);
                    break;
                case 2:
                    calculateAverageMoves(scanner);
                    break;
                case 3:
                    calculateWinRate(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void printMenu() {
    	//your code goes here
        System.out.println("===== ChessMetrics Menu =====");
        System.out.println("1. Store Chess Game Data");
        System.out.println("2. Calculate Average Moves for a Player");
        System.out.println("3. Calculate Win Rate for a Player");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void storeChessGameData(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter Player's Name: ");
        String playerName = scanner.next();

        System.out.println("Enter Opponent's Name: ");
        String opponentName = scanner.next();

        System.out.println("Enter Number of Moves: ");
        int numberOfMoves = scanner.nextInt();

        System.out.println("Enter Result (Win/Loss): ");
        String result = scanner.next();
        boolean isWin = result.equalsIgnoreCase("Win");

        ChessGameDTO chessGameDTO = new ChessGameDTO(playerName, opponentName, numberOfMoves, isWin);
        chessMetricsService.storeChessGameData(chessGameDTO);

    }

    private void calculateAverageMoves(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter Player's Name: ");
        String playerName = scanner.next();
        double averageMoves = chessMetricsService.calculateAverageMoves(playerName);
        System.out.println("Average Number of Moves for " + playerName + ": " + averageMoves);
    }

    private void calculateWinRate(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter Player's Name: ");
        String playerName = scanner.next();
        double winRate = chessMetricsService.calculateWinRate(playerName);
        System.out.println("Win Rate for " + playerName + ": " + winRate + "%");
    }

    public static void main(String[] args) {
        // Initialize repository, service, and controller
        ChessGameDataRepository repository = new ChessGameDataRepository();
        ChessMetricsService service = new ChessMetricsService(repository);
        ChessMetricsController controller = new ChessMetricsController(service);

        // Start the application
        controller.processUserInput();
    }
}
