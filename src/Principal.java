import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Boletim Edu = new Boletim();
        Scanner input = new Scanner (System.in);

        /*Edu.nome = "Anderson Vieira";
        Edu.disciplina = "Matemática";
        Edu.n1 = 9.5;
        Edu.n2 = 5.5;
        Edu.n3 = 1.5;
        Edu.n4 = 6.0; */

        // Entrada de dados via SET
        Edu.setNome("Anderson Vieira");


        Edu.setDisciplina("Matemática");
        Edu.setN1(9.5);
        Edu.setN2(5.5);
        Edu.setN3(1.5);
        Edu.setN4(6.0);
        // Entrada de dados via SET, pelo Scanner, ou seja, usuário
        System.out.println("Digite o nome do aluno: ");
        Edu.setNome(input.nextLine());
        // Saída de dados vai GET, usando o SOUT
        System.out.println(Edu.getMedia());
        Edu.calcularMedia();
        System.out.println("A média do aluno é: " + Edu.calcularMedia2());

        Edu.calcularMedia3(5.5);
        double n1 = 6.5;
        Edu.calcularMedia3(n1);

    }
}
