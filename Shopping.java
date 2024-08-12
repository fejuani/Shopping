public class Shopping {
    public String nome;
    public Endereco endereco;
    public Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Loja[] getLojas(){
        return lojas;
    }
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }
    public boolean insereLoja(Loja loja){
        for(int i = 0; i < lojas.length; i++){
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }
    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length ;i++){
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    public int quantidadeLojasPorTipo(String tipoLoja){
        int count = 0;
        for(Loja loja : lojas){
            if(loja != null){
                switch(tipoLoja.toLowerCase()){
                    case "cosmético":
                        if(loja instanceof Cosmetico) count++;
                        break;
                
                    case "vestuário":
                        if(loja instanceof Vestuario) count++;
                        break;
               
                    case "bijutería":
                        if(loja instanceof Bijuteria) count++;
                        break;
                
                    case "alimentação":
                        if(loja instanceof Alimentacao) count++;
                        break;
               
                    case "informática":
                        if(loja instanceof Informatica) count++;
                        break;
                    default:
                        return -1;
                }
            }
            
        }
        return count;
    }
    public Informatica lojaSeguroMaisCaro(){
        Informatica maisCaro = null;
        for(Loja loja : lojas){
            if (loja instanceof Informatica) {
                Informatica infLoja = (Informatica) loja;
                if (maisCaro == null || infLoja.getSeguroEletronico() > maisCaro.getSeguroEletronico()) {
                    maisCaro = infLoja;
                }
                
            }
        }
        return maisCaro;
    }
    @Override
    public String toString() {
        String result = "Nome: " + nome + "\n" +
                        "Endereço: " + endereco + "\n" +
                        "Lojas: \n";
        for (Loja loja : lojas) {
            if (loja != null) {
                result += loja + "\n";
            }
        }
        return result;
    }
}
