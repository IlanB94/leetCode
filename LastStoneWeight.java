import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i = 0; i < stones.length; i++) {
			maxHeap.add(stones[i]);
		}

		while (maxHeap.size() > 1) {
			int x = maxHeap.poll();
			int y = maxHeap.peek();
			if (x != y) {
				maxHeap.poll();
				maxHeap.add(x - y);
			} else {
				maxHeap.poll();
			}
		}
		if (maxHeap.size() == 0) {
			return 0;
		} else {
			return maxHeap.poll();

		}
	}
}
