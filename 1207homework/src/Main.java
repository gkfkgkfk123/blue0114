import java.util.*;
public class Main {
    public static int histo(int[] v , int a , int b) {
        if(a>b) return -1;
        if(a==b) return v[a]*1;

        int mid = (a+b)/2;
        //��, �� �� ���� ���ؼ� ����
        int result  = Math.max(histo(v, a, mid),histo(v, mid+1, b));

        int w = 1; //���Ӱ����� �� 
        int h = v[mid] ; //�ּ� ����
        int l = mid; //����
        int r = mid;
        while(r-l < b - a) {
            int p = (l > a) ? Math.min(h, v[l - 1]) : -1;
            int leftIdx = (p == -1) ? 0 : l-1;
            int q = (r < b) ? Math.min(h, v[r + 1]) : -1;
            int rightIdx = (q == -1) ? 0 : r+1;
            if(p > q) { //������ �� Ŭ�� 
                h = p;
                ++w;
                l--;
            }else{
                h = q;
                ++w;
                r++;
            }
            result = Math.max(result, h*w);
        }
    
        return result;
    }
        static int histo(int[] v, int n){
    		return histo(v, 0, n-1);
    	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[100001];
        for(int i=1; i<=n; i++) {
            v[i] = sc.nextInt();
        }
        int result = histo(v, n); 
        System.out.println(result);
    
}
}