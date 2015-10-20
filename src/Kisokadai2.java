import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Kisokadai2 {
	public static void main(String[] args) {
		System.out.print("数字ゲーム");
		
		int useranswer;
		Random rnd = new Random();
		
		int ran = rnd.nextInt(100) + 1;
		
		while (true) {
			System.out.print("1から100までの数字を入力");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			try {
				String buf= br.readLine();
				useranswer = Integer.parseInt(buf);
				if (useranswer > 100 || useranswer < 1) {
					System.out.println("※1から100までの数字でお願いします");
					continue;
				}
			} catch (Exception e) {
				System.out.println("数字以外が入っています");
				continue;
			}
			if (useranswer > ran) {
				System.out.println("正解はそれより小さい数字です");
				continue;
			} else if (useranswer < ran) {
				System.out.println("正解はそれより大きい数字です");
			} else {
				System.out.println("正解です");
				break;
			}
		}
	}
}