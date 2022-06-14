public class Esporte extends Atividades{
    private String individualOuEquipe;
    private double custoDaHora;
    
    Esporte(String nome, String individualOuEquipe, double custoDaHora){
        super(nome);
        setIndividualOuEquipe(individualOuEquipe);
        setCustoDaHora(custoDaHora);
    }

    public String getIndividualOuEquipe() {
        return individualOuEquipe;
    }
    public void setIndividualOuEquipe(String individualOuEquipe) {
        this.individualOuEquipe = individualOuEquipe;
    }
    public double getCustoDaHora() {
        return custoDaHora;
    }
    public void setCustoDaHora(double custoDaHora) {
        this.custoDaHora = custoDaHora;
    }

    
}
