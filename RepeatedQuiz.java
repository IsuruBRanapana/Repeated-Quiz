import java.util.Scanner;
public class RepeatedQuiz{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);

		System.out.print("Enter the value of "+number1+" + "+number2+" :- ");
		int answer=input.nextInt();
		while(number1+number2!=answer){
			System.out.print("Your answer is wrong, Try again ");
			answer=input.nextInt();
		}
		System.out.println("You got it !!!");
	}
}