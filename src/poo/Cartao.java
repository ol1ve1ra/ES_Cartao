package poo;

/**
 * 
 * @author renat
 *
 * Classe Cartão
 *
 */

public class Cartao {
	
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores
	/**
	 * vai buscar o nome do funcionário
	 * @param nomeFuncionario
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}

	/**
	 * 
	 * recolhe as informações do cartão 
	 * @param nomeFuncionario
	 * @param servico
	 * @param cargo
	 */
	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	
	/**
	 * recebe o nome do Funcionário
	 * @return nomeFuncionário
	 */
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	/**
	 * seleciona o serviço
	 * @param servico
	 */
	public void setServico(String servico) {
		this.servico = servico;
	}

	/**
	 * seleciona o cargo
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// Métodos
	/**
	 * retirar o serviço ao funcionário
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	
	/**
	 * atribui um novo serviço
	 * @param novoServico
	 */
	public void atribuirNovoServico( 
			String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	
	/**
	 * promove o funcionário a um novo cargo
	 * @param novoCargo
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	
	/**
	 * retirar as informações dos funcionários
	 */
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
