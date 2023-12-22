package principal;

public class Conta {
	private int numero;
private String titular;

public Conta(int numero, String titular) {
    this.numero = numero;
    this.titular = titular;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public void setTitular(String titular) {
	this.titular = titular;
}

public int getNumero() {
    return numero;
}

public String getTitular() {
    return titular;
}

}