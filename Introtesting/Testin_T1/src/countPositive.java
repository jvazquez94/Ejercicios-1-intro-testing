

public class countPositive {
	/**
	   * Counts zeroes in an array
	   *
	   * @param x  array to count positive numbers in
	   * @return   number of positive numbers in x
	   * @throws   NullPointerException if x is null
	   */

	public static int countPos(int[] x) 
	{
		int count=0;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>0) {//Código ya corregido el >= por el >
				count++;
			}
		}
		return count;
	}
}
