package studio2;

public class Pi {

	public static void main(String[] args) {
		int inCircle = 0;
		for (int throwCount = 1; throwCount <=1000; throwCount++)
		{
			double x = Math.random();
			double y = Math.random();
			double radiusSquared = Math.pow(x,2) + Math.pow(y,2);
			double radius = Math.sqrt(radiusSquared);
			
			if (radius <= 1)
			{
				inCircle++;
			}
		}
		
	}

}
