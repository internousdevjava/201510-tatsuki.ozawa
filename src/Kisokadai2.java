import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Kisokadai2 {
	public static void main(String[] args) {
		System.out.print("”šƒQ[ƒ€");
		
		int useranswer;
		Random rnd = new Random();
		
		int ran = rnd.nextInt(100) + 1;
		
		while (true) {
			System.out.print("1‚©‚ç‚P‚O‚O‚Ü‚Å‚Ì”š‚ğ“ü—Í");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			try {
				String buf= br.readLine();
				useranswer = Integer.parseInt(buf);
				if (useranswer > 100 || useranswer < 1) {
					System.out.println("¦1`100‚Ü‚Å‚Ì”š‚Å‚¨Šè‚¢‚µ‚Ü‚·");
					continue;
				}
			} catch (Exception e) {
				System.out.println("¦”šˆÈŠO‚ª“ü‚Á‚Ä‚¢‚Ü‚·");
				continue;
			}
			if (useranswer > ran) {
				System.out.println("³‰ğ‚Í‚»‚ê‚æ‚è¬‚³‚¢”‚Å‚·");
				continue;
			} else if (useranswer < ran) {
				System.out.println("³‰ğ‚Í‚»‚ê‚æ‚è‘å‚«‚¢”‚Å‚·");
			} else {
				System.out.println("³‰ğ‚Å‚·I‚¨‚ß‚Å‚Æ‚¤");
				break;
			}
		}
	}
}