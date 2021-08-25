package exercicio3;

public class MainTelevisao {
	
	private static TelevisaoService servicoTelevisao = new TelevisaoService();

	public static void main(String[] args) throws Exception {
		Televisao televisaoObj = new Televisao();
		televisaoObj.marcaTv = "samsung";
		televisaoObj.polegadasTv = 42;
		televisaoObj.salvaTelevisao(televisaoObj);
		

			System.out.println(servicoTelevisao.buscaTelevisao("cce"));


	}

}
