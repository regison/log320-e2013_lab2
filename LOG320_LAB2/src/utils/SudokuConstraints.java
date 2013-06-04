package utils;

/**
 * 
 * @author Regison
 *
 */
public class SudokuConstraints {

	public static int SUDOKU_SIZE = 9;	
	
	public static int CONSTRAINTS_NUMBER = 324; // SUDOKU_SIZE ^ 2 * 4 constraints
	public static int CONSTRAINT_MATCHING_POSSIBILITY_NUMBER = 730; // SUDOKU_SIZE ^ 3 + 1 for the Header row
	
	//Column name header of the matrix
	public static String ROWNAME = "R";
	public static String COLUNMNAME = "C";
	public static String AREANAME = "A";
	
	
	public static int COLUMN_ONE = 1;
	public static int COLUMN_TWO = 2;
	public static int COLUMN_THREE = 3;
	public static int COLUMN_FOUR = 4;
	public static int COLUMN_FIVE = 5;
	public static int COLUMN_SIX = 6;
	public static int COLUMN_SEVEN = 7;
	public static int COLUMN_EIGHT = 8;
	public static int COLUMN_NINE = 9;
	
	//Constraints
	public static boolean NUMBER_APPEARS_ONCE_ROW = true;
	public static boolean NUMBER_APPEARS_ONCE_AREA = true;
	public static boolean NUMBER_APPEARS_ONCE_COLUMN = true;
	public static boolean NUMBER_APPEARS_ONCE_CELL = true;
	
	
}

