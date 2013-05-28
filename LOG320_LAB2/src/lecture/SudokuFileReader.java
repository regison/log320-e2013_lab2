/**
 * 
 */
package lecture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Regison
 *
 */
public class SudokuFileReader {

	private final int MAX_LENGTH = 9;
	private String sudokuGril[][];

	// constructor
	public SudokuFileReader(String filename)
	{
		sudokuGril = new String[MAX_LENGTH][MAX_LENGTH];
		readFile(filename);
	}
	
	// reads the sudoku file and puts it in a two dimensional array
	private void readFile(String filename) {
		String line = "";
		int ind = 0;
		try{
			BufferedReader buffer = new BufferedReader(new FileReader(new File(filename)));
			
			if ( buffer != null ){
				while( ( line = buffer.readLine() ) != null ){
					String[] lineArray = line.split("(?!^)");
					sudokuGril[ind] = lineArray;
					ind++;
				} 
				buffer.close();
			}		
		}
		catch(IOException e)
		{
			System.out.println("Impossible to read the file!");
		}
	}
	
	// returns the gril in the form of a two dimensional array
	public String[][] getSudokuGril()
	{
		return this.sudokuGril;
	}
	
	// prints the gril in the two dimensional array
	public void printSudokuGril()
	{
		for(int i = 0; i < MAX_LENGTH; i++)
		{
			for(int j = 0; j < MAX_LENGTH; j++)
			{
				System.out.print(this.sudokuGril[i][j]);
			}
			System.out.println("");
		}
	}
}
