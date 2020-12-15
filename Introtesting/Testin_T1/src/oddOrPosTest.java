import static org.junit.Assert.*;
	import org.junit.*;
	import java.util.*;
	import org.junit.Test;

public class oddOrPosTest {
	//Estos test pasan debido a la correción en el código
	 @Test public void apartado2() 
	   {
	      int arr[] = {1,0,2};
	      assertEquals("apartado 2 sin error", 2, oddOrPos.oddPos(arr));
	   }
	   
	   @Test public void apartado3() 
	   {
	      int arr[] = {2, 0, -1};
	      assertEquals("apartado 3 con error", 2, oddOrPos.oddPos(arr));
	   }
	   @Test public void apartado4() 
	   {
	      int arr[] = null;
	      assertEquals("apartado 4 con error de estado", 0, oddOrPos.oddPos(arr));
	   }
}
