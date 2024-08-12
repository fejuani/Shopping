public class Data {
    private int dia;
    private int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        if (isValidDate(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Ajustando para a data padrão: 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (isValidDate(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido. Não alterado.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (isValidDate(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. Não alterado.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (isValidDate(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. Não alterado.");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public boolean verificaAnoBissexto() {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }

    private boolean isValidDate(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = { 31, (verificaAnoBissexto() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (dia < 1 || dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }

      public boolean isBefore(Data outraData) {
        if (this.ano < outraData.ano) {
            return true;
        } else if (this.ano == outraData.ano) {
            if (this.mes < outraData.mes) {
                return true;
            } else if (this.mes == outraData.mes) {
                if (this.dia < outraData.dia) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isAfter(Data outraData) {
        if (this.ano > outraData.ano) {
            return true;
        } else if (this.ano == outraData.ano) {
            if (this.mes > outraData.mes) {
                return true;
            } else if (this.mes == outraData.mes) {
                if (this.dia > outraData.dia) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
