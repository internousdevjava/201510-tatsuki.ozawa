import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Kisokadai2 {
	public static void main(String[] args) {
		System.out.print("�����Q�[��");
		
		int useranswer;
		Random rnd = new Random();
		
		int ran = rnd.nextInt(100) + 1;
		
		while (true) {
			System.out.print("1����P�O�O�܂ł̐��������");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			try {
				String buf= br.readLine();
				useranswer = Integer.parseInt(buf);
				if (useranswer > 100 || useranswer < 1) {
					System.out.println("��1�`100�܂ł̐����ł��肢���܂�");
					continue;
				}
			} catch (Exception e) {
				System.out.println("�������ȊO�������Ă��܂�");
				continue;
			}
			if (useranswer > ran) {
				System.out.println("�����͂����菬�������ł�");
				continue;
			} else if (useranswer < ran) {
				System.out.println("�����͂�����傫�����ł�");
			} else {
				System.out.println("�����ł��I���߂łƂ�");
				break;
			}
		}
	}
}