import javax.swing.*;
import java.awt.event.*;


public class GUI extends JFrame {
    public static String bestandspadMonitoren = null;
    public static String bestandspadVakanties = null;
    private JPanel mainPanel;
    private JButton startProcedure;
    private JTextField invoerBestandspadVakanties;
    private JTextField invoerBestandspadVrijwilligers;
    private JTextField invoerBestandspadResultaat;
    private JLabel labelInvoerVrijwilligers;
    private JLabel labelInvoerVakanties;
    private JLabel labelInvoerResultaat;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JLabel columnNaam;
    private JTabbedPane Menu;
    private JPanel Home;
    private JPanel Input;
    private JLabel Welkom;
    private JList list1;
    private JPanel Protocol;

    public GUI() {
        super("Kazou W&D - Moniaanduidingstool");
        startProcedure.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                bestandspadMonitoren = invoerBestandspadVrijwilligers.getText();
                bestandspadVakanties = invoerBestandspadVakanties.getText();
                Protocollen.monitoren();
            }
        });

        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setSize(600, 300);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            default:
                pad = "Default return";
                break;
        }
        return pad;
    }


    }


