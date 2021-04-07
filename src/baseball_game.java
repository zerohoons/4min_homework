import java.util.Random;
import java.util.Scanner;

/*
 * 각각 3개의 1의 자리를 임의로 지정한다. (사용자는 직접입력, 컴퓨터는 난수)
 * 3자리의 숫자를 불러서 결과를 확인한다. (서로 확인 X)
 * 결과를 바탕으로 상대의 숫자를 맞춘다.
 * 결과는 아래의 규칙에 따른다.
 * 사용되는 숫자는 0~9까지이며, 중복되는 숫자는 없다.
 * 숫자는 맞지만 위치가 틀렸을 경우는 볼.
 * 숫자와 위치가 전부 틀리면 아웃
 * 숫자 위치가 전부 맞으면 스트라이크로 정한다.
 * 단, 9번 이내에 맞추지 못했을 경우, 아웃 카운트가 3이 되었을 경우 게임은 종료된다.
 * 3스트라이크가 되면 승리한다.
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
		System.out.println("수를 넣어주세요");
		for (int i = 0; i < hum.length; i++) {
			hball = sc.nextInt();
			hum[i]= hball;
		}
		System.out.print("사용자 예측 : ");
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
			System.out.println("아웃입니다!"); break;
		} else if (str==3){
			
			for (int i = 0; i < hum.length; i++) {
				System.out.print(com[i]+ " ");
			}
			System.out.println();
			System.out.println("승리했습니다!");
			
		}else {System.out.println("현재상황 : ");
			System.out.println(str + " 스트라이크\r" + ball + " 볼\r" + out+ " 아웃");
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


