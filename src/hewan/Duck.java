/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Duck extends Animal implements Life{

    public Duck(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public void printSound(){
        JOptionPane.showMessageDialog(null, "Kwek Kwek");
    }
}
