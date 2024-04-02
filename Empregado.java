import java.util.Calendar;

public class Empregado extends Pessoa{
 protected String matricula;
 private Calendar data_admissao, data_demissao;

 public Empregado(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
  super(nome, data_nascimento, CPF, endereco);
  this.matricula = gerarMatricula();
  data_admissao = Calendar.getInstance();
 }
 public void demitirEmprregado(){
  data_demissao = Calendar.getInstance();
 }
 protected String gerarMatricula(){
  return this.matricula = "Matrícula não definida.";
 }
 protected String recuperarMatricula(){
  return this.matricula;
 }
 public String tempo_trabalhado(){
  return ("Data admissão: " + this.data_admissao + "Data Rescisão: " + this.data_demissao);
 }
}
