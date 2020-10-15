import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int[] num2 = new int[k]; //12345678넣을
		int[] stack = new int[1024]; //43687521
		int[] show = new int[k]; //num2에서 빼서정답에 맞출 스택
		char[] booho = new char[1024]; //부호 넣을 스택
		for(int i =0; i <k; i++){
			stack[i] = scan.nextInt();

	}
		int topnum2 = -1;
		int topshow = -1;
		
		for(int i = 0; i < k; i++){
			while(num2[topnum2] <= stack[i]){
				num2[++topnum2] = i+1;}
			if(num2[topnum2] == stack[i]){
				num2[topnum2--] = show[++topshow];
			}
			if(stack[i]< num2[topnum2]
			}
			}
			if(stack[]>= num2[i]){
				while(stack[0])
				
				topnum2++;}
			if(stack[0]== i+1){
				num2[topnum2] = show[++topshow];
				topnum2--;}
			if(stack[0]< i+1){
				break;}
		
		if(stack[topshow+1] == num2[topnum2]){
			show[++topshow]= num2[topnum2--];
		}
		}
	}
}
			
			
				
			
			
				
			
			
				
			
			
			
		

	

