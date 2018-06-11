import java.awt.*;
import javax.swing.*;

public class Grapic extends JFrame
{
    private JPanel mva;

    
    public void el(){

        setLayout(null);
    }

    public static void main(){
        Grapic l = new Grapic();
        l.setSize(800,500);
        l.setVisible(true);
        l.setTitle("MVA");
    }
}
