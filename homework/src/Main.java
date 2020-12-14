import java.util.Scanner;
import java.util.Random;

public class Main {
	static void minmaxsum(int[] v, int n, int[] a, int[] b,
			int k, int[] rmin, int[] rmax, long[] rsum){
		for(int t = 0; t < k; t++){
			int min = v[a[t]-1];
			int max = v[a[t]-1];
			long sum = v[a[t]-1];
			for(int i = a[t]; i < b[t]; i++){
				if(min > v[i]) min = v[i];
				if(max < v[i]) max = v[i];
				sum += v[i];
			}
			rmin[t] = min;
			rmax[t] = max;
			rsum[t] = sum;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(1000);
		int n = 1000000;
		int [] v = new int[n];
		for(int i = 0; i < n; i++) v[i] = rand.nextInt();
		int k = 100000;
		int[] a = new int[k];
		int[] b = new int[k];
		
		for(int i =0; i<k; i++){
			a[i] = rand.nextInt(n);
			b[i] = rand.nextInt(n);
			int chan2=b[i];
			int chan = a[i];
			if(a[i]>=b[i])
				a[i]=chan2;
				b[i]=chan;
			}
		
		int[] min = new int[k];
		int[] max = new int[k];
		long[] sum = new long[k];
		
		long t = System.currentTimeMillis();
		minmaxsum(v, n, a, b, k, min, max, sum);
		t = System.currentTimeMillis()-t;
		System.out.println("소요시간"+t);
	}

}
