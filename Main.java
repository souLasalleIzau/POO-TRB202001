class Main {
  public static void main(String[] args) {
   
    Time flamengo = new Time("Flamengo");
    Time fluminense = new Time("Fluminense");
    Time vasco = new Time("Vasco");
    Time botafogo = new Time("Botafogo");
    Time bangu = new Time("Bangu");
    Time resende = new Time("Resende");

    Partida a = new Partida(flamengo,fluminense);
    Partida b = new Partida(vasco,botafogo);
    Partida c = new Partida(bangu,resende);

    a.iniciarPartida();
    a.mostrarResultado();
    a.finalizarPartida();

    b.iniciarPartida();
    b.mostrarResultado();
    b.finalizarPartida();

    c.iniciarPartida();
    c.mostrarResultado();
    c.finalizarPartida();

    flamengo.listar();
    fluminense.listar();
    vasco.listar();
    botafogo.listar();
    bangu.listar();
    resende.listar();

    System.out.println("\n\n *****FIM DE RODADA*****\n\n")

  }
}