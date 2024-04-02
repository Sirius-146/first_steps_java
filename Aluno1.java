import java.util.Random;

public class Aluno1 {
 //Atributos:
 private String nome;
 private int idade;
 private double codigo_id;
 private Random aleatorio;
 //Construtor:
 public Aluno1(String nome, int idade) {
  aleatorio = new Random();
  this.nome = nome;
  this.idade = idade;
  this.codigo_id =aleatorio.nextDouble();
 }
 //Métodos:
 public void definirNome(String nome) {
  this.nome = nome;
 }
 public void definirIdade(int idade) {
  this.idade = idade;
 }
 public String recuperarNome() {
  return this.nome;
 }
 public int recuperarIdade() {
  return this.idade;
 }
 public double recuperarcódigo() {
  return codigo_id;
 }
 public static void main(String args[]){
  Aluno1 novo = new Aluno1("Ruan Faria", 22);
  System.out.println("saida: "+novo.recuperarNome()+novo.recuperarIdade()+novo.recuperarcódigo());
 }
}