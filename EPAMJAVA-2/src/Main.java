import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		String op;
		int num1,num2,result=0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter two Numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			System.out.println("Enter the operator");
			op=sc.next();
			Mahesh operator;
			switch(op)
			{
				case "+":
					operator=new Add();
					result=operator.calculate(num1, num2);
					break;
				case "-":
					operator=new SUB();
					result=operator.calculate(num1, num2);
					break;
				case "*":
					operator=new MUT();
					result=operator.calculate(num1, num2);
					break;
				case "/":
					operator=new DIV();
					result=operator.calculate(num1, num2);
					break;
				default:
					System.out.println("Invalid operator");		
			}
			System.out.println(num1+" "+op+" "+num2+" = "+result);
			System.out.println("Press 1 to continue");
			int choice=sc.nextInt();
			if(choice != 1)
				break;					
		}
		sc.close();
	}
}




//
//input:
//	Enter two Numbers:
		//20
		//30
		//Enter the operator
		//+
		//20 + 30 = 50
		//Press 1 to continue
		//1
		//Enter two Numbers:
		//50
		//20
		//Enter the operator
		//-
		//50 - 20 = 30
		//Press 1 to continue
		//1
		//Enter two Numbers:
		//6
		//3
		//Enter the operator
		//(/)
		//6 / 3 = 2
		//Press 1 to continue
		//1
		//Enter two Numbers:
		//5
		//6
		//Enter the operator
		//*
		//5 * 6 = 30
		//Press 1 to continue