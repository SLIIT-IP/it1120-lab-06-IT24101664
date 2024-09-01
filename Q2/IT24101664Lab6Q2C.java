import java.util.Scanner;
public class IT24101664Lab6Q2C{

	public static void main(String[] args){

Scanner input=new Scanner(System.in);

double num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;



System.out.println("Enter number1");
num1=input.nextDouble();

System.out.println("Enter number2");
num2=input.nextDouble();

System.out.println("Enter number3");
num3=input.nextDouble();

System.out.println("Enter number4");
num4=input.nextDouble();

System.out.println("Enter number5");
num5=input.nextDouble();

System.out.println("Enter number6");
num6=input.nextDouble();

System.out.println("Enter number7");
num7=input.nextDouble();

System.out.println("Enter number8");
num8=input.nextDouble();

System.out.println("Enter number9");
num9=input.nextDouble();

System.out.println("Enter number10");
num10=input.nextDouble();

System.out.println("the numbers you entered are:" + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10);

double sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;

double avrg = sum/10;

System.out.println("sum of the number:" + sum);
System.out.println("average of the number:" + avrg);


}
}

