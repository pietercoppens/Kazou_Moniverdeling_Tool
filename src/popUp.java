import javax.swing.*;

public class popUp {

    public  popUp(String melding){
        JFrame f;
        f=new JFrame();
        switch(melding){
            case "Welkom":
                JOptionPane.showMessageDialog(f,"Welkom bij de monitool van Kazou Waas & Dender."+ System.lineSeparator()
                        + " Deze versie van de monitool is gebasseerd op de richtlijnen van Fenix 2021-2022." , "Welkom", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Alert":
                JOptionPane.showMessageDialog(f,"Alert","Alert",JOptionPane.WARNING_MESSAGE);
                break;
            case "Vraag":
                JOptionPane.showMessageDialog(f,"Vraag","Alert",JOptionPane.QUESTION_MESSAGE);
                break;
            case "Error":
                JOptionPane.showMessageDialog(f,"Het bestandspad is ongeldig.","Error",JOptionPane.ERROR_MESSAGE);
                break;
            case "Mededeling":
                JOptionPane.showMessageDialog(f,"Mededeling","Alert",JOptionPane.PLAIN_MESSAGE);
                break;

        }

    }

}

