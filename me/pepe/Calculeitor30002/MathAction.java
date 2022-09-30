package me.pepe.Calculeitor30002;

public enum MathAction {
	SUMAR, RESTAR, MULTIPLICAR, DIVIDIR, RESTO;
	
	public double execute(double n1, double n2) {
		switch (this) {
		case SUMAR:
			return n1 + n2;
		case RESTAR:
			return n1 - n2;
		case MULTIPLICAR:
			return n1 * n2;
		case DIVIDIR:
			return n1 / n2;
		case RESTO:
			return n1 % n2;
		}
		return 0;
	}
}
