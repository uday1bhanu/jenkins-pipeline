package org.example.pipeline;
/**
 * @uday
 */
public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Basic Calculator Test!");
	Calculator calc = new Calculator();
	System.out.println("Adding 3+1 : "+ calc.add(3,1));
	System.out.println("Substractin 3-1 : "+ calc.sub(3,1));
	System.out.println("Multiplying 3*1 : "+ calc.mul(3,1));
	System.out.println("Dividing 3/1 : "+ calc.div(3,1));
    }
}
