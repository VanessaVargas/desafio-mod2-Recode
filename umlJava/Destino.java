package umlJava;

public class Destino {
		//variáveis
		private String cidade;
		private String estado;
		private int qtdDias;
	
		//construtor
		public Destino (String c, String es, int q) {
			cidade = c;
			estado = es;
			qtdDias = q;
		}
	
		//métodos setters - define valores
		public void setCidade (String cidade){
	        this.cidade = cidade;   
	    }
		
		public void setEstado (String estado){
	        this.estado = estado;
	    }
		
		public void setQtdDias (int qtdDias){
	        this.qtdDias = qtdDias;
	    }
		
		//métodos getters utilizados para retornar e exibir os dados
		public String getCidade() {
			return cidade;
		}
		
		public String getEstado() {
			return estado;
		}
		
		public int getQtdDias() {
			return qtdDias;
		}
		
		public void exibe() {
			System.out.println ("Cidade: "+getCidade());
			System.out.println ("Estado: "+getEstado());
			System.out.println ("Quantidade de Dias da Viagem: "+getQtdDias());
		}
}