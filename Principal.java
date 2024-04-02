import java.util.Calendar;

/*
public class Principal {
 private static Aluno aluno;
 private static Endereco endereco;
 
 public static void main(String args[]){
  int idade;
  Calendar data = Calendar.getInstance();
  data.set(2007,07,07);
  endereco = new Endereco();
  endereco.definirPais("Brasil");
  endereco.definirUF("CE");
  endereco.definirCidade("Fortaleza");
  endereco.definirRua("rua Canuto de Aguiar");
  endereco.definirNumero(176);
  endereco.definirCEP(20252060);
  endereco.definirComplemento("apto 307");
  aluno = new Aluno("Maria", data,123456877-00, endereco);
  aluno.atualizarIdade();
  idade = aluno.getIdade();
 }
}
*/

public class Principal {
 //Atributos
 private static Empregado empregado, diretor;
 //Método main
 public static void main(String args[]) {
     Calendar data = Calendar.getInstance();
     data.set(1980, 10, 23);
     empregado = new Empregado("Clara Silva", data , 211456937 , null);
     empregado.gerarMatricula();
     diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
     diretor.gerarMatricula();
     System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
     System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());
 }
}