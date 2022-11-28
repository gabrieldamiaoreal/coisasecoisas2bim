
public class main {

	public static void main(String[] args) {
		
		// Instancia do Produto novo
		Produto prod1 = new Produto();
		
		
		prod1.nome = "HVAC - Oléo para Compressor";
		prod1.valorTotal = 1;
		
		ComponenteConcreto asb = new ComponenteConcreto(prod1);
		
		CompressorDecorator prod = new CompressorDecorator(asb, "Compressor");
		sisArrefecimentoDecorator prod2 = new sisArrefecimentoDecorator(prod, "Sistema Arrefecimento");
		
		System.out.println("Produto: " + prod2.escrita() + "Valor Total: R$" + prod2.calculaValorTotal() + "\n");
		
	
		
	}
	
}
