package uece.ees.patterns.builder;

public class Funcionario extends PedidoBuilder {

	@Override
	void adicionarSanduiche() {
		pedido.adicionarDentroDaCaixa(pedido.getSanduiche().toString());
	}

	@Override
	void adicionarRefrigerante() {
		pedido.adicionarForaDaCaixa(pedido.getRefrigerante().toString());
	}

	@Override
	void adicionarBatata() {
		pedido.adicionarDentroDaCaixa(pedido.getBatata().toString());
	}

	@Override
	void adicionarBrinquedo() {
		pedido.adicionarDentroDaCaixa(pedido.getBrinquedo().toString());
	}

}
