import java.util.Random;
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(1000);
		Scanner scan = new Scanner(System.in);
		System.out.print("�ε��� ũ�� N�� �Է��ϼ���:");
		int n= scan.nextInt();
		int[] data = new int[n];
		for(int i =0; i < n; i++){
			data[i] = rand.nextInt();
		}
		System.out.print("a��° �ε����� �Է��ϼ��� :");
		int a = scan.nextInt();
		System.out.print("b��° �ε����� �Է��ϼ��� :");
		int b = scan.nextInt();
		int mini = data[a];
		for(int i = a; i<=b-a+1; i++){
			if(data[i]<mini)
				mini = data[i];
		}
		int max=data[a];
	
		for(int i =a; i<=b-a+1; i++){
			if(data[i]>max)
				max = data[i];
				
		}
		int sum = 0;
		for(int i =a; i<=b; i++){
			sum+= data[i];
		}
		System.out.println("a,b���� ���� �ּڰ���:"+mini);
		System.out.println("a,b���� ���� �ִ���:"+max);
		System.out.println("a,b���� ���� �հ�� :" +sum);
		scan.close();
		}
		

	}

