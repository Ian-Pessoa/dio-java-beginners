public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void novoCanal(int novoCanal) {
    canal = novoCanal;
  }

  public void aumentarCanal() {
    canal++;
  }

  public void diminuirCanal() {
    canal--;
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Volume aumentado para: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Volume diminuido para: " + volume);
  }

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }
}
