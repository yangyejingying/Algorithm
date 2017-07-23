package 九章算法ladder;

import java.util.Comparator;

/**
 * Find the kth smallest number in at row and column sorted matrix
 * @author yangye
 *
 */
public class kth_smallest_number_in_sorted_matrix {
	public int kthSmallest(int [][] matrix ,int k){
		 int[] dx = {0, 1};
		  int[] dy = {1, 0};
		  int m = matrix.length;
		  int n = matrix[0].length;
		return 0;
	}
}
class Pair{
	public int x,y,val;
	public Pair(int x,int y,int val){
		this.x = x;
		this.y = y;
		this.val = val;
	}
}

class PairComparator implements Comparator<Pair>{

	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO Auto-generated method stub
		 
		return 0;
	}
	
}