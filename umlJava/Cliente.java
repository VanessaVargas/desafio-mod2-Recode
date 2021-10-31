package umlJava;

public class Cliente {

	//atributos
	private static int numero;
	private String nome;
	private String endereco;
	private int telefone;
	
	//construtor
	public Cliente (String n, String e, int t) {
		numero = numero +1;
		nome = n;
		endereco = e;
		telefone = t;
	}

	//m�todos setters - a vari�vel n�mero � est�tica, logo n�o ser� acessada
	public void setNome (String nome){
        this.nome = nome;
    }
	
	public void setEndereco (String endereco){
        this.endereco = endereco; 
    }
	
	public void setTelefone (int telefone){
        this.telefone = telefone;
    }
	
	//m�todos getters utilizados para retornar e exibir os dados
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}

	public void exibe() {
		System.out.println ("N�mero: "+getNumero());
		System.out.println ("Nome: "+getNome());
		System.out.println ("Endere�o: "+getEndereco());
		System.out.println ("Telefone: "+getTelefone());	
	}	
}