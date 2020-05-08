/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.youness.systemzugriff;

/**
 *
 * @author aitbellayo
 */
public class SystemeigenschaftenClass {

    public static void main(String[] args) {
        System.out.println(System.getProperties().toString().replace(',', '\n'));
    }
}
