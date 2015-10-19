import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai1 {
	public static void main(String args[]) 
	{
		System.out.println("九九の表");

		int x;

		System.out.print("xを入力してください: ");
		InputStreamReader xxx = new InputStreamReader(System.in);
		BufferedReader isrx = new BufferedReader(xxx);
		try {
			String bufx = isrx.readLine();
			x = Integer.parseInt(bufx);
			if (x> 100 || x< 1) {
				System.out.println("無効な入力");
				{
					return;
				}
			}
		} catch (Exception e) {
			x = 0;
		}
		int y;
		System.out.print("yを入力してください: ");
		InputStreamReader yyy = new InputStreamReader(System.in);
		BufferedReader isry = new BufferedReader(yyy);
		try {
			String bufy = isry.readLine();
			y = Integer.parseInt(bufy);
			if (y > 100 || y< 1) {
				System.out.println("無効な入力");
				{
					return;
				}
			}
		} catch (Exception e) {
			y = 0;
		}

		 // 配列の宣言。
	    int kuku[][] = new int[y][x];

	    // 九九の結果を配列に保存。
	    for( int i=y; i>=1; i-- ) {
	      for( int j=0; j<x; j++ ){
	    	  kuku[i-1][j] = i * (j+1);
	      }
	    }

	    // 九九の結果を表示。
	    for( int i=y; i>=1; i-- ) {
	      for( int j=0; j<x; j++ ) { 
	    	  System.out.print(kuku[i-1][j] + " "); 
	      }
	      	  System.out.println(); 
	    }}
}

