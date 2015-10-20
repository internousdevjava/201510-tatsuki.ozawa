import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Kisokadai3 {
	public static void main(String[] args) {

		int cmd;
		while (true) {
			System.out.println("メニュー");
			System.out.println("コマンド入力");
			System.out.println("1.作成+開く2.終了");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();
				cmd = Integer.parseInt(buf);
				switch (cmd) {
				case 1:
					
					System.out.println("<新規作成/開く>");
					System.out.println("以下の例に習ってパスとファイル名を入れてください:");
					System.out.println("例:c:\\Users\\internous\\ファイル名.txt");
					String fln = br.readLine();
					
					File newfile = new File(fln);
					
					File dir = new File(newfile.getParent());

					if (!dir.exists()) {
						System.out.println("フォルダがありません" + newfile.getPath());
						dir.mkdirs();
						System.out.println("フォルダを作成しました");
					}
					try {
						if (newfile.createNewFile()) {
							System.out.println(fln + "ファイルの作成に成功しました");
						} else {
							System.out.println(fln + "ファイルを開きました");

						}
						
						System.out.println("<編集モード>");
						System.out.println("1:書き込み,2:読み込み3.メインメニューへ");
						try {
							buf = br.readLine();
							cmd = Integer.parseInt(buf);
						} catch (Exception e) {
							System.out.println("数字以外が入っています");
							System.out.println(e);
							continue;
						}
						switch (cmd) {
						
						case 1:
							System.out.println("<書き込みモード>");
							System.out.println("[1]上書き,[2]追記,[3]メインメニューへ");
							try {
								buf = br.readLine();
								cmd = Integer.parseInt(buf);
							} catch (Exception e) {
								System.out.println("数字以外が入っています");
								continue;
							}
							switch (cmd) {
							case 1:
								
								System.out.println("上書きモード");
								System.out.println("文字を入力してください");
								String text = br.readLine();
								try {
									PrintWriter pw = new PrintWriter(new BufferedWriter(
											new FileWriter(fln)));
									System.out.println("上書きしました");
									pw.println(text);
									pw.close();
								} catch (IOException e) {
									System.out.println("エラーです");
								}
								continue;
						
						case 2:
							
							System.out.println("追記モード");
							text = br.readLine();
							try {
								FileWriter filewriter = new FileWriter(fln,true);
								System.out.println("追記しました");
								filewriter.write(text);
								filewriter.close();
							} catch (FileNotFoundException e) {
								System.out.println(e);
							} catch (IOException e) {
								System.out.println(e);
							}
				case 3:
					continue;
					
				default:
					System.out.println("１から3までを入力してください");
					continue;
				}
				
			
			case 2:
				
				System.out.println("読み込みモード");
				try {
					FileReader filereader = new FileReader(fln);

					int ch;
					while ((ch = filereader.read()) != -1) {
						System.out.print((char) ch);
					}
					System.out.println("");
					filereader.close();
				} catch (FileNotFoundException e) {
					System.out.println(e);
				} catch (IOException e) {
					System.out.println(e);
				}
			case 3:
				
				continue;

			default:
				System.out.println("1から3までの数字を入力してください");
				continue;
			}

		} catch (IOException e) {
			System.out.println(e);
		}
		continue;
	case 2:
		
		System.out.println("終了します");
		return;
	default:
		System.out.println("1から2までの数字を入力してください");
		continue;
	}
} catch (Exception e) {
	System.out.println("数字以外が入力されています");
	continue;
	
}
}
}}
