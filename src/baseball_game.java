import java.util.Random;
import java.util.Scanner;

/*
 * ���� 3���� 1�� �ڸ��� ���Ƿ� �����Ѵ�. (����ڴ� �����Է�, ��ǻ�ʹ� ����)
 * 3�ڸ��� ���ڸ� �ҷ��� ����� Ȯ���Ѵ�. (���� Ȯ�� X)
 * ����� �������� ����� ���ڸ� �����.
 * ����� �Ʒ��� ��Ģ�� ������.
 * ���Ǵ� ���ڴ� 0~9�����̸�, �ߺ��Ǵ� ���ڴ� ����.
 * ���ڴ� ������ ��ġ�� Ʋ���� ���� ��.
 * ���ڿ� ��ġ�� ���� Ʋ���� �ƿ�
 * ���� ��ġ�� ���� ������ ��Ʈ����ũ�� ���Ѵ�.
 * ��, 9�� �̳��� ������ ������ ���, �ƿ� ī��Ʈ�� 3�� �Ǿ��� ��� ������ ����ȴ�.
 * 3��Ʈ����ũ�� �Ǹ� �¸��Ѵ�.
 */
public class baseball_game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int ball = 0;
		int str = 0;
		int out = 0;
		int count = 0;
		int cball = rd.nextInt(10);
		int cball2 = rd.nextInt(10);
		int[] com = new int[3];
//		for (int i = 0; i < com.length; i++) {
//			cball = rd.nextInt(10);
//			com[i] = cball;
//			for (int j = i+1; j < com.length; j++) {
//				check:
				
				for (int i = 0; i < com.length; i++) {
					cball = rd.nextInt(10);
					com[i] = cball;
				}
				for (int i = 0; i < com.length; i++) {
					for (int j = i+1; j < com.length; j++) {
						if(com[i]==com[j]) {
							com[j]= rd.nextInt(10);
						}
					}
				}
//				test:
//				while(true) {
//				for (int i = 0; i < com.length; i++) {
//					for (int j = i+1; j < com.length; j++) {
//						if(com[i] == com[j]) {
//							cball2 = rd.nextInt(10);
//							com[j] = cball2; 
//							continue test;
//						}else {
//							break test;
//						}}}}
		game:
			
		while(true) {
			count++;
			str = 0;
			out = 0;
			ball = 0;
		int[] hum = new int[3];
		int hball = 0;
		System.out.println("���� �־��ּ���");
		for (int i = 0; i < hum.length; i++) {
			hball = sc.nextInt();
			hum[i]= hball;
		}
		System.out.print("����� ���� : ");
		for (int i = 0; i < hum.length; i++) {
			System.out.print(" " + hum[i]);
		}
		
		pare:
		for (int i = 0; i < hum.length; i++) {
			for (int j = 0; j < hum.length; j++) {
				if(hum[i]==com[j] && i==j) {
						str++; continue pare;
				}else if (hum[i]==com[j] && i!=j){
						ball++; continue pare; 
					}else if ( hum[i]!=com[j] && i!=j) {
					out++; continue pare;
				}
			}
		}
		
		System.out.println();
		if(out == 3) {	
			for (int i = 0; i < hum.length; i++) {
				System.out.print(com[i]+ " ");
			}
			System.out.println();
			System.out.println("�ƿ��Դϴ�!"); break;
		} else if (str==3){
			
			for (int i = 0; i < hum.length; i++) {
				System.out.print(com[i]+ " ");
			}
			System.out.println();
			System.out.println("�¸��߽��ϴ�!");
			
		}else {System.out.println("�����Ȳ : ");
			System.out.println(str + " ��Ʈ����ũ\r" + ball + " ��\r" + out+ " �ƿ�");
		}
		if (count<10) {
			continue game;
		}else if(count>=10) {
			for (int i = 0; i < hum.length; i++) {
				System.out.print(com[i]+ " ");
			}
			System.out.println();break;
		}
		
		}}}


