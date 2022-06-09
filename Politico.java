public class Politico extends Pessoa{
    private double salario;
    private int totalAtividades;

    Politico(int cpf, double salario){
        setCpf(cpf);
        if(salario < 30000){
            setSalario(salario);
        }else{
            System.out.println("Salario excede o teto de R$ 30.000,00");
        }
        vetorAtividades = new Atividades[10];
    }

    @Override
    public void calculaValor() {
        for(int i = 0; i < vetorAtividades.length; i++){
            if(vetorAtividades[i] instanceof Esporte){
                Esporte e = (Esporte) vetorAtividades[i];
                
                if(e.getIndividualOuEquipe() == "individual"){
                    setTotalAtividades(getTotalAtividades() + 20);
                }else{
                    setTotalAtividades(getTotalAtividades() + 5);
                }
            } else if(vetorAtividades[i] instanceof Comida){
                Comida c = (Comida) vetorAtividades[i];
                if(c.getCustoMedio() >= 150){
                    setTotalAtividades(getTotalAtividades() + 40);
                }else{
                    setTotalAtividades(getTotalAtividades() + 5);
                }
            } else if(vetorAtividades[i] instanceof Religiao){
                Religiao r = (Religiao) vetorAtividades[i];
                if(r.getfrequenciaSemanal() == 1 || r.getfrequenciaSemanal() == 2){
                    setTotalAtividades(getTotalAtividades() + 10);
                }else if(r.getfrequenciaSemanal() == 3 || r.getfrequenciaSemanal() == 4){
                    setTotalAtividades(getTotalAtividades() + 20);
                }else if(r.getfrequenciaSemanal() == 5 || r.getfrequenciaSemanal() == 6){
                    setTotalAtividades(getTotalAtividades() + 30);
                }
            }
        }
    }

    public void setNoVetorDeAtividades(Atividades atividade){
        for(int i = 0; i < vetorAtividades.length; i++){
            if(vetorAtividades[i] == null){
                vetorAtividades[i] = atividade;
                break;
            }
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTotalAtividades() {
        return totalAtividades;
    }

    public void setTotalAtividades(int totalAtividades) {
        this.totalAtividades = totalAtividades;
    }

    

    
}
