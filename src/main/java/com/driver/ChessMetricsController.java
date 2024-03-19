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
    }

    private void storeChessGameData(Scanner scanner) {
    	//your code goes here
    }

    private void calculateAverageMoves(Scanner scanner) {
    	//your code goes here
    }

    private void calculateWinRate(Scanner scanner) {
    	//your code goes here
    }
}
