
public class lastZero {
	/**
	* Find LAST index of zero
	*
	* @param x array to search
	* @return index of last 0 in x; -1 if absent
	* @throws NullPointerException if x is null
	*/
	public static int lastZer(int[] x)
	{	
		int pos=-1; //devuelve de primeras estado de error por si no encuentra en todo el array
		for (int i = 0; i < x.length; i++)
		{
			if (x[i] == 0)
			{
				pos=i;
			}
		}
		return pos;
		
	}
}
