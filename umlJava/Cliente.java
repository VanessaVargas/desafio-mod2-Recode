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

	//métodos setters - a variável número é estática, logo não será acessada
	public void setNome (String nome){
        this.nome = nome;
    }
	
	public void setEndereco (String endereco){
        this.endereco = endereco; 
    }
	
	public void setTelefone (int telefone){
        this.telefone = telefone;
    }
	
	//métodos getters utilizados para retornar e exibir os dados
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
		System.out.println ("Número: "+getNumero());
		System.out.println ("Nome: "+getNome());
		System.out.println ("Endereço: "+getEndereco());
		System.out.println ("Telefone: "+getTelefone());	
	}	
}