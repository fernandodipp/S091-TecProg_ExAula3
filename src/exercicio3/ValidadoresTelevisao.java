package exercicio3;

public class ValidadoresTelevisao {

	public boolean validaTelevisao(Televisao televisao) {
		if (televisao == null) {
			return false;
		}
		if (televisao.marcaTv.equals("") || (televisao.polegadasTv <= 0 || televisao.polegadasTv > 100)) {
			return false;
		}else {
			return true;
		}
	}

}
