package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, back;

    Login (){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login (1).png"));
        Image i = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450,0,550,500);
        add(image);


        JLabel heading = new JLabel("Quiz Test");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.GREEN);
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(Color.GREEN);
        add(name);

        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times New Roman",Font.BOLD,18));
        add(text);

        Next = new JButton("Next");
        Next.setBounds(110,270,120,25);
        Next.setBackground(Color.blue);
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);

        add(Next);

        back = new JButton("back");
        back.setBounds(250,270,120,25);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);




        setUndecorated(true);
        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == Next){

          new Rules();

      } else if (e.getSource() == back) {
           System.exit(50);
      }
    }

    public static void main(String[] args) {

        new Login();

    }
}
