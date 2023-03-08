import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Bakgrund extends JPanel implements MouseListener {
    //Attrib
    final int SIZE =200;
    Window myWindow;
    //constr
    public Bakgrund(Window window){
        myWindow = window;
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        this.setPreferredSize(new Dimension(SIZE,SIZE));
        this.addMouseListener(this);

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("YOU HAVE CLICKED!");
        if (myWindow.isBlue()) {
            this.setBackground(Color.CYAN);
            //firstcolor=false;
        } else{
            this.setBackground(Color.YELLOW);
            //firstcolor=true;
        }

        myWindow.setBlue();
        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //Methods

    //getset

}
