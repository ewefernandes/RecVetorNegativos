package controller;

public class Modulos {
	
	public int VetN (int vet[], int tm, int i, int n) {
		if (i > tm) { //se o índice do vetor for maior do que seu tamanho, retornar o resultado.
			return n;
		} else {
			if (vet[i] < 0) {
				n = n + 1;
			}
			return VetN(vet, tm, i+1, n); //após avaliar de o número é negativo, chamar a função novamente e somar +1 no índice do vetor.
		}
	}
	
}
