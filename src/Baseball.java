import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		//��ǻ�� ���� �� �����
	
		Random rd = new Random();
		int com1 = rd.nextInt(10);
		int com2 = rd.nextInt(10);
		int com3 = rd.nextInt(10);
		
		ball:
		while(true) {
		if(com1 == com2 || com1 == com3) {
			com1 = rd.nextInt();
			continue ball;
		} else if(com2 == com3) {
			com2 = rd.nextInt();
			continue ball;
		} else {
			break ball;
			}
		}
		int out = 0;
		
		game :
		while (true){
		
		//�迭ȭ �ϱ�
		int[] com = {com1,com2,com3};
		
		//������� �ޱ�
		Scanner sc = new Scanner(System.in);
		//��� �迭
		int[] hum = new int[3];
		
		System.out.println("������ ���� �Է��ϼ���.");
		for (int i = 0; i < com.length; i++) {
			int a = sc.nextInt();
			hum[i] = a;
		}
	
		//���ϱ�
		//��ī��Ʈ �����
		int str = 0;
		int ball = 0;
		
		
		check:
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < hum.length; j++) {
				if(com[i]==hum[j] && i == j){
					str++; continue check;
				}else if(com[i] == hum[j] && i!=j) {
					ball++; continue check;
				}
			}
		}
		
		if(str == 0 && ball == 0) {
			out++;
		}
		
		System.out.println("����� "+str+" ��Ʈ����ũ, "+ball+" ��, "+(3-(str+ball))+ " �ƿ��Դϴ�.");
		
		if(out >=3 || str == 3) break game;
		else {
			continue game;
		}
		}
		System.out.println("������ "+ com1 + com2 +com3);
		System.out.println("������ ����Ǿ����ϴ�.");
		
	}
}
