import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai1 {
	public static void main(String args[]) 
	{
		System.out.println("���̕\");

		int x;

		System.out.print("x����͂��Ă�������: ");
		InputStreamReader xxx = new InputStreamReader(System.in);
		BufferedReader isrx = new BufferedReader(xxx);
		try {
			String bufx = isrx.readLine();
			x = Integer.parseInt(bufx);
			if (x> 100 || x< 1) {
				System.out.println("�����ȓ���");
				{
					return;
				}
			}
		} catch (Exception e) {
			x = 0;
		}
		int y;
		System.out.print("y����͂��Ă�������: ");
		InputStreamReader yyy = new InputStreamReader(System.in);
		BufferedReader isry = new BufferedReader(yyy);
		try {
			String bufy = isry.readLine();
			y = Integer.parseInt(bufy);
			if (y > 100 || y< 1) {
				System.out.println("�����ȓ���");
				{
					return;
				}
			}
		} catch (Exception e) {
			y = 0;
		}

		 // �z��̐錾�B
	    int kuku[][] = new int[y][x];

	    // ���̌��ʂ�z��ɕۑ��B
	    for( int i=y; i>=1; i-- ) {
	      for( int j=0; j<x; j++ ){
	    	  kuku[i-1][j] = i * (j+1);
	      }
	    }

	    // ���̌��ʂ�\���B
	    for( int i=y; i>=1; i-- ) {
	      for( int j=0; j<x; j++ ) { 
	    	  System.out.print(kuku[i-1][j] + " "); 
	      }
	      	  System.out.println(); 
	    }}
}

