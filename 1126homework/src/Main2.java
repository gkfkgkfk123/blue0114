//K�� ����������
import java.util.Random;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(1000);

		int n = 10000000;
		int knum=100; //������ ���� ����
		int[] data = new int[n];
		int a[] = new int[knum];
		int b[] = new int[knum];
		int mini, max, sum,chan,chan2;
		long t = System.currentTimeMillis();

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
		
		
		
