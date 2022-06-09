public class YouTuber extends Pessoa{
    private double quantidadeDeHorasEmFrenteAoPC;
    private int totalAtividades;

    YouTuber(int cpf, double quantidadeDeHorasEmFrenteAoPC){
        setCpf(cpf);
        if (quantidadeDeHorasEmFrenteAoPC <= 70){
            setQuantidadeDeHorasEmFrenteAoPC(quantidadeDeHorasEmFrenteAoPC);
        }else{
            System.out.println("Quantidade de horas em frente ao PC excede 70");
        }
        vetorAtividades = new Atividades[5];
    }

    @Override
    public void calculaValor() {
        for(int i = 0; i < vetorAtividades.length; i++){
            if(vetorAtividades[i] instanceof Esporte){
                Esporte e = (Esporte) vetorAtividades[i];
                if(e.getCustoDaHora() < 50){
                    setTotalAtividades(getTotalAtividades() + 10);
                }else if(e.getIndividualOuEquipe() == "individual"){
                    setTotalAtividades(getTotalAtividades() + 10);
                }else{
                    setTotalAtividades(getTotalAtividades() + 20);
                }
            } else if(vetorAtividades[i] instanceof Comida){
                Comida c = (Comida) vetorAtividades[i];
                if(c.getNome() == "sushi"){
                    setTotalAtividades(getTotalAtividades() + 80);
                }else if(c.getCustoMedio() < 39.90){
                    setTotalAtividades(getTotalAtividades() + 25);
                }else{
                    setTotalAtividades(getTotalAtividades() + 10);
                }
            } else if(vetorAtividades[i] instanceof Religiao){
                Religiao r = (Religiao) vetorAtividades[i];
                if(r.getfrequenciaSemanal() < 2){
                    setTotalAtividades(getTotalAtividades() + 15);
                }else{
                    setTotalAtividades(getTotalAtividades() + 5);
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

    public double getQuantidadeDeHorasEmFrenteAoPC() {
        return quantidadeDeHorasEmFrenteAoPC;
    }

    public void setQuantidadeDeHorasEmFrenteAoPC(double quantidadeDeHorasEmFrenteAoPC) {
        this.quantidadeDeHorasEmFrenteAoPC = quantidadeDeHorasEmFrenteAoPC;
    }

    public int getTotalAtividades() {
        return totalAtividades;
    }

    public void setTotalAtividades(int totalAtividades) {
        this.totalAtividades = totalAtividades;
    }
    

    
}
