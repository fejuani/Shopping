public class Informatica extends Loja {
    private double seguroEletronico;

    public Informatica(String nome, int quantidadeFuncionario, double salarioFuncionario, Endereco endereco, Data data, int maxProdutos, double seguroEletronico){
        super(nome, quantidadeFuncionario, salarioFuncionario, endereco, data, maxProdutos);
        this.seguroEletronico = seguroEletronico;
    }

    public double getSeguroEletronico(){
        return seguroEletronico;
    }
    public void setSeguroEletronico(double seguroEletronico){
        this.seguroEletronico = seguroEletronico;
    }
    @Override
    public String toString() {
        
        return super.toString() +"\n"+
        "Seguro do Eletronico: " + seguroEletronico;
    }
    public static void main(String[] args) {
        
    }
}
