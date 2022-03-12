import java.util.Scanner ;
public class bmicalc
{
public static void main(String[]args)
{
System.out.println("Welcome to the BMI calcuator! "); 
Scanner bm = new Scanner (System.in);
System.out.println("Enter your weight : ");
int weight = bm.nextInt();
System.out.println("Enter your height: ");
double height = bm.nextDouble(); 
double res = weight/(height*height);
System.out.println("Your bmi is: " + res);
}
}