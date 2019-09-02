package javaLearn;

import java.util.Scanner;
import java.util.Calendar;


public class CalendarTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a date(format:yyyy-mm-dd):");
		String dateStr=s.next();
		System.out.println(dateStr);//��ȡ����
		
		java.sql.Date d1=java.sql.Date.valueOf(dateStr);//����Ϊyyyy-mm-dd
		Calendar cal=Calendar.getInstance();
		cal.setTime(d1);//��ʼ��calendar����
		
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t");
		int maxDay= cal.getActualMaximum(Calendar.DATE);//ÿ���������
		//System.out.println(maxDay);
		int count=0;//����������7����
		int currDay=cal.get(Calendar.DATE);//��ȡ���������
		cal.set(Calendar.DATE, 1);//��������Ϊ1
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);//��ȡ1�ŵ�����
		
		for(int j=0;j<dayOfWeek-1;j++) {
			System.out.print("\t");
			count++;
		}//���ɿո񲢼���
		
		for(int i=1; i<=maxDay;i++) {
			
			if(currDay==i) {
				System.out.print("*"+i+"\t ");
				}//�������
			else {
				System.out.print(i+"\t ");
			}
			
			count++;
			if(count%7==0) {
				System.out.println();
			}
		}//��������
	}
}
