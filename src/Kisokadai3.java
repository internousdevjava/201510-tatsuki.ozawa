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
			System.out.println("���j���[");
			System.out.println("�R�}���h����͂��Ă�������");
			System.out.println("1.�쐬�J���@2.�I��");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();
				cmd = Integer.parseInt(buf);
				switch (cmd) {
				case 1:
					
					System.out.println("<�V�K�쐬/�J��>");
					System.out.println("�t�@�C���̖��O�����Ă�������:");
					System.out.println("��:c:\\Users\\internous\\�t�@�C����.txt");
					String fln = br.readLine();
					
					File newfile = new File(fln);
					
					File dir = new File(newfile.getParent());

					if (!dir.exists()) {
						System.out.println("�t�H���_������܂���B:" + newfile.getAbsolutePath());
						dir.mkdirs();
						System.out.println("�쐬����");
					}
					try {
						if (newfile.createNewFile()) {
							System.out.println(fln + "�t�@�C���̍쐬�ɐ������܂����B");
						} else {
							System.out.println(fln + "�t�@�C�����J���܂���");

						}
						
						System.out.println("<�ҏW���[�h> [" + fln + "]");
						System.out.println("1:��������,2:�ǂݍ���,3:���C�����j���[��");
						try {
							buf = br.readLine();
							cmd = Integer.parseInt(buf);
						} catch (Exception e) {
							System.out.println("��O���������܂����B");
							System.out.println(e);
							continue;
						}
						switch (cmd) {
						
						case 1:
							System.out.println("<�������݃��[�h > ["+ fln + "]");
							System.out.println("[1]�㏑��,[2]�ǋL,[3]���C�����j���[��");
							try {
								buf = br.readLine();
								cmd = Integer.parseInt(buf);
							} catch (Exception e) {
								System.out.println("�������ȊO�������Ă��܂�");
								continue;
							}
							switch (cmd) {
							case 1:
								
								System.out.println("<�㏑�����[�h>");
								System.out.println("��������͂��Ă���������");
								String text = br.readLine();
								try {
									PrintWriter pw = new PrintWriter(new BufferedWriter(
											new FileWriter(fln)));
									System.out.println(fln);
									pw.println(text);
									pw.close();
								} catch (IOException e) {
									System.out.println("�G���[");
								}
								continue;
						
						case 2:
							
							System.out.println("�ǋL");
							text = br.readLine();
							try {
								FileWriter filewriter = new FileWriter(fln,true);
								System.out.println("�ǋL���܂�");
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
					System.out.println("1�`3����͂��Ă�������");
					continue;
				}
				
			
			case 2:
				
				System.out.println("�ǂݍ���");
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
				System.out.println("1�`3����͂��Ă�������");
				continue;
			}

		} catch (IOException e) {
			System.out.println(e);
		}
		continue;
	case 2:
		
		System.out.println("�I�����܂�");
		return;
	default:
		System.out.println("1�`2�̐�������͂��Ă�������");
		continue;
	}
} catch (Exception e) {
	System.out.println("�����ȊO�����͂���Ă܂�");
	continue;
	
}
}
}}
