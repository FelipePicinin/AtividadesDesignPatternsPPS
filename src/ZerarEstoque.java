
public class ZerarEstoque implements IPedido {
	
private Produto prod;
private int quantidade;

ZerarEstoque(Produto prod, int quantidade){
	this.prod = prod;
	this.quantidade = quantidade;
}
	


@Override
public void execute() {
	
prod.quantidade = 0;
//System.out.println("Estoque zerado");
	// TODO Auto-generated method stub
	
}


}



