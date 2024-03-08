package HealthProfile;

import java.time.LocalDate;
import java.time.Period;
public class HealthProfile {
    private String nome;
    private String sobrenome;
    private String sexo;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double altura;
    private double peso;

    public HealthProfile(String nome, String sobrenome, String sexo, int diaNascimento, int mesNascimento, int anoNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getsobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getsexo() {
        return sexo;
    }

    public void setsexo(String sexo) {
        this.sexo = sexo;
    }

    public int getdiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }


    public int getmesNascimento() {
        return mesNascimento;
    }


    public void setmesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getanoNascimento() {
        return anoNascimento;
    }

    public void setanoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double getpeso() {
        return peso;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        return Period.between(dataNascimento, hoje).getYears();
    }

    public int calcularFrequenciaCardiacaMaxima() {
        int idade = calcularIdade();
        return 220 - idade;
    }

    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int frequenciaAlvoMinima = (int) (frequenciaMaxima * 0.5); // 50% da frequência máxima
        int frequenciaAlvoMaxima = (int) (frequenciaMaxima * 0.85); // 85% da frequência máxima
        return frequenciaAlvoMinima + " - " + frequenciaAlvoMaxima + " batimentos por minuto";
    }


   public double calcularIMC () {
        return peso / (altura * altura);
    }
    public String exibirEscalaIMC() {
        double imc = calcularIMC();
        String resultado;

        if (imc < 18.5) {
            resultado = "Abaixo do Peso: menos de 18.5";
        } else if (imc >= 18.5 && imc <= 24.9) {
            resultado = "Peso Normal: entre 18.5 e 24.9";
        } else if (imc >= 25 && imc <= 29.9) {
            resultado = "Sobre Peso: entre 25 e 29.9";
        } else {
            resultado = "Obeso: 30 ou mais";
        }

        return resultado;
    }
}



