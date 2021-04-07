import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		//컴퓨터 랜덤 볼 만들기
	
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
		
		//배열화 하기
		int[] com = {com1,com2,com3};
		
		//사람한테 받기
		Scanner sc = new Scanner(System.in);
		//사람 배열
		int[] hum = new int[3];
		
		System.out.println("세가지 수를 입력하세요.");
		for (int i = 0; i < com.length; i++) {
			int a = sc.nextInt();
			hum[i] = a;
		}
	
		//비교하기
		//값카운트 만들기
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
		
		System.out.println("결과는 "+str+" 스트라이크, "+ball+" 볼, "+(3-(str+ball))+ " 아웃입니다.");
		
		if(out >=3 || str == 3) break game;
		else {
			continue game;
		}
		}
		System.out.println("정답은 "+ com1 + com2 +com3);
		System.out.println("게임이 종료되었습니다.");
		
	}
}
