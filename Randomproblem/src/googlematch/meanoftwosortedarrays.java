package googlematch;

public class meanoftwosortedarrays {
	public static int mean(int[] a1, int[] a2) {
		if (a1.length == 0) return a1[a1.length/2];
		if (a2.length == 0) return a2[a2.length/2];
		int n = (a1.length + a2.length)/2;
		int count = 0;
		int i = 0, j = 0;
		int current = 0;
		while (count < n ) {
			if (a1[i] > a2[j]) {
				current = a2[j]; 
				j++;
			}
			else {
				current = a1[i];
				i++;
			}
			count++;
		}
		return current;
	}
	public static void main(String[] args) {
		System.out.println(mean(new int[] {1,5,6},new int[] {2,3,4,7,8,9,10,11,12}));
	}
}
