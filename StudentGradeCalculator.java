import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentGradeCalculator extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    JTextField t1, t2, t3, t4;
    JButton btn;
    JLabel totalLabel, avgLabel, gradeLabel;

    StudentGradeCalculator() {
        setTitle("Student Grade Calculator");
        setSize(600, 400);
        setLayout(null);
        getContentPane().setBackground(new Color(15, 20, 50));

        l1 = new JLabel("Maths");
        l2 = new JLabel("Science");
        l3 = new JLabel("English");
        l4 = new JLabel("Computer");

        l1.setBounds(40, 40, 100, 25);
        l2.setBounds(40, 80, 100, 25);
        l3.setBounds(40, 120, 100, 25);
        l4.setBounds(40, 160, 100, 25);

        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();

        t1.setBounds(150, 40, 100, 25);
        t2.setBounds(150, 80, 100, 25);
        t3.setBounds(150, 120, 100, 25);
        t4.setBounds(150, 160, 100, 25);

        btn = new JButton("Calculate Grade");
        btn.setBounds(70, 220, 180, 35);
        btn.addActionListener(this);

        totalLabel = new JLabel("Total Marks : ");
        avgLabel = new JLabel("Average : ");
        gradeLabel = new JLabel("Grade : ");

        totalLabel.setBounds(320, 60, 220, 30);
        avgLabel.setBounds(320, 110, 220, 30);
        gradeLabel.setBounds(320, 160, 220, 30);

        totalLabel.setForeground(Color.CYAN);
        avgLabel.setForeground(Color.CYAN);
        gradeLabel.setForeground(Color.GREEN);

        totalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        avgLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gradeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        add(t1);
        add(t2);
        add(t3);
        add(t4);

        add(btn);

        add(totalLabel);
        add(avgLabel);
        add(gradeLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int m1 = Integer.parseInt(t1.getText());
        int m2 = Integer.parseInt(t2.getText());
        int m3 = Integer.parseInt(t3.getText());
        int m4 = Integer.parseInt(t4.getText());

        int total = m1 + m2 + m3 + m4;
        double average = total / 4.0;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        totalLabel.setText("Total Marks : " + total + " / 400");
        avgLabel.setText(String.format("Average : %.2f%%", average));
        gradeLabel.setText("Grade : " + grade);
    }

    public static void main(String[] args) {
        new StudentGradeCalculator();
    }
}