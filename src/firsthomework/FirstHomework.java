/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsthomework;

import static java.lang.String.format;
import java.util.Scanner;

/**
 *
 * @author Влад
 */
public class FirstHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Создали сканер для воода градусов по Цельсию и вычислили градусы по Фаренгейту
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите градусы по Цельсию: ");
        float TC = scanner.nextFloat();
        float TF = (TC * 9/5) + 32;
        System.out.println("Градусы по Фаренгейту: "+TF);
    }
    
}
