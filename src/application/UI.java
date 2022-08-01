package application;
import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		int row = pieces.length;
		String column = "  a b c d e f g h";
		
		for(int i = 0; i < pieces.length; i++) {
			System.out.print(row + " ");
			for(int j = 0; j < pieces[i].length ; j++ ) {
				printPiece(pieces[i][j]);
			}	
			row--;
			System.out.println();	
		}
		System.out.println(column);
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		}else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
	
	
}