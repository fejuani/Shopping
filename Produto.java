public class Produto {
    private String nome;
    private int preco;
    private Data dataValidade;


        public Produto(String nome, int preco, Data dataValidade){
            this.nome = nome;
            this.preco = preco;
            this.dataValidade = dataValidade;
        };

        public Data getDataValidade(){
            return dataValidade;
        }
        public void setDataValidade(Data  dataValidade){
            this.dataValidade = dataValidade;
        }

        public String getNome(){
            return nome ;
        };
        public void setNome(String nome){
            this.nome = nome;
        }
        public int getPreco(){
            return preco;
        }
        public void setPreco(int preco){
            this.preco = preco;
        }
        public boolean estaVencido(Data data){
            return this.dataValidade.isBefore(data);
        }

        @Override
        public String toString() {
            return "nome do produto: " + nome + "\n" + " valor do produto: R$ " + preco + "\n" + "Data: " + dataValidade;
        }
    public static void main(String[] args) {
        
    }
}
