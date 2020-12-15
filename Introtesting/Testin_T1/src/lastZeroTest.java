import static org.junit.Assert.*;
	import org.junit.*;
	import java.util.*;
	import org.junit.Test;

public class lastZeroTest {
	//Estos test pasan debido a la corrección del código
	 @Test public void apartado2() 
	   {
	      int arr[] = {2, 0, -2};
	      assertEquals("Apartado 2 sin error", 1, lastZero.lastZer(arr));
	   }
	   
	   @Test public void apartado3() 
	   {
	      int arr[] = {2, 0, 0};
	      assertEquals("Apartado 3 con error", 2, lastZero.lastZer(arr));
	   }
	   @Test public void apartado4() 
	   {
	      int arr[] = null;
	      assertEquals("Apartado 4 con error de estado", -1, lastZero.lastZer(arr));
	   }
}
