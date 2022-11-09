public class Steuerung {
  //Attribute
  private int wuerfelSumme = 0;
  private GUIwuerfel gui1;
  private Wuerfel wuerfel1 = new Wuerfel();
  private Spieler spieler1 = new Spieler();
  
  //Methoden
  public void wurfeln(){
    wuerfel1.setAugenZahl(wuerfel1.wuerfelWerfen());
    }
  
  public void addWuerfelAugen(){
    setWuerfelSumme(getWuerfelSumme() + getWuerfelZahl());
    }

  public int getWuerfelSumme(){
    return wuerfelSumme;
    }
  
  public void setWuerfelSumme(int wuerfelSummeNeu){
    wuerfelSumme = wuerfelSummeNeu;
    }
  
  public int getWuerfelZahl(){
    return wuerfel1.getAugenZahl();
    }

  }