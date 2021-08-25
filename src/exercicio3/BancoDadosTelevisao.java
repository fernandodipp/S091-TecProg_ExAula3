package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class BancoDadosTelevisao {

	public List<Televisao> listaTelevisao = new ArrayList<>();
	ValidadoresTelevisao validador = new ValidadoresTelevisao();

	public void salvaTelevisao(Televisao televisao) {
		
		listaTelevisao.add(televisao);
		
		}
	}


