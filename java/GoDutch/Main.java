package org.godutch.eclipse;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public int[] dividePayment(int payment,int num_member) { // 인원수, 총금액 입력받아 나누는 함수
		int[] divided_payment=new int[num_member];  // 나눈 금액 저장하는 배열
		float[] random_payment=new float[num_member];  // 랜덤 생성한 금액 저장하는 배열
		float total=0,ratio;  // 랜덤 생성된 금액과 실제 금액의 비율
		Random random=new Random();
		for(int i=0;i<num_member;i++) {  // 인원수만큼 랜덤 금액 생성
			random_payment[i]=random.nextFloat();
			total+=random_payment[i];
		}
		ratio=payment/total;
		for(int i=0;i<num_member;i++) {  // 인원수만큼 실제금액으로 환산
			divided_payment[i]=(int)(random_payment[i]*ratio);
		}
		return divided_payment;  // 실제금액 배열 반환
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int payment,num_member=0;  // 총 지불금액, 인원수
		String name="김상민";  // 문자열 변수가 길이를 갖도록 선언
		System.out.print("총 지불금액을 입력해주세요 : ");
		payment=sc.nextInt();
		while(name.length()!=0) {
			System.out.print("구성원 이름을 입력해주세요 : ");
			name=sc.nextLine();
			num_member++;
		}
		sc.close();
		Main m=new Main();
		int[] divided_payment = m.dividePayment(payment,num_member);  // 함수 호출
		for(int i=0;i<num_member;i++) {
			System.out.println(divided_payment[i]);
		}
	}

}
