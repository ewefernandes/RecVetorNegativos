package view;
import controller.Modulos;

public class Principal {
	
	public static void main (String[] args) {
		Modulos m = new Modulos();
		int i=0, n = 0;
		int[] v = {-50,-100,-6,3,17,8,-1,0};
		int tamanho = (v.length)-1;
		int negativos = m.VetN(v, tamanho, i, n);
		System.out.println(negativos);
	}
	
}
