package taller2;

public class SegundoPunto {

	public void puntoA() {
		double total;
		double num1=24;
		double num4=5;
		
		total=Math.sqrt(((Math.pow(num1,num4)-6)))/4;
		System.out.println("el total de la ecuacion es:"+total);
				
	}
	public void puntoB() {
		double total;
		double num1=4;
		double num2=8;
		
		total=(Math.pow(num1, num2))-(Math.pow(6, num2));
		System.out.println("el total de la ecuacion es:"+total);
	}
	public void puntoC() {
	   double total;
	   double num1=5;
	   double num2=56;
	   total=(4*Math.cos(num1/5)-(Math.sin(Math.pow(num2,2))));
	   System.out.println("el total de la ecuacion es:"+total);
	}
	public void puntoD() {
		double total;
		double num1=15;
		double num2=56;
		total=((Math.pow(num1, 4))-(Math.sqrt((6*num1)-(Math.pow(num2,3)))));
		System.out.println("el total de la ecuacion es:"+total);
	}
	public void puntoE() {
		
	}
	public void puntoF() {
		double total;
		double num1=78;
		total=7*(Math.cos(Math.sqrt(5-Math.sin(Math.sqrt(3*num1-4)))));
		System.out.println("el total de la ecuacion es:"+total);
	}
	}
}
