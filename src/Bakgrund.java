import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Bakgrund extends JPanel implements MouseListener {
    //Attrib
    final int SIZE =400;
    private boolean firstcolor= false;
    //constr
    public Bakgrund(){
        this.setBackground(Color.BLACK);
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
        if (!firstcolor) {
            this.setBackground(Color.CYAN);
            //firstcolor=false;
        } else{
            this.setBackground(Color.YELLOW);
            //firstcolor=true;
        }

        firstcolor= !firstcolor;


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
