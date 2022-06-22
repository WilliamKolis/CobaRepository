/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author William
 */
public class Main {
    static ArrayList<hewan.Animal> listHewan = new ArrayList<>();
    public Main(){
        boolean cek = true;
        int isi;
        while(cek){
            isi = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Suara"
                  + "2. Data Hewan"
                  + "3. Exit Program"));
            switch(isi){
                case 1: cek = false;
                        suara();
                        break;
                case 2: cek = false;
                        data();
                        break;
                case 3: cek = false;
                        System.exit(1);
                        break;
                default: JOptionPane.showMessageDialog(null, "Pilihan Tidak ada!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void data(){
        boolean cek = true;
        int isi;
        while(cek){
            isi = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Data Kucing"
                  + "2. Data Anjing"
                  + "3. Data Bebek"
                  + "4. Data Kuda"));
            switch(isi){
                case 1: 
                    cek = false;
                    for(int i = 0; i < listHewan.size(); i++){
                        hewan.Animal data = listHewan.get(i);
                        if(data instanceof Cat){
                            Cat kucing = (Cat) data;
                            kucing.printData();
                        }
                    }
                break;
                case 2: 
                    cek = false;
                    for(int i = 0; i < listHewan.size(); i++){
                        hewan.Animal data = listHewan.get(i);
                        if(data instanceof Dog){
                            Dog anjing = (Dog) data;
                            anjing.printData();
                        }
                    }
                break;
                case 3: 
                    cek = false;
                    for(int i = 0; i < listHewan.size(); i++){
                        hewan.Animal data = listHewan.get(i);
                        if(data instanceof Duck){
                            Duck bebek = (Duck) data;
                            bebek.printData();
                        }
                    }
                break;
                case 4: 
                    cek = false;
                    for(int i = 0; i < listHewan.size(); i++){
                        hewan.Animal data = listHewan.get(i);
                        if(data instanceof Horse){
                            Horse kuda = (Horse) data;
                            kuda.printData();
                        }
                    }
                break;
                default: 
                    JOptionPane.showMessageDialog(null, "Pilihan tidak ada!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        new Main();
    }
    public void suara(){
        boolean cek = true;
        int isi;
        while(cek){
            isi = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Suara Kucing"
                  + "2. Suara Anjing"
                  + "3. Suara Bebek"
                  + "4. Suara Kuda"));
            switch(isi){
                case 1: 
                    cek = false;
                    for(int i = 0; i < listHewan.size(); i++){
                        hewan.Animal data = listHewan.get(i);
                        if(data instanceof Cat){
                            Cat kucing = (Cat) data;
                            kucing.printSound();
                        }
                    }
                    break;
                case 2: 
                    cek = false;
                    for(int i = 0; i < listHewan.size(); i++){
                        hewan.Animal data = listHewan.get(i);
                        if(data instanceof Dog){
                            Dog anjing = (Dog) data;
                            anjing.printSound();
                        }
                    }
                    break;
                case 3: 
                    cek = false;
                    for(int i = 0; i < listHewan.size(); i++){
                        hewan.Animal data = listHewan.get(i);
                        if(data instanceof Duck){
                            Duck bebek = (Duck) data;
                            bebek.printSound();
                        }
                    }
                    break;
                case 4: 
                    cek = false;
                    for(int i = 0; i < listHewan.size(); i++){
                        hewan.Animal data = listHewan.get(i);
                        if(data instanceof Horse){
                            Horse kuda = (Horse) data;
                            kuda.printSound();
                        }
                    }
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Pilihan tidak ada!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        new Main();
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Bambang", 5, "Whiskas", "Female", 1);
        Dog dog = new Dog("Sebas", 3, "Daging", "Male", 0);
        Duck duck = new Duck("Stuard", 2, "Ikan", "Female", 1);
        Horse horse = new Horse("Bostos", 7, "Jerami", "Male", 0);
        
        listHewan.add(cat);
        listHewan.add(dog);
        listHewan.add(duck);
        listHewan.add(horse);
        
        new Main();
    }
}
