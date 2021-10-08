public class Produto {

  
  int codigo;
  int  quantidade;
  double valor;
  

  public Produto (int codigo, int quantidade, double valor){

    
    this.codigo = codigo;
    this.quantidade = quantidade;
    this.valor = valor;
  
  

  } 

  @Override
  
  public String toString(){
    String str = "Código: " + this.codigo +"\t\tQuantidade: " + this.quantidade + "\t\t";
    str+="Valor: " + this.valor + "\n";

    return str;

  }

}