	import java.util.Random;
import java.util.Scanner;
	public class Main {
		
		static void Josepus(int n){
			
			Random rand = new Random(1000);
			int[] queue = new int[1000000];
			int[] stack = new int[1000000];
			int head = 0, tail = 0, top=0;
			for(int i =0; i < n; i++){
				queue[i]=rand.nextInt(10000);
				tail =(tail+1)%1000000;
				stack[i]=rand.nextInt(10000);
				top = (top+1)%1000000;
			}
			
			while(head != tail)
				for(int i =0;i<n;i++){
					if(stack[top]<queue[head])
						queue[tail] = stack[top--];
						tail =(tail+1)%1000000;
					if(top==0||queue[head]<stack[top])
						stack[++top]=queue[head];
						head=(head+1)%1000000;
				}
						
				System.out.println(stack[top--]);
					
			
			
					
				}
				
			
				
			
			

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
	
		System.out.print("n을 입력하세요:");
		int n = scan.nextInt();
		
		
		Josepus(n);

	}

}
