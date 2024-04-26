package Unidade3;

public class Monitor {
    int tamanho;
    String resolucao;
    String marca;
    String modelo;
    int frequencia;
    double preco;
    
    //Métodos que não retorna valor é "void"
    void mostrarInfo() {
        System.out.println("Informações do Monitor: ");
        System.out.println("Frequência: " + frequencia);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Resolução: " + resolucao);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
    }
}
