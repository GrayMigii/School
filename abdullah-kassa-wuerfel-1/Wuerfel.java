public class Wuerfel{
  //Attribute
  private int augenZahl = 0;
  
  //Methoden
  public int getAugenZahl(){
    return augenZahl;
    }

  public void setAugenZahl(int augenZahlNeu){
    augenZahl = augenZahlNeu;
    }

  public int wuerfelWerfen(){
    return (int) Math.round(Math.random()*5+1);
    }
  }