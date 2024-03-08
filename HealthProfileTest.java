package HealthProfile;
import java.util.Scanner;
import HeartRates.HeartRates;

public class HealthProfileTest {



    public static void main(String[] args) {

        HealthProfile pessoa = new HealthProfile("fernanda","moura","feminino",20,8,1981,1.64,69);

        System.out.println("Nome: " + pessoa.getnome() + " " + pessoa.getsobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getdiaNascimento() + "/" + pessoa.getmesNascimento() + "/" + pessoa.getanoNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaCardiacaMaxima() + " batimentos por minuto");
        System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaCardiacaAlvo());
        System.out.println("\n O Índice de Massa Corporal (IMC) é: " + pessoa.exibirEscalaIMC());

    }
}

