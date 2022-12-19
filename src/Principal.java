import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Boletim Edu = new Boletim();
        Scanner input = new Scanner (System.in);

        Edu.nome = "Anderson Vieira";
        Edu.disciplina = "Matemática";
        Edu.n1 = 9.5;
        Edu.n2 = 5.5;
        Edu.n3 = 1.5;
        Edu.n4 = 6.0;

        Edu.calcularMedia();
        System.out.println("A média do aluno é: " + Edu.calcularMedia2());


    }
}
