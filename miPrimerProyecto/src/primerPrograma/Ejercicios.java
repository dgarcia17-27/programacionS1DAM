package primerPrograma;

public class Ejercicios {
	public static void main(String[] args) {
		int x;
		int y;
		int z;
		final float PI=3.141592F;
		final float E=2.718281F;
		x=1;
		y=4;
		z=10;
		
		
		System.out.println(!(2*x == y/2 || (PI - E)*z>y) == (!(y/2 == 2*x)&& !(y<(PI-E)*z)));
	}
}
