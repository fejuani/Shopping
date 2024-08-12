public class Vestuario extends Loja {
    private boolean produtosImportados = true;
    
    public Vestuario(String nome, int quantidadeFuncionario, double salarioFuncionario, Endereco endereco, Data data, int maxProdutos, boolean produtosImportados){
        super(nome, quantidadeFuncionario, salarioFuncionario, endereco, data, maxProdutos);
    this.produtosImportados = produtosImportados;
        if (produtosImportados) {
            System.out.println("produto importado");
        } else{
            System.out.println("produto nacional");
        }
    }
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    @Override
    public String toString() {
        return super.toString() +"\n"
        + "verificando se produto eh importado: " +produtosImportados;
    }
    public static void main(String[] args) {
        
    }
}
