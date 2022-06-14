public class Comida extends Atividades{
    private double custoMedio;

    Comida(String nome, double custoMedio){
        super(nome);
        setCustoMedio(custoMedio);
    }

    public double getCustoMedio() {
        return custoMedio;
    }

    public void setCustoMedio(double custoMedio) {
        this.custoMedio = custoMedio;
    }
}
