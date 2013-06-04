package data;

import java.io.IOException;

public class SudokuNode {
	
	private String nodeName;
	private SudokuNode left;
	private SudokuNode right;
	private SudokuNode above;
	private SudokuNode below;
	private SudokuNode rootHeader;
	private int colunmSize;
	
	
	
	/**
	 * This constructor is made for the main header
	 * represent the root of all the colunms of the dancing 
	 * link array
	 * @param header
	 * @throws IOException 
	 */
	public SudokuNode(boolean isHeader) throws IOException{
		if (isHeader){	
			rootHeader.above = null;
			rootHeader.below = null;
			rootHeader.nodeName = "RootHeader";
			rootHeader.right = rootHeader;
			rootHeader.left = rootHeader;
		}
		else
			throw new IOException("This node is not the main header ");
	}
	
	//A new element linked to his previous, his next, his above and his below 
	public SudokuNode( SudokuNode element, SudokuNode header, boolean isColunmHeader ){
		
		if (isColunmHeader){			
			element.right = rootHeader;
			element.left = rootHeader.left;
			element.right.left = rootHeader.left.right = rootHeader;
			element.above = element.below = rootHeader;
			
		} else{
			
			element.above = header.above;
			element.below = header;
			
			element.above.below = element;
			element.below.above = element;
			incrementColunmSize( 1 );			
		}
	}
	
	
	public SudokuNode getLeft() {
		return left;
	}
	public void setLeft(SudokuNode left) {
		this.left = left;
	}
	public SudokuNode getRight() {
		return right;
	}
	public void setRight(SudokuNode right) {
		this.right = right;
	}
	public SudokuNode getAbove() {
		return above;
	}
	public void setAbove(SudokuNode above) {
		this.above = above;
	}
	public SudokuNode getBelow() {
		return below;
	}
	public void setBelow(SudokuNode below) {
		this.below = below;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}	
	public void incrementColunmSize(int size){			
		this.colunmSize += size;
	}
	public SudokuNode getRootHeader(){
		return rootHeader;
	}

}
