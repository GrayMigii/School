import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUIwuerfel extends JFrame {
  // start attributes
  private JLabel lWuerfelzahl = new JLabel();
  private JLabel lSumme = new JLabel();
  private JButton bWuerfeln = new JButton();
  private JLabel lStatusausgabe = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private Steuerung st1 = new Steuerung();
  
  // end attributes
  
  public GUIwuerfel() { 
    // Frame-Init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 307;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUIwuerfel");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    jNumberField2.setBounds(184, 64, 81, 41);
    jNumberField2.setText("");
    cp.add(jNumberField2);
    jNumberField1.setBounds(184, 8, 81, 41);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jTextField1.setBounds(8, 224, 273, 25);
    cp.add(jTextField1);
    lStatusausgabe.setBounds(8, 176, 153, 41);
    lStatusausgabe.setText("Statusausgabe");
    cp.add(lStatusausgabe);
    bWuerfeln.setBounds(8, 120, 273, 41);
    bWuerfeln.setText("wuerfeln");
    bWuerfeln.setMargin(new Insets(2, 2, 2, 2));
    bWuerfeln.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bWuerfeln_ActionPerformed(evt);
      }
    });
    cp.add(bWuerfeln);
    lSumme.setBounds(8, 64, 153, 41);
    lSumme.setText("Summe");
    cp.add(lSumme);
    lWuerfelzahl.setBounds(8, 8, 153, 41);
    lWuerfelzahl.setText("Wuerfelzahl");
    cp.add(lWuerfelzahl);
    
    // end components
    
    setVisible(true);
  } // end of public GUIwuerfel
  
  // start methods
  
  public static void main(String[] args) {
    new GUIwuerfel();
  } // end of main
  
  public void bWuerfeln_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    st1.wurfeln();
    jNumberField1.setInt(st1.getWuerfelZahl());
    st1.addWuerfelAugen();
    jNumberField2.setInt(st1.getWuerfelSumme());
  } // end of bWuerfeln_ActionPerformed

  // end methods
} // end of class GUIwuerfel
