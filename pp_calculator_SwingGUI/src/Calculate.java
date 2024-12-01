import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate {
    public JPanel getPanel() {
        return panel;
    }

    private JPanel panel;
    private JTextField input;
    private JButton plus;
    private JButton reiz;
    private JButton minus;
    private JButton dalit;
    private JButton vienads;
    private JLabel instrukcija;
    private JButton nulle;

    char darbiba;
    double sk1, sk2, rezult;

    public Calculate() {
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sk1 = Integer.parseInt(input.getText());
                darbiba = '+';
                instrukcija.setText("2.skaitlis:");
                input.setText("");
                input.requestFocus();
            }
        });
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sk1 = Integer.parseInt(input.getText());
                darbiba = '-';
                instrukcija.setText("2.skaitlis:");
                input.setText("");
                input.requestFocus();
            }
        });
        reiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sk1 = Integer.parseInt(input.getText());
                darbiba = '*';
                instrukcija.setText("2.skaitlis:");
                input.setText("");
                input.requestFocus();
            }
        });
        dalit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sk1 = Integer.parseInt(input.getText());
                darbiba = '/';
                instrukcija.setText("2.skaitlis:");
                input.setText("");
                input.requestFocus();
            }
        });
        vienads.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sk2 = Integer.parseInt(input.getText());
                switch (darbiba) {
                    case '+':
                        rezult=sk1+sk2;
                        instrukcija.setText("Rezultāts ir:");
                        input.setText(String.valueOf(rezult));
                        break;
                    case '-':
                        rezult=sk1-sk2;
                        instrukcija.setText("Rezultāts ir:");
                        input.setText(String.valueOf(rezult));
                        break;
                    case '*':
                        rezult=sk1*sk2;
                        instrukcija.setText("Rezultāts ir:");
                        input.setText(String.valueOf(rezult));
                        break;
                    case '/':
                        if(sk2==0) {
                            instrukcija.setText("Dalīt ar 0 nevar. Ievadiet citu skaitli:");
                            input.setText("");
                            break;
                        }else {
                            rezult=sk1/sk2;
                            instrukcija.setText("Rezultāts ir:");
                            input.setText(String.valueOf(rezult));
                            break;
                        }
                    default:
                        input.setText("Kļūda");
                        break;
                }
            }
        });
        nulle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sk1 = 0;
                sk2 = 0;
                instrukcija.setText("1.skaitlis:");
                input.setText("");
                input.requestFocus();
            }
        });
    }
}
