
public class Loja {
    
    private String nome;
    private  int quantidadeFuncionario;
    private double salarioFuncionario = -1;
    private Data data;
    private Endereco endereco;
    public Produto[] estoqueProdutos;
    
    public Loja(String nome, int quantidadeFuncionario, double salarioFuncionario, Endereco endereco, Data data, int maxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionario = quantidadeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.data = data;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[maxProdutos];

    }
    
    public Loja(String nome, int quantidadeFuncionario) {
        this(nome, quantidadeFuncionario, -1, null, null, 0);
        
        
        
    } 
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Data getDataFundacao(){
        return data;
    }
    public void setDataFundacao(Data data){
        this.data = data;
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }
    
    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }
    
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }
    
    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
    
    public void salarioFuncionario() {
            if (salarioFuncionario < 0) {
                System.out.println(-1);
            }
     }
    
    public double gastosComSalario() {
        double gastoComSalario = salarioFuncionario * quantidadeFuncionario;
        return gastoComSalario;
    }
    
    public char tamanhoLoja() {
        if (quantidadeFuncionario < 10) {
            System.out.println("P");
        }
        if (quantidadeFuncionario >= 10 && quantidadeFuncionario < 30) {
            System.out.println("M");
        }
        if (quantidadeFuncionario >= 30) {
            System.out.println("G");
        }
        return 0;
        
    }
    public void imprimeProdutos(){
        for(Produto produto : estoqueProdutos ){
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }
    public boolean insereProdutos(Produto produto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }
    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i < estoqueProdutos.length ;i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
         return "nome da loja: " + nome + "\n" 
         +"endereco: "+ endereco + "\n" 
         + "Data: "+ data +"\n"
         + "quantidade de funcionarios: " + quantidadeFuncionario + "\n" 
         + "salario base dos funcionarios: R$ " + salarioFuncionario+"\n"
         + "quantidade de produtos" + estoqueProdutos;
    }
    public static void main(String[] args){
		
	}
    
}
