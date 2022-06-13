import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutFrame extends JFrame {
    private Container container = getContentPane();
    private JLabel appName = new JLabel("RandomAppForJavaOrSomething",SwingConstants.CENTER);
    private JLabel myName = new JLabel("Genidounias Athanasios",SwingConstants.CENTER);
    private JLabel am = new JLabel("20390033",SwingConstants.CENTER);
    private JLabel duration = new JLabel("8/6/22-9/6/22",SwingConstants.CENTER);
    ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("NooBanr.png"));
    JLabel logoLabel = new JLabel(logo); //eikona gia kati allo pou eixa ftiaksei.there is no time for new logo!!!!

    AboutFrame(){
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        container.setBackground(Color.LIGHT_GRAY);


        this.setVisible(true);
        this.setBounds(10, 10, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        appName.setBounds(150,30,200,30);
        myName.setBounds(150,70,200,30);
        am.setBounds(150,110,200,30);
        duration.setBounds(150,140,200,30);
        logoLabel.setBounds(50,190,400,250);




    }

    public void addComponentsToContainer() {
        container.add(logoLabel);
        container.add(appName);
        container.add(myName);
        container.add(am);
        container.add(duration);


    }


}
