public class Alimentacao extends Loja{
    Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionario, double salarioFuncionario, Endereco endereco, Data data, int maxProdutos, Data dataAlvara){
        super(nome, quantidadeFuncionario, salarioFuncionario, endereco, data, maxProdutos);
        this.dataAlvara = dataAlvara;
    }
    public Data getDataAlvara(){
        return dataAlvara;

    }
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"
        + "data do Alvara do Super Mercado: " + dataAlvara;
    }
}
