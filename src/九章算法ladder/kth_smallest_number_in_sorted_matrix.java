package 九章算法ladder;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Find the kth smallest number in at row and column sorted matrix
 * 
 * @author yangye
 *
 */
public class kth_smallest_number_in_sorted_matrix {
	public int kthSmallest(int[][] matrix, int k) {
		int[] dx = { 0, 1 };
		int[] dy = { 1, 0 };
		int m = matrix.length;
		int n = matrix[0].length;
		boolean[][] visited = new boolean[m][n];
		PriorityQueue<Pair> pq = new PriorityQueue<>(k, new PairComparator());
		pq.add(new Pair(0, 0, matrix[0][0]));

		for (int i = 0; i < k - 1; i++) {
			Pair cur = pq.poll();
			for (int j = 0; j < 2; j++) {
				int x = cur.x + dx[j];
				int y = cur.y + dy[j];
				if (x < m && y < n && !visited[x][y]) {
					pq.add(new Pair(x, y, matrix[x][y]));
					visited[x][y] = true;
				}
			}
		}
		return pq.peek().val;
	}
}

class Pair {
	public int x, y, val;

	public Pair(int x, int y, int val) {
		this.x = x;
		this.y = y;
		this.val = val;
	}
}

class PairComparator implements Comparator<Pair> {

	@Override
	public int compare(Pair a, Pair b) {
		return a.val-b.val;
	}

}