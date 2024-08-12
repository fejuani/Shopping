public class Cosmetico extends Loja{
    public double taxaComercializacao;
    public Cosmetico(String nome, int quantidadeFuncionario, double salarioFuncionario, Endereco endereco, Data data, int maxProdutos, double taxaComercializacao){
        super(nome, quantidadeFuncionario, salarioFuncionario, endereco, data, maxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" 
        + "taxa de comercializacao: " +taxaComercializacao;
    }
    public static void main(String[] args) {

    }
}