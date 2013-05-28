package tests;

import junit.framework.TestCase;
import lecture.SudokuFileReader;

public class SudokuFileReaderTest extends TestCase {

	String file ="";
	public SudokuFileReaderTest(){
		file = "./filesTest/sudoku2.txt";
	}
	
	public void testRead(){
		SudokuFileReader reader = new SudokuFileReader(file);
		
		reader.printSudokuGril();
	}
}
