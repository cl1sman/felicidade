public class Religiao extends Atividades{
    private int frequenciaSemanal;

    Religiao(String nome, int frequenciaSemanal){
        super(nome);
        setfrequenciaSemanal(frequenciaSemanal);
    }

    public int getfrequenciaSemanal() {
        return frequenciaSemanal;
    }

    public void setfrequenciaSemanal(int frequenciaSemanal) {
        this.frequenciaSemanal = frequenciaSemanal;
    }
    
}
