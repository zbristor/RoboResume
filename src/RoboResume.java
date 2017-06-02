import java.util.ArrayList;
import java.util.Scanner;

public class RoboResume {

	public static void main(String[] args) {
		
int expCount=0;
int eduCount=0;
int sCount=0;
String input="";
ArrayList<String> wAL = new ArrayList<String>();
ArrayList<String> aAL = new ArrayList<String>();
ArrayList<String> sAL = new ArrayList<String>();
String toStop = "stop";
Scanner sc = new Scanner(System.in);

System.out.println("Enter your name: ");
String name = sc.nextLine();
System.out.println("Enter an email address: ");
String email = sc.nextLine();
System.out.println("Enter the degrees that you have earned: ");
		do{
			eduCount++;
			if(eduCount!=10)
			{
				if(!(toStop.equalsIgnoreCase(input))){
				input = sc.nextLine();
				aAL.add(input);
				}
			}
		}while(!(toStop.equals(input)) && eduCount<11);
		
System.out.println("Enter the work experience and type stop to stop");
		do{
			expCount+=1; 
			if(expCount!=10)
			{
				//if(!(input.equalsIgnoreCase(toStop))){
					input = sc.nextLine();
					wAL.add(input);
				
			}
		}while(!(toStop.equalsIgnoreCase(input)) && expCount<11); 
		//System.out.println(wAL);									
		
System.out.println("Enter a skill: ");
		do{
			sCount+=1;
			if(sCount!=20)
			{
				input = sc.nextLine();
				sAL.add(input);
			}
		}while(!(toStop.equals(input)) && sCount<21);
System.out.println("===========================================================");
System.out.println(name);
System.out.println(email);
System.out.println();
System.out.println("Education");
for(int i=0; i<aAL.size();i++)
{
	aAL.set(aAL.size()-1, "");
	System.out.println(aAL.get(i));
}
System.out.println();
System.out.println("Experience");
for(int j=0; j<wAL.size(); j++)
{
	wAL.set(wAL.size()-1, "");
	System.out.println(wAL.get(j));
}
System.out.println();
System.out.println("Skills");
for(int k=0; k<sAL.size(); k++)
{
	sAL.set(sAL.size()-1, "");
	System.out.println(sAL.get(k));
}

	}
}