package br.ufpb.sisbula;

public class CausaDeDoenca {
	private String causaDoenca;
	
	public CausaDeDoenca(String causaDoenca){
		this.setCausaDoenca(causaDoenca);
	}
	public CausaDeDoenca(){
		
	}

	public String getCausaDoenca() {
		return causaDoenca;
	}
	

	public void setCausaDoenca(String causaDoenca) {
		this.causaDoenca = causaDoenca;
	}
	

}
