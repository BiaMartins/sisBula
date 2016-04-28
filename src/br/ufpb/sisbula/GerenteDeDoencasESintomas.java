package br.ufpb.sisbula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Gerencia opera��es referentes a doen�as e sintomas.
 * @author Bia
 */
public class GerenteDeDoencasESintomas {
	private Map<String, Sintoma> sintomas;
	private Map<String, Doenca> doencas;
	private Map<String, CausaDeDoenca> causas;
	/**
	 * Construtor da classe.
	 */
	public GerenteDeDoencasESintomas(){
		this.sintomas = new HashMap<String,Sintoma>();
		this.doencas  = new HashMap<String, Doenca>();
		this.causas = new HashMap<String, CausaDeDoenca>();
	}
	/**
	 * Cadastra uma doen�a com este nome.
	 * @param nomeDoenca O nome da doen�a a ser cadastrada.
	 * @return Retorna True se conseguir cadastrar e false caso ja exista uma doen�a come esse nome.
	 */
	public boolean cadastraDoenca(String nomeDoenca) {
		if(this.doencas.containsKey(nomeDoenca)){
			return false;
		}else{
			Doenca d = new Doenca(nomeDoenca);
			this.doencas.put(nomeDoenca, d);
			return true;
		}
	}
	/**
	 * Cadastra um sintoma
	 * @param nomeSintoma O nome do sintoma
	 * @return True se o sintoma for cadastrado e false 
	 * se n�o for cadastrado por j� existir.
	 */
	public boolean cadastraSintoma(String nomeSintoma){
		Sintoma s = this.sintomas.get(nomeSintoma);
		if(s== null){
			s = new Sintoma(nomeSintoma);
			this.sintomas.put(nomeSintoma, s);
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Cadastra um sintoma com o nome do sintoma e a descri��o dele.
	 * @param nome da sintoma
	 * @param descricao do sintoma
	 * @throws SintomaJaExisteException, Lan�a a exe��o caso o sintoma j� esteja cadastrado.
	 */
	public void cadastraSintoma(String nome, String descricao)throws SintomaJaExisteException{
		Sintoma s = this.sintomas.get(nome);
		if(s== null){
			s= new Sintoma(nome);
			this.sintomas.put(nome, s).getDescricao();
			
		}else{
			throw new SintomaJaExisteException("Sintoma j� cadastrado.");
		}
	}
	/**
	 * Pesquisa se existe uma doenca ou sintoma com este nome.
	 * @param nomeDS O nome da doen�a ou sintoma.
	 * @return A doen�a ou sintoma com esse nome, 
	 * ou null se n�o encontrar nem doen�a nem sintoma com esse nome.
	 */
	public IndicacaoMedicamento pesquisaDoencaOuSintoma(String nomeDS){
		IndicacaoMedicamento ind = this.doencas.get(nomeDS);
		if(ind== null){
			ind = this.sintomas.get(nomeDS);
			return ind;
		}else{
			return ind;
		}
	}
	/**
	 * M�todo que pesquisa uma doenca pelo o nome
	 * @param nome Nome da doen�a a ser pesquisado
	 * @return A doenca encontrada.
	 */
	public Doenca pesquisaDoencaPeloNome(String nome) {
		if(doencas.containsKey(nome)){
			return doencas.get(nome);
		}else{
			return null;
		}
	}
	/**
	 * Metodo que cadastra uma doen�a passando uma doenca		
	 * @param doenca O nome da doen�a do tipo Doenca que deseja cadastrar
	 * @return True caso a doenca seja cadastrada ou false caso a doenca ja exista.
	 */
	public boolean cadastraDoenca1(Doenca doenca){
		if(doencas.containsValue(doenca)){
			return false;
		}else{
			doencas.put(doenca.getNome(), doenca);
			return true;
		}
	}
	/**
	 * M�todo que cadastra o sintoma de uma doen�a, recebendo o nome da doen�a e sintoma dela.
	 * @param nomeDoenca Nome da doen�a que deseja cadastrar.
	 * @param sintoma Nome do sintoma da doenca que deseja cadastrar.
	 */
	public void cadastraSintomaDeDoenca(String nomeDoenca, String sintoma) {
		Sintoma sint = this.sintomas.get(sintoma);
		this.doencas.get(nomeDoenca).adicionaSintoma(sint);
		
	}
	public List<Doenca> pesquisaDoencaCausadaPor(String sintoma) {
		List<Doenca> doencasCausadasPor = new ArrayList<Doenca>();
		for (String s : this.doencas.keySet()){
			Doenca d = this.doencas.get(s);
			for(Sintoma si : d.sintomas){
				if(si.getDescricao().equalsIgnoreCase(sintoma)){
					doencasCausadasPor.add(d);
				}
			}
		}
		
		return doencasCausadasPor;
		
	}
	
	public List<CausaDeDoenca> pesquisaPossiveisCausaDe(String doencas){
		return null;
	}
}
