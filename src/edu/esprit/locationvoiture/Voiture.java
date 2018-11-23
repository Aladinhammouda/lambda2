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
public class Voiture {

    private int immariculation;
    private String marque;
    private float prixLocation;

    public Voiture(int immariculation, String marque, float prixLocation) {
        this.immariculation = immariculation;
        this.marque = marque;
        this.prixLocation = prixLocation;
    }

    public int getImmariculation() {
        return immariculation;
    }

    public void setImmariculation(int immariculation) {
        this.immariculation = immariculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(float prixLocation) {
        this.prixLocation = prixLocation;
    }

    public int hashCode() {
        int hash = 5;
        hash += 12 * immariculation;
        hash += marque.hashCode();
        return hash;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Voiture) {
            Voiture v = (Voiture) obj;
            return v.immariculation == immariculation && v.marque.equals(marque);
        }
        return false;
    }

    public String toString() {
        return "immatriculation: " + immariculation + "  marque: " + marque + " prix dde location: " + prixLocation;
    }
}
