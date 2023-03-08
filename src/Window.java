import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    //Attrib
    private boolean blue=true;
    //constr
    public Window(){
        //Window design and function
        this.setTitle("A Clicker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a Layout
        JPanel multiPanel= new JPanel();
        GridLayout layout= new GridLayout(2,2);
        multiPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
        multiPanel.setLayout(layout);


        // Window content
        multiPanel.add(new Bakgrund(this));
        multiPanel.add(new Bakgrund(this));
        multiPanel.add(new Bakgrund(this));
        multiPanel.add(new Bakgrund(this));

        // ad the multipanel to the frame
        this.getContentPane().add(multiPanel);

        //window visible
        this.pack();
        this.setVisible(true);

    }

    //method

    //GetSet


    public boolean isBlue() {
        return blue;
    }

    public void setBlue() {
        this.blue = !this.blue;
    }
}
