package solver;

import java.io.IOException;

import data.SudokuNode;
import utils.SudokuConstraints;

public class SudokuExactCoverAlgorithm {

	private SudokuNode mainHeader;
	//The matrix that will represent the sudoku solution
	public int SudokuMatrix[][] = new int [SudokuConstraints.SUDOKU_SIZE]
										  [SudokuConstraints.SUDOKU_SIZE];
	//The matrix that will represent the sudoku solution binary
	// 729 * 324
	public SudokuNode SudokuExactCoverMatrixColunms [][] = new SudokuNode [SudokuConstraints.CONSTRAINTS_NUMBER]
																		  [SudokuConstraints.CONSTRAINT_MATCHING_POSSIBILITY_NUMBER];
	/**
	 * This function will read the game matrix and send 0 or 1 to the 
	 * right place in the exact cover matrix
	 * @param gameMatrix
	 * @throws IOException 
	 */
	
	public SudokuExactCoverAlgorithm (int [][] mainMatrix) throws IOException{
		this.SudokuMatrix = mainMatrix;

		//root main header
		mainHeader = new SudokuNode(true);
		
		//Set the name of all columns;
		for (int i=0 ;  i< SudokuExactCoverMatrixColunms.length; i++) 
			SudokuExactCoverMatrixColunms[0][i] =  setColunmHeaderName(i + 1);
		
	}
	public void readSudokuMatrix(){
		
		for(int i = 0; i< SudokuMatrix.length; i++){
			for (int j =0; j< SudokuMatrix[0].length; j++){
				
				//Here all the possibility are available 
				if (SudokuMatrix [i][j] != 0){					
					constructDancingLinkArray(SudokuMatrix, i, j);					
				} 
			}
			
		}
	}
	private SudokuNode setColunmHeaderName(int columnIndex) throws IOException{
	
		//Temporary variable to manipulate the colunm
		SudokuNode column = SudokuExactCoverMatrixColunms[0][columnIndex];
		
		//It's a column header
		column.setNodeName(SudokuConstraints.COLUNMNAME + columnIndex);
		
		column = new SudokuNode(column, null, true);		
		
		return column;
	}
	
	public void constructDancingLinkArray(int [][] matrixToSolve, int i, int j){
		
		//Get the current colunm
		int colunm = j;
		//Get the current row
		int row = i;
		//Get the current area
		int area = ((row / 3) * 3) + (colunm/ 3);
		
		
	
	}
	
	
	
	
	public void coverColumn(){
		
	}
	public void unCoverCOlunm(){
		
	}
}
