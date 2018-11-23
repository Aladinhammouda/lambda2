/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.locationvoiture;

/**
 *
 * @author Mehdi
 */
public class CritereMarque implements Critere {

    private String marque;

    public CritereMarque(String marque) {
        this.marque = marque;
    }

    public boolean estSatisfaitPar(Voiture v) {
        return marque.equals(v.getMarque());
    }
}
