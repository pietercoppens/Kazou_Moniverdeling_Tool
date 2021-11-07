import javax.swing.*;
import java.awt.event.*;


public class GUI extends JFrame{
    public static String bestandspadMonitoren = null;
    public static String bestandspadVakanties = null;
    private JTextField invoerBestandspadVrijwilligers;
    private JPanel mainPanel;
    private JTextField invoerBestandspadVakanties;
    private JLabel padVrijwilligers;
    private JLabel padVakanties;
    private JButton startProcedure;
    private JPanel invoer;


    public GUI(){
        super("Kazou W&D - Moniaanduidingstool");


        startProcedure.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("test");
                bestandspadMonitoren = invoerBestandspadVrijwilligers.getText();
                bestandspadVakanties = invoerBestandspadVakanties.getText();
                System.out.println(bestandspadMonitoren);
                System.out.println(bestandspadVakanties);
                Excel.readCell(1, 0);
            }
        });


        setContentPane(mainPanel);

        setBounds(250, 250,300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        invoerBestandspadVakanties.addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {

            }
        });
    }

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
        }
    }
    public static String bestandspad(String naam) {
        String pad;
        switch (naam) {
            case "Monitoren":
                pad = bestandspadMonitoren;
                break;
            case "Vakanties":
                pad = bestandspadVakanties;
                break;
            default: pad = "Default return"; break;
        }
        return pad;
    }



}

