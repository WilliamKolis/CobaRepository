/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan;

/**
 *
 * @author William
 */
public interface Life {
    int hidup = 1;
    int mati = 0;
    
    void printSound();
    boolean isAlive();
    void printData();
}