package data;

import java.util.LinkedList;

public class DoubleLinkSudokuNode extends LinkedList<SudokuNode> {

	SudokuNode listHeader;
	public DoubleLinkSudokuNode(){
		 
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void addSudokuNode(SudokuNode sn){
		sn.getRight().setLeft(sn);
		sn.getLeft().setRight(sn);
	}
	
	public void removeSudokuNode(SudokuNode sn){
		if(sn != null){		
			sn.getRight().setLeft(sn.getLeft());
			sn.getLeft().setRight(sn.getRight());			
		}
	}

}
