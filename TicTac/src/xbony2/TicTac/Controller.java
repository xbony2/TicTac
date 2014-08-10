package xbony2.TicTac;

public class Controller {

	/**
	 * If true, the player has won.
	 * If false, the player has lost, and the computer has won.
	 * 
	 * @author xbony2
	 */
	protected static boolean hasPlayerWon;
	
	/**
	 * 0 means it's the players turn.
	 * 1 means it's the computers turn.
	 */
	protected static byte whosTurn;
	
	protected static Square[] board = {};
}
