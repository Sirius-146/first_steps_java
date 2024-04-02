abstract class Animal {
 public abstract void emitirSom();

 public void dormir(){
  System.out.println("Zzzz...");
 }
}

class Cachorro extends Animal {
 public void emitirSom(){
  System.out.println("Latir!");
 }
}

class Gato extends Animal {
 public void emitirSom(){
  System.out.println("Miar!");
 }
}

class Leao extends Animal {
 public void tipoDeAnimal(){
  System.out.println("É um animal selvagem");
 }
 public void emitirSom(){
  System.out.println("Rugir!");
 }
}

public class Main {
 public static void main(String[] args) {
  Animal cachorro = new Cachorro();
  Animal gato = new Gato();
  Leao leao = new Leao();

  cachorro.emitirSom();
  cachorro.dormir();

  gato.emitirSom();
  gato.dormir();

  leao.emitirSom();
  leao.dormir();
  leao.tipoDeAnimal();
 }
}