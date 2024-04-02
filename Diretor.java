import java.util.Calendar;
import java.util.UUID;

public class Diretor extends Empregado {
 public Diretor(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
  super(nome, data_nascimento, CPF, endereco);
 }
 protected String gerarMatricula(){
  matricula = "E-" + UUID.randomUUID().toString();
  return matricula;
 }
}