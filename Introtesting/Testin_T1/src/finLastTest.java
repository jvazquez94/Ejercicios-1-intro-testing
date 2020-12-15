import static org.junit.Assert.*;
	import org.junit.*;
	import java.util.*;
	import org.junit.Test;


public class finLastTest {
	//Estos test pasan debido a la correción en el código
		   @Test public void apartado2() 
		   {
		      int arr[] = {1, 7, 2};
		      int y = 2;
		      assertEquals("Apartado 1 sin error", 2, findLast.findLastn(arr,y));
		   }
		   
		   @Test public void apartado3() 
		   {
		      int arr[] = {2, 0, 3};
		      int y = 2;
		      assertEquals("Apartado 2 con error", 0, findLast.findLastn(arr,y));
		   }
		   @Test public void apartado4() 
		   {
		      int arr[] = null;
		      int y = 2;
		      assertEquals("Apartado 3 con error de estado", -1, findLast.findLastn(arr,y));
		   }
}
