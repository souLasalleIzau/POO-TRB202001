public class Time {
   
  private String Nome;
  private int qtdVitorias;
  private int qtdEmpates;
  private int qtdDerrotas;
  private int qtdPontos;

  // constructor
  public Time(String Nome){
    this.Nome = Nome;
    this.qtdVitorias = 0;
    this.qtdEmpates = 0;
    this.qtdDerrotas = 0;
    this.qtdPontos = 0;
  }

  // Start getters e setters
  public void setNome(String Nome){
    this.Nome = Nome;
  }

  public String getNome(){
    return Nome;
  }

  public void setQTDVitorias(int qtdVitorias){
    this.qtdVitorias = qtdVitorias;
  }

  public int getQTDVitorias(){
    return qtdVitorias;
  }

  public void setQTDEmpates(int qtdEmpates){
    this.qtdEmpates = qtdEmpates;
  }

  public int getQTDEmpates(){
    return qtdEmpates;
  }

  public void setQTDDerrotas(int qtdDerrotas){
    this.qtdDerrotas = qtdDerrotas;
  }

  public int getQTDDerrotas(){
    return qtdDerrotas;
  }

  public void setQTDPontos(int qtdPontos){
    this.qtdPontos = qtdPontos;
  }

  public int getQTDPontos(){
    return qtdPontos;
  }
  // End getters e setters

  // listar
  public void listar(){
    System.out.println("\nTIME: " + this.getNome() + "\nVitorias: " + this.getQTDVitorias() + "\nEmpates: " + this.getQTDEmpates() + "\nDerrotas: " + this.getQTDDerrotas() + "\nPontos: " + this.getQTDPontos());
  }
}