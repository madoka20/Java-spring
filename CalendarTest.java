package javaLearn;

import java.util.Scanner;
import java.util.Calendar;


public class CalendarTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a date(format:yyyy-mm-dd):");
		String dateStr=s.next();
		System.out.println(dateStr);//获取日期
		
		java.sql.Date d1=java.sql.Date.valueOf(dateStr);//必须为yyyy-mm-dd
		Calendar cal=Calendar.getInstance();
		cal.setTime(d1);//初始化calendar对象
		
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t");
		int maxDay= cal.getActualMaximum(Calendar.DATE);//每月最大天数
		//System.out.println(maxDay);
		int count=0;//计数器，逢7换行
		int currDay=cal.get(Calendar.DATE);//获取输入的日期
		cal.set(Calendar.DATE, 1);//将日期设为1
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);//获取1号的星期
		
		for(int j=0;j<dayOfWeek-1;j++) {
			System.out.print("\t");
			count++;
		}//生成空格并计数
		
		for(int i=1; i<=maxDay;i++) {
			
			if(currDay==i) {
				System.out.print("*"+i+"\t ");
				}//当天标星
			else {
				System.out.print(i+"\t ");
			}
			
			count++;
			if(count%7==0) {
				System.out.println();
			}
		}//生成日历
	}
}
