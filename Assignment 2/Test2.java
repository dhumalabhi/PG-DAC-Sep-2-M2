/*
2. Implement a class for "DateDemo". Write member functions for (i) getting the previous day, (iv) getting the next 
day, (iii) printing a day There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; (ii) 
day is initialized to user specified value but month and year are initialized to 01, 1970; (iii) day, month are 
initialized to user specified value but year is initialized to 1970; (iv) day, month and year are initialized to user 
defined values. Also, write a main() function to (i) create a date object; (ii) print the next and the previous day. 
*/

class DateDemo{

	int day;
	int month;
	int year;
	
	//All Constructors
	DateDemo(){	day=01; month=01; year=1970;	}
	DateDemo(int day){	this.day=day; month=01; year=1970;	}
	DateDemo(int day,int month){	this.day=day; this.month=month; year=1970;	}
	DateDemo(int day,int month,int year){	this.day=day; this.month=month; this.year=year;	}
	//Current day print method
	void day(){ System.out.println(day+"/"+month+"/"+year);}
	//Previus day print method
	void previusDay(){
		if(day>1){
			System.out.println((day-1)+"/"+month+"/"+year);//if day gretor than 1 then -1 day to get previus day
			return;
		}
		if(month>1){ 											//if day is 1 and month is not Jan(01)
			if(month==3){										//if month is March then previus month is Feb 
				if((year%4==0 && year% 100!=0) || (year%400==0)){// if leap year then last day of Feb is 29
					System.out.println(29+"/"+(month-1)+"/"+year);
					return;
				}
				System.out.println(28+"/"+(month-1)+"/"+year);//if year is not leap year then last date of Feb is 28
				return;
			}				
			if((month==5 || month==7 || month==10 || month==12)){//if present month is May,July, Oct and Dec then last month last date will be 30
				System.out.println(30+"/"+(month-1)+"/"+year);
				return;
			}else{
				System.out.println(31+"/"+(month-1)+"/"+year);//if month is other than above mention then last month last date will be 31
				return;
			}
		}
		/*
		if(month>1){
			System.out.println((day-1)+"/"+(month-1)+"/"+year);
			return;
		}
		*/
		
		System.out.println(31+"/"+12+"/"+(year-1));//if month is Jan and day 1 first then previus day could be 31 dec last year
	}
	//Next day print method
	void nextDay(){
		if(day<28){//if day is less than 28 will print +1 day
			System.out.println((day+1)+"/"+month+"/"+year);
			return;
		}
		if(month<12 && day<31){//if Month is not Dec and day is Not 31
			if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10)){//For month in which have 31 days
				System.out.println((day+1)+"/"+(month)+"/"+year);
				return;
			}else if(month==2){// Special Month Feb have deferent properties handeled using this block
				if((day==28)&&((year%4==0 && year% 100!=0) || (year%400==0))){//check wether the year is leap or not if yes then Enter inside block
					System.out.println(29+"/"+(month)+"/"+year);
					return;
				}else if(day==28 || day==29){//if Year is not leaf and month is Feb
					System.out.println(1+"/"+(month+1)+"/"+year);
					return;
				}
			}else if((day<30) && (month==4 || month==6 || month==9 || month ==11)){//if 30 day in month
				System.out.println((day+1)+"/"+(month)+"/"+year);
					return;
			}else if((day==30) && (month==4 || month==6 || month==9 || month ==11)){
				System.out.println(1+"/"+(month+1)+"/"+year);
				return;
			}
		}
		if(day==31 && month!=12){
			System.out.println(01+"/"+(month+1)+"/"+year);
			return;
		}
		System.out.println(01+"/"+01+"/"+(year+1));
		
	}	
}


public class Test2{
	public static void main(String[] args)
	{
		DateDemo d0=new DateDemo();
		d0.previusDay();
		d0.nextDay();
		d0.day();
		System.out.println("=============================================");
		
		DateDemo d=new DateDemo(1,3,2000);
		d.previusDay();
		d.nextDay();
		d.day();
		System.out.println("=============================================");
		
		DateDemo d1=new DateDemo(29,2,2000);
		d1.previusDay();
		d1.nextDay();
		d1.day();
		System.out.println("=============================================");
		
		DateDemo d2=new DateDemo(30,4,2000);
		d2.previusDay();
		d2.nextDay();
		d2.day();
		System.out.println("=============================================");
		
		DateDemo d3=new DateDemo(31,12,2000);
		d3.previusDay();
		d3.nextDay();
		d3.day();
		System.out.println("=============================================");
		
		DateDemo d4=new DateDemo(1,1,2001);
		d4.previusDay();
		d4.nextDay();
		d4.day();
		
		System.out.println("=============================================");
		DateDemo d5=new DateDemo(31,3,2000);
		d5.previusDay();
		d5.nextDay();
		d5.day();
	}	
}


/*
Output:


C:\Users\dhuma\Desktop\C-DAC\Module 2\Assigment 2>javac Test2.java

C:\Users\dhuma\Desktop\C-DAC\Module 2\Assigment 2>java Test2
31/12/1969
2/1/1970
1/1/1970
=============================================
29/2/2000
2/3/2000
1/3/2000
=============================================
28/2/2000
1/3/2000
29/2/2000
=============================================
29/4/2000
1/5/2000
30/4/2000
=============================================
30/12/2000
1/1/2001
31/12/2000
=============================================
31/12/2000
2/1/2001
1/1/2001
=============================================
30/3/2000
1/4/2000
31/3/2000




*/