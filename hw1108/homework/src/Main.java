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
		System.out.print("인덱스 크기 N을 입력하세요:");
		int n= scan.nextInt();
		int[] data = new int[n];
		for(int i =0; i < n; i++){
			data[i] = rand.nextInt();
		}
		System.out.print("a번째 인덱스를 입력하세요 :");
		int a = scan.nextInt();
		System.out.print("b번째 인덱스를 입력하세요 :");
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
		System.out.println("a,b구간 내에 최솟값은:"+mini);
		System.out.println("a,b구간 내에 최댓값은:"+max);
		System.out.println("a,b구간 내의 합계는 :" +sum);
		scan.close();
		}
		

	}

