package org.example.pipeline;
/**
 * @uday
 */
public class Calculator{
	public int add(int a, int b){
		return a+b;
	}

	public int sub(int a, int b){
		return a-b;
	}

	public int mul(int a, int b){
		return a*b;
	}

	public double div(int a, int b){
		try{
			return a/b;
		}
		catch(Exception e){
			System.out.println("Caught exception: "+ e);
		}
		return 0;
	}
}
