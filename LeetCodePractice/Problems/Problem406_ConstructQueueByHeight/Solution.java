package Problem406_ConstructQueueByHeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
;

public class Solution {
	public static void main(String[] args) {
		//int[][] arr = new int[][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		
		int[][] arr = new int[][]
		{{8,2},{4,2},{4,5},{2,0},{7,2},{1,4},{9,1},{3,1},{9,0},{1,0}};

		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(reconstructQueue(arr)));
	}
	public static int[][] reconstructQueue(int[][] people) {
        if (people.length == 0) return people;

		ArrayList<int[]> list = new ArrayList<>();
		
		Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (b[0] == a[0]) return a[1] - b[1];
                return b[0] - a[0];
            }
        });
		
		for (int i = 0; i <people.length; i++) {
			list.add(people[i][1], new int[] {people[i][0], people[i][1]});
		}
		int[][] res = new int[people.length][people[0].length];
		int i = 0;
		for(int[] k : list) {
			res[i][0]=k[0];
			res[i][1]=k[1];
			i++;
		}
		return res;
    }
}
