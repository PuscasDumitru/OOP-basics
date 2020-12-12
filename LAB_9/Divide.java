import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Divide extends Frame
{
    Divide()
    {
        JFrame f = new JFrame("Divide and Conquer");
        JButton divide = new JButton("=");

        Font fnt1  = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
        Font fnt2  = new Font(Font.SERIF,  Font.PLAIN, 30);
        Font fnt3  = new Font(Font.MONOSPACED,  Font.BOLD, 20);
        Font fnt4  = new Font(Font.SANS_SERIF,  Font.BOLD, 40);

        JTextField dividendF = new JTextField();
        JTextField divisorF = new JTextField();

        JLabel quotientF = new JLabel();
        JLabel divS = new JLabel();
        JLabel error = new JLabel();
        JLabel advice = new JLabel();
        error.setFont(fnt1);
        advice.setFont(fnt1);
        divS.setFont(fnt4);
        divS.setText("/");
        divide.setFont(fnt4);

        JLabel welc = new JLabel();
        welc.setFont(fnt1);

        welc.setOpaque(true);
        quotientF.setOpaque(true);
        divide.setOpaque(true);
        dividendF.setOpaque(true);
        divisorF.setOpaque(true);
        dividendF.setFont(fnt3);
        divisorF.setFont(fnt3);
        quotientF.setFont(fnt3);



        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 3);
        Border border1 = BorderFactory.createLineBorder(Color.DARK_GRAY, 5);

        quotientF.setBorder(border);
        dividendF.setBorder(border);
        divisorF.setBorder(border);
        welc.setBorder(border1);

        divide.setBackground(Color.BLACK);
        divide.setForeground(Color.WHITE);
        divS.setBackground(Color.BLACK);
        quotientF.setBackground(Color.lightGray);
        quotientF.setForeground(Color.BLACK);
        dividendF.setBackground(Color.lightGray);
        divisorF.setBackground(Color.lightGray);
        dividendF.setForeground(Color.BLACK);
        divisorF.setForeground(Color.BLACK);
        welc.setBackground(Color.blue);
        welc.setForeground(Color.lightGray);
        welc.setText(" Input your numbers and reveal the mystery");

        dividendF.setBounds(20, 120, 140, 40);
        divisorF.setBounds(20, 200, 140, 40);
        divide.setBounds(20, 250, 140, 40);
        quotientF.setBounds(20, 300, 140, 40);
        welc.setBounds(70, 50, 430, 50);
        divS.setBounds(80, 160, 20, 40);


        error.setBounds(200, 150, 500, 50);
        advice.setBounds(200, 250, 500, 50);

        f.add(error);
        f.add(advice);
        f.add(dividendF);
        f.add(divisorF);
        f.add(divide);
        f.add(quotientF);
        f.add(welc);
        f.add(divS);

        f.getContentPane().setBackground(Color.orange);
        f.setSize(600, 400);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {

                advice.setVisible(false);
                error.setVisible(false);
                quotientF.setText("");

                try {

                    float dividend = Float.parseFloat(dividendF.getText());
                    float divisor = Float.parseFloat(divisorF.getText());
                    Float quotient = dividend/divisor;

                    if (divisor == 13)
                        throw new UnluckyException();

                    else if (!Float.isFinite(quotient))
                        throw new ArithmeticException();

                    quotientF.setText(String.valueOf(quotient));
                }

                catch(UnluckyException e) {

                    error.setText(e.getMessage());
                    advice.setText(e.getAdvice());

                    error.setVisible(true);
                    advice.setVisible(true);
                }

                catch(NumberFormatException e) {
                    error.setText("Error ->" + e.getMessage());
                    advice.setText("Advice -> No letters and empty fields!");

                    error.setVisible(true);
                    advice.setVisible(true);
                }

                catch(ArithmeticException e) {
                    error.setText("Error -> That is just disgusting");
                    advice.setText("Advice -> Do not divide by 0 !!!");

                    error.setVisible(true);
                    advice.setVisible(true);
                }
            }
        });
    }



}
