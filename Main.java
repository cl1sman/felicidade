public class Main {
    public static void main(String[] args) {
        
        Leitor leitor = new Leitor();
        Atividades[] atividades = new Atividades[100];
        Pessoa[] pessoas = new Pessoa[100];
        int i = 0;
        int j = 0;

        int opcao;
        do {
            System.out.println("Escolha uma opção");
            System.out.println("(1) Cadastrar pessoa");
            System.out.println("(2) Cadastrar atividades");
            System.out.println("(3) Listar pessoas");
            System.out.println("(4) Listar atividades");
            System.out.println("(5) Atribuir atividade a pessoa");
            System.out.println("(6) Valor total de felicidade");
            System.out.println("(7) Sair");
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
                    pessoas[i++] = p;
                } else if(opcao == 2) {
                    System.out.println("Digite o CPF");
                    int cpf = leitor.leInteiro();
                    System.out.println("Quantidade de horas em frente ao computador: ");
                    double quantidadeDeHoras = leitor.leDouble();
                    Pessoa y = new YouTuber(cpf, quantidadeDeHoras);
                    pessoas[i++] = y;
                }
            }
            else if(opcao == 2) {
                System.out.println("1 - Esporte ou 2 - Comida ou 3 - Religião");
                opcao = leitor.leInteiro();
                if(opcao == 1) {
                    System.out.println("Nome do esporte: ");
                    String nome = leitor.leString();
                    System.out.println("individual ou equipe: ");
                    String individualOuEquipe = leitor.leString();
                    System.out.println("Custo da hora: ");
                    double custoDaHora = leitor.leDouble();
                    Esporte e = new Esporte(nome, individualOuEquipe, custoDaHora);
                    atividades[j++] = e;
                } else if(opcao == 2){
                    System.out.println("Nome da comida: ");
                    String nome = leitor.leString();
                    System.out.println("Custo médio: ");
                    double custoMedio = leitor.leDouble();
                    Comida c = new Comida(nome, custoMedio);
                    atividades[j++] = c;
                } else{
                    System.out.println("Nome da religiao: ");
                    String nome = leitor.leString();
                    System.out.println("Frequencia: ");
                    int frequenciaSemanal = leitor.leInteiro();
                    Religiao r = new Religiao(nome, frequenciaSemanal);
                    atividades[j++] = r;
                }
            }
            else if(opcao == 3){
                for(int index = 0; index < pessoas.length; index ++){
                    if(pessoas[index] != null){
                        System.out.println("Indice de pessoa: " + index + " CPF: " + pessoas[index].getCpf());
                    }else{
                        break;
                    }
                }
            }else if(opcao == 4){
                for(int index = 0; index < atividades.length; index ++){
                    if(atividades[index] != null){
                        System.out.println("Indice da avividade: " + index + " Nome da atividade: " + atividades[index].getNome());
                    }else{
                        break;
                    }
                }
            }else if(opcao == 5){
                System.out.println("Informe o indice da pessoa: ");
                int indiceDaPessoa = leitor.leInteiro();
                System.out.println("Informe o indice da atividade: ");
                int indiceDaAtividade = leitor.leInteiro();
                pessoas[indiceDaPessoa].setNoVetorDeAtividades(atividades[indiceDaAtividade]);
            }else if(opcao == 6){
                System.out.println("Informe o indice da pessoa: ");
                int indiceDaPessoa = leitor.leInteiro();
                System.out.println("" + pessoas[indiceDaPessoa].calculaValor());
            }
        } while (opcao != 7);
    }
}
