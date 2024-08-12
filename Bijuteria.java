public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionario, double salarioFuncionario, Endereco endereco, Data data, int maxProdutos, double metaVendas){
        super(nome, quantidadeFuncionario, salarioFuncionario, endereco, data, maxProdutos);
        this.metaVendas = metaVendas;

    }
    public double getMetaVendas(){
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" 
        + "meta mensal de vendas: "+ metaVendas;
    }
    public static void main(String[] args) {
        
    }
}