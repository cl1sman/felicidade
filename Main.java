public class Main {
    public static void main(String[] args) {
        
        Leitor leitor = new Leitor();

        int opcao;
        do {
            System.out.println("Escolha uma opção");
            System.out.println("(1) Cadastrar pessoa");
            System.out.println("(2) Sair");
            opcao = leitor.leInteiro();

            if(opcao == 1) {
                System.out.println("1 - Politico ou 2 - YouTuber");
                opcao = leitor.leInteiro();
                if(opcao == 1) {
                    System.out.println("Digite o CPF");
                    int cpf = leitor.leInteiro();
                    System.out.println("Digite o salário");
                    double salario = leitor.leDouble();
                    Pessoa p = new Politico(cpf, salario);
                } else if(opcao == 2) {
                    System.out.println("Digite o CPF");
                    int cpf = leitor.leInteiro();
                    System.out.println("Digite o salário");
                    double quantidadeDeHoras = leitor.leDouble();
                    Pessoa y = new YouTuber(cpf, quantidadeDeHoras);
                }
            }
            else if(opcao == 2) {
                System.out.println("Bye...");
            }
        } while (opcao != 2);

        Atividades esporte = new Esporte();
        
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
