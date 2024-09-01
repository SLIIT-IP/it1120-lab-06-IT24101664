import java.util.Scanner;
public class  IT24101664Lab6Q3{

	public static void main(String[] args){

Scanner input=new Scanner(System.in);

int num;
int sumofsquare=0;
int count=0;


System.out.println("enter positive integers(terminate input with -99)");

while(true){

System.out.println("enter a number");
num=input.nextInt();

if(num<0 && num!=-99){
System.out.println("please enter positive integer or -99 to terminate");
continue;}


if(num==-99){
break;}


sumofsquare+= num*num;
count=count+1;
}

double rms=Math.sqrt(sumofsquare/count);

System.out.print(" the root mean square rms is:"+ rms);

}
}




