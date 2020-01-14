package org.godutch.eclipse;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public int[] dividePayment(int payment,int num_member) { // �ο���, �ѱݾ� �Է¹޾� ������ �Լ�
		int[] divided_payment=new int[num_member];  // ���� �ݾ� �����ϴ� �迭
		float[] random_payment=new float[num_member];  // ���� ������ �ݾ� �����ϴ� �迭
		float total=0,ratio;  // ���� ������ �ݾװ� ���� �ݾ��� ����
		Random random=new Random();
		for(int i=0;i<num_member;i++) {  // �ο�����ŭ ���� �ݾ� ����
			random_payment[i]=random.nextFloat();
			total+=random_payment[i];
		}
		ratio=payment/total;
		for(int i=0;i<num_member;i++) {  // �ο�����ŭ �����ݾ����� ȯ��
			divided_payment[i]=(int)(random_payment[i]*ratio);
		}
		return divided_payment;  // �����ݾ� �迭 ��ȯ
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		int payment,num_member=0;  // �� ���ұݾ�, �ο���
		String name="����";  // ���ڿ� ������ ���̸� ������ ����
		System.out.print("�� ���ұݾ��� �Է����ּ��� : ");
		payment=sc.nextInt();
		System.out.print("������ �̸��� �Է����ּ��� : \n");
		scan.nextLine();
		while(name.length()!=0) {
			name = scan.nextLine();
			num_member++;
		}
		sc.close();
		scan.close();
		Main m=new Main();
		int[] divided_payment = m.dividePayment(payment,num_member);  // �Լ� ȣ��
		for(int i=0;i<num_member;i++) {
			System.out.println(divided_payment[i]);
		}
	}

}
