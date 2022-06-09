public class Main {
    public static void main(String[] args) {
        Esporte esporte = new Esporte();
        esporte.setNome("Tenis");
        esporte.setIndividualOuEquipe("individual");
        esporte.setCustoDaHora(10.0);

        Comida comida = new Comida();
        comida.setNome("Tomate");
        comida.setCustoMedio(240);

        Religiao religiao = new Religiao();
        religiao.setNome("Catolicismo");
        religiao.setfrequenciaSemanal(2);

        YouTuber youTuber = new YouTuber(123456789, 10.0);
        youTuber.setNoVetorDeAtividades(esporte);
        youTuber.setNoVetorDeAtividades(comida);
        youTuber.setNoVetorDeAtividades(religiao);
        youTuber.calculaValor();

        Politico politico = new Politico(123, 3000);
        politico.setNoVetorDeAtividades(esporte);
        politico.setNoVetorDeAtividades(comida);
        politico.calculaValor();
    }
}
