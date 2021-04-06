package ventana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ventanaTestjunit {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public static int suma(int a, int b) {
		int suma=a+b ;
			
		
		return suma;
		
	}
	@Test
	public static int Resta(int a, int b) {
		int Resta=a-b ;
			
		
		return Resta;
	}
	@Test
	public static int multiplicacion(int a, int b) {
		int multiplicacion=a*b ;
			
		
		return multiplicacion;
	}
	@Test
	public static int division(int a, int b) {
		int division=a/b ;
			
		
		return division;

}}
