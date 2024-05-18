package lamda_assignment;
interface calculator{
	double calculate(double a,double b);
	
	static calculator addition() {
		return (a,b)-> a+b; }
	static calculator subtraction() {
		return (a,b)-> a-b; }
	static calculator multiplication() {
		return (a,b)-> a*b; }
	static calculator division() {
		return (a,b)-> {
		if(b==0) {
			throw new ArithmeticException("denominator divided by 0 doesn't give a valid answer");
		}
		return a/b;};
	}
}
public class ques1{
	public static void main(String[] args) {
		calculator add=calculator.addition();
		calculator subs=calculator.subtraction();
		calculator mul=calculator.multiplication();
		calculator div=calculator.division();
		
		double a=10;
		double b=5;
		System.out.println("Additon = "+ add.calculate(a,b));
		System.out.println("Subtraction = "+ subs.calculate(a,b));
		System.out.println("Multiplication = "+ mul.calculate(a,b));
		System.out.println("Division = "+ div.calculate(a,b));
		
		//test division by zero
		try {
			System.out.println("Division = "+ div.calculate(a,0));
		}
		catch(ArithmeticException e){
			System.out.println("Error: "+e.getMessage());
		}
    }
}
