import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import org.junit.Test;

public class countPositiveTest {
	// this test passes
	   @Test public void apartado2() 
	   {
	      int arr[] = {2, 7, -2};
	      assertEquals("¿Cuantos positivos hay(sin error)?", 1, countPositive.countPos(arr));
	   }
	   
	   @Test public void apartado3() 
	   {
	      int arr[] = {2, 0, -2};
	      assertEquals("¿Cuantos positivos hay(con error)?", 1, countPositive.countPos(arr));
	   }
	   @Test public void apartado4() 
	   {
	      int arr[] = {0, 7, 2};
	      assertEquals("¿Cuantos positivos hay(con estado error)?", 1, countPositive.countPos(arr));
	   }

}
