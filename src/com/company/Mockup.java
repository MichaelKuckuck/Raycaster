package com.company;


import java.io.IOException;

public class Mockup {
	int mapSizeX = 5;
	int mapSizeY = 4;
	int[][] map = new int[mapSizeY][mapSizeX];
	boolean gameNotDone = true;    // gameState
	int playerX = 1;
	int playerY = 1;

	private void init() {
		map[playerY][playerX] = 1;
		map[0][1] = 2;
		map[3][0] = 2;
		draw();


	}

	private void draw() {
		while (gameNotDone) {
			drawMap();
			try {
				int input = System.in.read();
				if (input != 10) movePlayer(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	private void movePlayer(int input) {
		map[playerY][playerX] = 0;        // Remove old player position
		switch (input) {
			case 119 -> {
				if (canMove(0, -1) != 0) break;
				if (playerY == 0) playerY = mapSizeY - 1;
				else playerY--;
			} // w
			case 97 -> {
				if (canMove(-1, 0) != 0) break;
				if (playerX == 0) playerX = mapSizeX - 1;
				else playerX--;
			} // a
			case 115 -> {
				if (canMove(0, 1) != 0) break;
				if (playerY == mapSizeY - 1) playerY = 0;
				else playerY++;
			} // s
			case 100 -> {
				if (canMove(1, 0) != 0) break;
				if (playerX == mapSizeX - 1) playerX = 0;
				else playerX++;
			} // d
			default -> {
				System.out.println("Wrong Key");
			}
		}

		map[playerY][playerX] = 1;        // Save new player position
	}

	private int canMove(int nx, int ny) {
		return map[(mapSizeY + playerY + ny) % mapSizeY][( mapSizeX + playerX + nx) % mapSizeX];
	}


	private void drawMap() {
		for (int x = 0; x < map.length; x++) {
			for (int y = 0; y < map[0].length; y++) {
				char obst = getObst(x, y);
				System.out.print("[" + obst + "]");
			}
			System.out.println("");
		}
		System.out.println("\n\n\n\n\n\n");
	}

	private char getObst(int x, int y) {

		return switch (map[x][y]) {
			case 1 -> '#';
			case 2 -> 'O';
			default -> ' ';
		};

	}


	public static void main(String[] args) {
		Mockup main = new Mockup();
		main.init();
	}


}
