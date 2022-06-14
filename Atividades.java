/**
 * Atividades
 */
public abstract class Atividades {
    private String nome;

    public Atividades(String nome) {
        setNome(nome);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }    

}