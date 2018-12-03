import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Football extends JFrame implements ActionListener {
    JButton RM = new JButton ("Real Madrid");
    JButton AC = new JButton ("AC Milan");
    JLabel Result = new JLabel ("Result: ");
    int r = 0, a = 0;
    JLabel Soc = new JLabel( "Last Socer: ");
    JLabel Win = new JLabel ("WINNER: ");
    public Football () {
        super ("Match!");
        setSize(400, 400);
        setLayout (new BorderLayout());
        add (RM, BorderLayout.WEST);
        RM.setActionCommand ("Real Madrid");
        add (AC, BorderLayout.EAST);
        AC.setActionCommand ("AC Milan");
        add (Result, BorderLayout.CENTER);
        Result.setHorizontalAlignment(JLabel.CENTER);
        add (Soc, BorderLayout.NORTH);
        Soc.setHorizontalAlignment(JLabel.CENTER);
        add (Win,BorderLayout.SOUTH);
        Win.setHorizontalAlignment(JLabel.CENTER);
        RM.addActionListener (new ActionListener() {
    
            public void actionPerformed(ActionEvent e) {
                r++;
                Result.setText( "Result: " + r + " : " + a);
                Soc.setText ("Last Socer: " + e.getActionCommand());
                if (r > a) Win.setText("WINNER: " + e.getActionCommand());
                    else if (r < a) Win.setText ("WINNER: " + AC.getActionCommand());
                        else Win.setText("WINNER: NOBODY");
            }
        });
        AC.addActionListener (new ActionListener() {
    
            public void actionPerformed(ActionEvent e) {
                a++;
                Result.setText("Result: " + r + " : " + a);
                Soc.setText ("Last Socer: " + e.getActionCommand());
                if (a > r) Win.setText("WINNER: " + e.getActionCommand());
                    else if (a < r) Win.setText ("WINNER: " + RM.getActionCommand());
                        else Win.setText("WINNER: NOBODY");
            }
        });
        
        
    }
    public static void main(String[] args) {
       Football frame = new Football();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        
    throw new UnsupportedOperationException("Not supported yet.");
    }
    
}