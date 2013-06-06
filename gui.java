//this is code to read an input
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  

/**
 *
 * @author Student
 */
public class Gui extends JFrame implements ActionListener {
    JLabel answer=new JLabel();
JPanel pane = new JPanel();
JButton save=new JButton("save");
  Gui() 
  {
    super("morryz"); setBounds(200,300,300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane(); // inherit main frame
    con.add(pane);
    save.setMnemonic('p');
    save.addActionListener(this);
 save.setBackground(Color.green);
 pane.add(answer);
 pane.add(save);
 save.setBorder(null);
 save.setSize(100, 80);
 save.requestFocus();
    // pane.add(someWidget);
    setVisible(true); // display this frame
  }
   public void actionPerformed(ActionEvent event)
  {
    Object source = event.getSource();
    if (source == save)
    {
      answer.setText("thank you!");
      JOptionPane.showMessageDialog(null,"successfuly saved!","Message Dialog",
      JOptionPane.PLAIN_MESSAGE);
      setVisible(true);  // show something
    }
  }
   
     
    public static void main(String[] args) {
        new Gui();
        
        // TODO code application logic here
    }
}
