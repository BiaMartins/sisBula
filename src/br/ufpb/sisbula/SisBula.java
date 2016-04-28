package br.ufpb.sisbula;

import java.util.List;

/**
 * Descreve as funcionalidades de um sistema de informações
 * sobre medicamentos
 * 
 * @author ayla
 *
 */
public interface SisBula {
	
	/**
	 * Cadastra um novo medicamento no sistema 
	 * @param m O novo medicamento a ser cadastrado.
	 * @throws MedicamentoJaExisteException Quando já existe
	 * um medicamento com o mesmo nome do medicamento a ser
	 * cadastrado.
	 */
	public void cadastraMedicamento(Medicamento m) throws MedicamentoJaExisteException;
	
	/**
	 * Cadastra uma doen�a.
	 * @param d Nome da doen�a a ser cadastrada.
	 * @throws DoencaJaExisteException Lan�a a exe��o caso a doenca j� exista.
	 */
	
	public void cadastraMedicamento(String nomeMedicamento) throws MedicamentoJaExisteException;
	/**
	 * Metodo que cadastra uma doenca recendo o objeto Doen�a.
	 * @param d � o nome do objeto passado como parametro.
	 * @throws DoencaJaExisteException Lan�a uma exe��o, caso a doenca que qerira cadastrar ja exista.
	 */
	public void cadastraDoenca1(Doenca d) throws DoencaJaExisteException;
	
	/**
	 * Metodo que cadastra um sintoma.
	 * @param nome do sintoma.
	 * @param descricao do sintoma.
	 * @throws SintomaJaExisteException Lan�a a exe��o caso o sintoma j� exista.
	 */
	
	public boolean cadastraDoenca(String nome);
	/**
	 * Metodo que cadastra sintoma passando o nome do sintoma e a descri��o.
	 * @param nome da sintoma
	 * @param descricao do sintoma
	 * @throws SintomaJaExisteException Lan�a exe��o caso o sintoma j� esteja cadastrado.
	 */
	public void cadastraSintoma(String nome, String descricao) throws SintomaJaExisteException;
	
	/**
	 * Retorna uma lista dos medicamentos indicados para certas
	 * doenças ou sintomas. 
	 * @param ind Um sintoma ou doença
	 * @return a lista dos medicamentos para o sintoma
	 * ou doença pesquisado
	 */
	
	public void cadastraSintoma(String nomeSintomas) throws SintomaJaExisteException;
	/**
	 * pesquisa medicamento para uma determinada indica��o de medicamento recebendo um indica��o.
	 * @param ind indica��o de medcamento pesquisado.
	 * @return uma lista de medicamentos com todos os medicamentos com essa indica��o.
	 */
	public List<Medicamento> pesquisaMedicamentosPara(IndicacaoMedicamento ind);
	/**
	 * pesquisa um medicamento pra uma doen�ca ou sintoma recebendo o nomeDS.
	 * @param nomeDS nome da doen�a ou sintoma.
	 * @return uma lista de medicamento com todos os medicamentos para essa doenca/sintoma.
	 */
	public List<Medicamento> pesquisaMedicamentosPara(String nomeDS);
	
	/**
	 * Metodo que pesquisa uma doen�a pelo o nome.
	 * @param nome da doen�a  que estar procurando.
	 * @return retorna a doen�a encontrada.
	 * @throws DoencaInexitenteException Lan�a uma exe��o caso essa doen�a n�o exista.
	 */
	public Doenca pesquisaDoencaPeloNome(String nome) throws DoencaInexitenteException;
	
	/**
	 * Metodo que pesquisa um medicamento pelo o nome do medicamento e pelo o fabricante.
	 * @param nome do medicamento que estar procurado.
	 * @param fabricante do medicamento procurado.
	 * @return uma lista de medicamento encontrado com o mesmo nome e o mesmo fabricante.
	 * @throws MedicamentoInexistenteException lan�a exe��o, caso o medicamento pesquisado n�o exista.
	 */
	public Medicamento pesquisaMedicamento(String nome, Fabricante fabricante) throws MedicamentoInexistenteException;
	
	/**
	 * Metodo que pesquisa medicamento por o nome do fabricante.
	 * @param fab O nome do fabricante.
	 * @return Uma lista de medicamento existente nesse fabricante.
	 */
	
	public Medicamento pesquisaMedicamento(String nome) throws MedicamentoInexistenteException;
	/**
	 * metodo que pesquisa medicamento de um certo fabricante, recebendo o nome do fabricante desejado.
	 * @param fab nome do fabricante que deseja pegar os medicamentos.
	 * @return uma lista de medicamentos de todos os medicamentos desse fabricante.
	 */
	public List<Medicamento> pesquisaMedicamentosDoFabricante(Fabricante fab);
	
	/**
	 * Metodo que cadastra um medicamento para uma certa doen�a 
	 * @param nomeMedicamento que quer cadastrar.
	 * @param nomeDoenca Nome da doen�a desejada que quer cadastrar o medicamento.
	 * @throws MedicamentoInexistenteException Lan�a a exe��o caso n�o exista o medicamento para essa doen�a.
	 */
	public void cadastraMedicamentoParaDoenca(String nomeMedicamento, String nomeDoenca) throws MedicamentoInexistenteException;
	/**
	 * metodo que cadastra medicamento parar um sintoma, recebendo o nome do medicamento e o nome do sintoma.
	 * @param nomeMedicamento o nome do medicamento que quer cadastrar.
	 * @param nomeSintoma o nome do sintoma que quer cadastrar.
	 * @throws MedicamentoInexistenteException lan�a exe��o caso o medicamento n�o exista.
	 */
	public void cadastraMedicamentoParaSintoma(String nomeMedicamento, String nomeSintoma) throws MedicamentoInexistenteException;
	
	/**
	 * M�todo que cadastra o sintoma de uma doen�a, recebendo o nome da doen�a e sintoma dela
	 * @param nomeDoenca Nome da doen�a que deseja cadastrar.
	 * @param sintoma Nome do sintoma da doenca que deseja cadastrar.
	 */
	public void cadastraSintomaDeDoenca(String nomeDoenca, String sintoma);
	
	public List<CausaDeDoenca> pesquisaPossiveisCausaDe(String doencas);
	
}
