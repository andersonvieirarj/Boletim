/* Dados a serem armazenados do aluno: nome, disciplina,
4 notas e a média. */

public class Boletim {
    private String nome;
    private String disciplina;
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private double media;
    // Métodos acessores para utilização dos atributos
    // encapsulados:
    // SET - método que permite ALTERAR os valores dos atributos
    // GET - metodo que permite ACESSAR, VISUALIZAR os valores
       // dos atributos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getN3() {
        return n3;
    }
    public void setN3(double n3) {
        this.n3 = n3;
    }
    public double getN4() {
        return n4;
    }
    public void setN4(double n4) {
        this.n4 = n4;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }

    // método para calcular a média do aluno
    // esse método não tem retorno, pois é do tipo void
    public void calcularMedia(){
        media = (n1+n2+n3+n4)/4;
        System.out.println("Média do aluno:" + media);
    }
    //esse método TEM retorno, pois possui um tipo (double)
    public double calcularMedia2(){
        media = (n1+n2+n3+n4)/4;
        return media;
    }

    public void calcularMedia3 (double n1){
        double x = n1 * 2;
        System.out.println(x);
    }

}
