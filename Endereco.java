public class Endereco {
 private String nome_rua;
 private int numero;
 private String pais;
 private String UF;
 private String cidade;
 private int CEP;
 private String complemento;

 public Endereco(){
  this.definirRua(nome_rua);
  this.definirNumero(numero);
  this.definirPais(pais);
  this.definirUF(UF);
  this.definirCidade(cidade);
  this.definirCEP(CEP);
  this.definirComplemento(complemento);
 }
 public String getNomeRua(){
  return this.nome_rua;
 }
 public int getNumero(){
  return this.numero;
 }
 protected void definirRua (String nome_rua){
  this.nome_rua = nome_rua;
 }
 protected void definirNumero (int numero){
  this.numero = numero;
 }
 protected void definirPais(String pais){
  this.pais = pais;
 }
 protected void definirUF (String UF){
  this.UF = UF;
 }
 protected void definirCidade (String cidade){
  this.cidade = cidade;
 }
 protected void definirCEP (int CEP){
  this.CEP = CEP;
 }
  protected void definirComplemento(String complemento){
    this.complemento = complemento;
  }
}
