import java.util.Random;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t = System.currentTimeMillis();
		Random rand = new Random();

		int n= rand.nextInt(1000);
		int knum=rand.nextInt(10); //������ ���� ����
		int[] data = new int[n];
		int a[] = new int[knum];
		int b[] = new int[knum];
		int mini, max, sum,chan,chan2;
		for(int k=0;k<n;k++)
			data[k] = rand.nextInt(100);
		System.out.println(data[10]);
		for(int i=0; i<knum ;i++){	

				a[i] = rand.nextInt(n);
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
				System.out.println("N���� ��������"+(i+1)+"��° ������ �ּڰ���"+mini);
				max = data[a[i]];
				for(int f=a[i]; f<=b[i];f++){
					if(data[f]>max)
						max = data[f];}
				System.out.println("N���� ��������"+(i+1)+"��° ������ �ִ���"+max);
				sum = 0;
				for(int g=a[i]; g<=b[i];g++){
					sum+= data[g];}
				System.out.println("N���� ��������"+(i+1)+"��° �������� ������"+sum);
				}
		long t1 = System.currentTimeMillis();
		System.out.println("�ҿ�ð��� :"+(t1-t)+"ms �Դϴ�.");
				}
		
				}
		
		
		


