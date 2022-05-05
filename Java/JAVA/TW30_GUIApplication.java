/*
30) Design and develop a GUI application to accepts student details as shown in the GUI below. Allow the user to add records one after the other. Once the user clicks on close, compute the average score and display the details using JTable component.
*/

import java.util.ArrayList; 
import java.awt.EventQueue; 
import javax.swing.JFrame; 
import java.awt.FlowLayout; 
import javax.swing.JLabel; 
import javax.swing.JTextField; 
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel; 
import javax.swing.JButton;
import java.awt.event.ActionListener; import java.awt.event.ActionEvent;
 
class TW30_GUIApplication extends javax.swing.JFrame{
class StudentRecord{
String name;
int rollNo, m1, m2, m3;
StudentRecord(int rollNo, String name, int m1, int m2, int m3){
this.name = name;
this.rollNo = rollNo;
this.m1 = m1;
this.m2 = m2;
this.m3 = m3;
}
}
ArrayList<StudentRecord> records = new ArrayList<StudentRecord>();
private JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTable table;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
TW30_GUIApplication window = new TW30_GUIApplication();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the application.
*/
public TW30_GUIApplication() {
initialize();
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
JLabel jbl1 = new JLabel("Roll No");
frame.getContentPane().add(jbl1);
textField = new JTextField();
frame.getContentPane().add(textField);
textField.setColumns(10);
JLabel jbl2 = new JLabel("Name");
frame.getContentPane().add(jbl2);
textField_1 = new JTextField();
frame.getContentPane().add(textField_1);
textField_1.setColumns(10);
JLabel label = new JLabel("");
frame.getContentPane().add(label);
JLabel jbl3 = new JLabel("Marks-1");
frame.getContentPane().add(jbl3);
JLabel label_1 = new JLabel("");
frame.getContentPane().add(label_1);
textField_2 = new JTextField();
frame.getContentPane().add(textField_2);
textField_2.setColumns(10);
JLabel label_2 = new JLabel("");
frame.getContentPane().add(label_2);
JLabel jbl4 = new JLabel("Marks-2");
frame.getContentPane().add(jbl4);
textField_3 = new JTextField();
frame.getContentPane().add(textField_3);
textField_3.setColumns(10);
JLabel jbl5 = new JLabel("Marks-3");
frame.getContentPane().add(jbl5);
JLabel label_3 = new JLabel("");
frame.getContentPane().add(label_3);
textField_4 = new JTextField();
frame.getContentPane().add(textField_4);
textField_4.setColumns(10);
JButton b1 = new JButton("Add");
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
StudentRecord s1 = new StudentRecord(Integer.parseInt(textField.getText()), textField_1.getText(), Integer.parseInt(textField_2.getText()), Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()));
records.add(s1);
textField.setText("");
textField_1.setText("");
textField_2.setText("");
textField_3.setText("");
textField_4.setText("");
}
});
JLabel label_4 = new JLabel("");
frame.getContentPane().add(label_4);
frame.getContentPane().add(b1);
JButton b2 = new JButton("Summarize");
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int rowCount = 0;
for(StudentRecord s : records) {
table.setValueAt(s.rollNo, rowCount, 0);
table.setValueAt(s.name, rowCount, 1);
table.setValueAt(s.m1, rowCount, 2);
table.setValueAt(s.m2, rowCount, 3);
table.setValueAt(s.m3, rowCount, 4);
float avg = (s.m1 + s.m2 + s.m3) / 3.0f;
table.setValueAt(String.format("%.2f", avg), rowCount, 5);
rowCount++;
}
}
});
JLabel label_5 = new JLabel("");
frame.getContentPane().add(label_5);
frame.getContentPane().add(b2);
table = new JTable();
table.setModel(new DefaultTableModel(
new Object[][] {
{null, null, null, null, null, null},
{null, null, null, null, null, null},
{null, null, null, null, null, null},
{null, null, null, null, null, null},
{null, null, null, null, null, null},
{null, null, null, null, null, null},
{null, null, null, null, null, null},
{null, null, null, null, null, null},
},
new String[] {
"Roll No", "Name", "Marks 1", "Marks 2", "Marks 3", "Average"
}
));
frame.getContentPane().add(table);
}
}