package com.outputmaxage;

/**
 * ����
һ�� ����һ���޲δ�����ֵ�ķ�����ʵ�����ѧ����������ֵ

��ʾ��
 1�� ����һ���������� ages ������ѧ�����䣬����Ԫ������Ϊ 18 ,23 ,21 ,19 ,25 ,29 ,17
 2�� ����һ�����α��� max ,����ѧ��������䣬��ʼʱ�ٶ������еĵ�һ��Ԫ��Ϊ���ֵ
 3�� ʹ�� for ѭ�����������е�Ԫ�أ�����ٶ������ֵ�Ƚϣ�����ȼٶ������ֵҪ�����滻

��ǰ�����ֵ
 4�� ʹ�� return �������ֵ
���� ��� main ����

��ʾ��
 1�� �����Զ��巽��������������ֵ�����ڱ��� maxScore ��
 2�� ����������*/

public class MyOutputMaxAge {
	public static void main(String[] args) {
		//ʵ��������
		MyOutputMaxAge maxAgeOb = new MyOutputMaxAge();
		//���÷���
		System.out.println(maxAgeOb.getStuMaxAge());
	}
	
	public int getStuMaxAge(){
		int[] ages = {18,23,21,19,25,29,17};
		int maxAge = ages[0];//��������ʼ��Ϊ����ĵ�һ��Ԫ��
		for(int i = 0;i < ages.length;i++){
			if(ages[i]>maxAge){
				maxAge = ages[i];
			}
		}
		
		return maxAge;
	}
}
