import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

     int codigo;
     int  quantidade;
     double valor;

       Produto [] prodVet = new Produto [5];

      for (int ent = 0; ent <5; ent++){
    System.out.println("Digite o código, a quantidade e o valor do produto: " + (ent+1));

    codigo = teclado.nextInt();
    quantidade = teclado.nextInt();
    valor = teclado.nextDouble();
    
    
  Produto produto = new Produto (codigo, quantidade, valor);
  prodVet[ent] = produto;
      }

      teclado.close();

    for (int i = 0; i < prodVet.length; i++){


      System.out.println(prodVet[i]);
    }

    
  

  }
}