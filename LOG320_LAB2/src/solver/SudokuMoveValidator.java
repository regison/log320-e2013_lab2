package solver;
import java.math.*;

public class SudokuMoveValidator {

	private final int MAX_LENGTH = 9;
	private String sudokuGril[][];
	
	public SudokuMoveValidator(String[][] sudokuGril)
	{
		this.sudokuGril = sudokuGril;
	}
	
	public boolean estValide(int x, int y, String k)
	{
		boolean isValid = true;
		while(isValid)
		{
			// verifies line
			for(int i = 0; i < MAX_LENGTH; i++)
			{
				if(k == sudokuGril[x][i])
				{
					isValid = false;
				}
			}
			
			// verifies column
			for(int i = 0; i < MAX_LENGTH; i++)
			{
				if(k == sudokuGril[i][y])
				{
					isValid = false;
				}
			}
			
			// verifies 3x3 block
			int rowStart = (int)Math.floor(x/3) * 3;
			int rowLength = ((int)Math.floor(x/3) * 3) + 3;
			int columnStart = (int)Math.floor(y/3) * 3;
			int columnLength = ((int)Math.floor(y/3) * 3) + 3;
			
			for(int i = rowStart; i < rowLength; i++)
			{
				for(int j = columnStart; j < columnLength; j++)
				{
					if(k == sudokuGril[i][j])
					{
						isValid = false;
					}
				}
			}
		}
		return isValid;
	}
}
