import java.util.*;
public class Partida{

  private Time visitante;
  private Time local;
  private int scoreVisitante;
  private int scoreLocal;
  private Date dataPartida;

  //constructor
  public Partida(Time visitante , Time local){
    this.visitante = visitante;
    this.local = local;
    this.scoreVisitante = 0;
    this.scoreLocal = 0;
    this.dataPartida = new Date();
  }

  // Start getters e setters
  public void setScoreVisitante(int scoreVisitante){
    this.scoreVisitante = scoreVisitante;
  }

  public int getScoreVisitante(){
    return scoreVisitante;
  }

  public void setScoreLocal(){
    this.scoreLocal = scoreLocal;
  }

  public int getScoreLocal(){
    return scoreLocal;
  }
  // End getters e setters

  //Iniciar Partida
  public void iniciarPartida(){
    
    //recebendo o tamanho dos nomes, se algum for 0 signica que falta um time.
    int vis = visitante.getNome().length(), loc = local.getNome().length();

    if(vis<1 || loc<1){
      System.out.println("É necessário ter 2 times para iniciar uma partida!!!");
      return;
    }
    //se no final da checagem estiver ok, a partida começa.
    
    //gerando placares aleatorios
    Random random = new Random();
    this.scoreVisitante = random.nextInt(10);
    this.scoreLocal = random.nextInt(10);

  }

  //Mostrar Resultado
  public void mostrarResultado(){
    System.out.println("\n" + local.getNome() + "(" + this.getScoreLocal() + ") x (" + this.getScoreVisitante() + ") " + visitante.getNome() );
  }

  //Finalizar Partida
  public void finalizarPartida(){
    //vitoria do visitante e derrota do local
    if(this.getScoreVisitante()>this.getScoreLocal()){
      visitante.setQTDVitorias(visitante.getQTDVitorias()+1);
      visitante.setQTDPontos(visitante.getQTDPontos()+3);
      local.setQTDDerrotas(local.getQTDDerrotas()+1);
    }
    //vitoria do local e derrota do visitante
    else if(this.getScoreVisitante()<this.getScoreLocal()){
      local.setQTDVitorias(local.getQTDVitorias()+1);
      local.setQTDPontos(local.getQTDPontos()+3);
      visitante.setQTDDerrotas(visitante.getQTDDerrotas()+1);
    }
    //empate
    else {
      local.setQTDEmpates(local.getQTDEmpates()+1);
      visitante.setQTDEmpates(visitante.getQTDEmpates()+1);
      local.setQTDPontos(local.getQTDPontos()+1);
      visitante.setQTDPontos(visitante.getQTDPontos()+1);
    }

  }









}