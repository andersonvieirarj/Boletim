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

}
