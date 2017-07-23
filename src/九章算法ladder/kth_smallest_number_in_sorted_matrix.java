package 九章算法ladder;

import java.util.Comparator;

/**
 * Find the kth smallest number in at row and column sorted matrix
 * @author yangye
 *
 */
public class kth_smallest_number_in_sorted_matrix {
	public int kthSmallest(int [][] matrix ,int k){
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