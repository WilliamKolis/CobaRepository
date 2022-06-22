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
public abstract class Animal implements Life{
    String name;
    int age;
    String food;
    String gender;
    int alive;

    public Animal(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }
    
    @Override
    public abstract void printSound();
    
    @Override
    public boolean isAlive(){
        if(alive == mati){
            return false;
        }else
            return true;
    }
    @Override
    public void printData(){
        String hidup = "";
        if(isAlive()){
            hidup = "Masih";
        }else
            hidup = "Tidak";
        JOptionPane.showMessageDialog(null,
                "Nama: " + name
                + "\nUmur: " + age
                + "\nMakanan: " + food
                + "\nJenis Kelamin: " + gender
                + "\nMasih Hidup: " + hidup);
    }
}
