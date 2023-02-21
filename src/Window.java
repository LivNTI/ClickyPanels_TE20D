import javax.swing.*;

public class Window extends JFrame {
    //Attrib
    //constr
    public Window(){
        //Window design and function
        this.setTitle("A Clicker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Window content
this.add(new Bakgrund());

        //window visible
        this.pack();
        this.setVisible(true);

    }

    //method

    //GetSet

}
