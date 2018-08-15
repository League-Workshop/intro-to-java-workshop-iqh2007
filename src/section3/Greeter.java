package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null, "Hello "+ name);
String age = JOptionPane.showInputDialog("How old are you?");
JOptionPane.showMessageDialog(null, "You are" + age);
String motherboard = JOptionPane.showInputDialog("Do you like your Motherboard?");
}
}