package hospital.management;

import hospital.management.system.Department;
import hospital.management.system.Employee_info;
import hospital.management.system.NEW_PATIENT;
import hospital.management.system.Room;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reception extends JFrame {

    public Reception() {
        // Frame settings
        setSize(1600, 900); 
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // First panel at the top of the frame
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 1525, 150);
        panel1.setBackground(new Color(109, 164, 170));
        add(panel1);

        // Second panel below the first one
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(5, 160, 1525, 670);
        panel2.setBackground(new Color(109, 164, 170));
        add(panel2);

        // Load and scale the first image (Doctor icon)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/dr1.png"));
        Image image = i1.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH); 
        ImageIcon scaledIcon = new ImageIcon(image);

        JLabel label = new JLabel(scaledIcon);
        label.setBounds(1300, 0, 250, 250); 
        panel1.add(label);

        // Load and scale the second image (Ambulance icon)
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("Icon/amb1.png"));
        Image image1 = i2.getImage().getScaledInstance(300, 120, Image.SCALE_SMOOTH); 
        ImageIcon scaledIcon1 = new ImageIcon(image1);

        JLabel label1 = new JLabel(scaledIcon1);
        label1.setBounds(1000, 50, 300, 100); 
        panel1.add(label1);
        setVisible(true);

        JButton btn1=new JButton("Add New Patient");
        btn1.setBounds(30,15,200,30);
        btn1.setBackground(new Color(246,215,118));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new NEW_PATIENT();

            }
        });


        JButton btn2=new JButton("Room");
        btn2.setBounds(30,58,200,30);
        btn2.setBackground(new Color(246,215,118));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new Room();
            }
        });
        

        JButton btn3=new JButton("Department");
        btn3.setBounds(30,100,200,30);
        btn3.setBackground(new Color(246,215,118));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new Department();
                

            }
        });

        JButton btn4=new JButton("All Employee Info");
        btn4.setBounds(270,15,200,30);
        btn4.setBackground(new Color(246,215,118));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                new Employee_info();
            }
        });


        JButton btn5=new JButton("Patient Info");
        btn5.setBounds(270,58,200,30);
        btn5.setBackground(new Color(246,215,118));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                

            }
        });


        JButton btn6=new JButton("Patient Dischage");
        btn6.setBounds(270,100,200,30);
        btn6.setBackground(new Color(246,215,118));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                

            }
        });


        JButton btn7=new JButton(" Update Patient Details");
        btn7.setBounds(510,15,200,30);
        btn7.setBackground(new Color(246,215,118));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                

            }
        });


        JButton btn8=new JButton("Hospital Ambulance");
        btn8.setBounds(510,58,200,30);
        btn8.setBackground(new Color(246,215,118));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                

            }
        });


        JButton btn9=new JButton("Search Room");
        btn9.setBounds(510,100,200,30);
        btn9.setBackground(new Color(246,215,118));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                

            }
        });


        JButton btn10=new JButton("Logout");
        btn10.setBounds(750,15,200,30);
        btn10.setBackground(new Color(246,215,118));
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                

            }
        });


 
    }

    public static void main(String[] args) {
        new Reception();
    }
}
