package exercicio3;

public class TelevisaoService {
	
	private ValidadoresTelevisao validadorTelevisao = new ValidadoresTelevisao();
	private BancoDadosTelevisao bancoDadosTelevisao = new BancoDadosTelevisao();
	
	public void salvarTelevisao(Televisao televisao) throws Exception{
		boolean estandoTvOk =  validadorTelevisao.validaTelevisao(televisao);
		if(estandoTvOk) {
			// salvar a pessoa o banco
			bancoDadosTelevisao.salvaTelevisao(televisao);			
		}else {
			System.out.println("erro ao salvar a pessoa");
			throw new Exception("não foi possível salvar a pessoa");
		}
		
	}
	
	public Televisao buscaTelevisao(String nome) throws Exception {
		Televisao resposta = null;
		try {
		for (Televisao televisao : bancoDadosTelevisao.listaTelevisao) {
			if (televisao.marcaTv.equals(nome)) {
				resposta = televisao;
			}
		}
		}
		catch (NullPointerException e) {
			resposta.marcaTv = "Televisão não encontrada";
			resposta.polegadasTv = 1;
		}
		return resposta;
	}
	
	

}
