import java.util.Random;

//N을고정했을때
public class Main3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(1000);

		int n= 1000000;
		int knum=1000; //구간의 갯수 랜덤
		int[] data = new int[n];
		int a[] = new int[knum];
		int b[] = new int[knum];
		int mini, max, sum,chan,chan2;
		long s = System.currentTimeMillis();

		for(int k=0;k<n;k++)
			data[k] = rand.nextInt(1000);
		
		for(int i=0; i<knum ;i++){	

				a[i] = rand.nextInt(n-1);
				b[i] = rand.nextInt(a[i]);
				chan2=b[i];
				chan = a[i];
				if(a[i]>=b[i])
					a[i]=chan2;
					b[i]=chan;
				mini = data[a[i]];
				for(int j=a[i]; j<=b[i]; j++){
					if(data[j]<mini)
						mini = data[j];}
				System.out.println("N개의 데이터중"+(i+1)+"번째 구간의 최솟값은"+mini);
				max = data[a[i]];
				for(int f=a[i]; f<=b[i];f++){
					if(data[f]>max)
						max = data[f];}
				System.out.println("N개의 데이터중"+(i+1)+"번째 구간의 최댓값은"+max);
				sum = 0;
				for(int g=a[i]; g<=b[i];g++){
					sum+= data[g];}
				System.out.println("N개의 데이터중"+(i+1)+"번째 데이터의 총합은"+sum);
				}
		long t1 = System.currentTimeMillis();
		System.out.println("소요시간은 :"+(t1-s)+"ms 입니다.");
				
		
		
	}

}
