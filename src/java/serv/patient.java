/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.beans.*;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Haifa
 */
public class patient implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    String nom,prenom,lieu,rdv,genre;
    int cin,idpatient,gsm;
    Date date_naissance ,date;

    public patient(String nom, String prenom, String lieu, String rdv, String genre, int cin, int idpatient, int gsm, Date date_naissance, Date date, String sampleProperty, PropertyChangeSupport propertySupport) {
        this.nom = nom;
        this.prenom = prenom;
        this.lieu = lieu;
        this.rdv = rdv;
        this.genre = genre;
        this.cin = cin;
        this.idpatient = idpatient;
        this.gsm = gsm;
        this.date_naissance = date_naissance;
        this.date = date;
        this.sampleProperty = sampleProperty;
        this.propertySupport = propertySupport;
    }

    public int getGsm() {
        return gsm;
    }

    public void setGsm(int gsm) {
        this.gsm = gsm;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getRdv() {
        return rdv;
    }

    public void setRdv(String rdv) {
        this.rdv = rdv;
    }

    public patient(String nom, String prenom, String lieu, String rdv, String genre, int cin, int idpatient, Date date_naissance, Date date, String sampleProperty, PropertyChangeSupport propertySupport) {
        this.nom = nom;
        this.prenom = prenom;
        this.lieu = lieu;
        this.rdv = rdv;
        this.genre = genre;
        this.cin = cin;
        this.idpatient = idpatient;
        this.date_naissance = date_naissance;
        this.date = date;
        this.sampleProperty = sampleProperty;
        this.propertySupport = propertySupport;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getIdpatient() {
        return idpatient;
    }

    public void setIdpatient(int idpatient) {
        this.idpatient = idpatient;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PropertyChangeSupport getPropertySupport() {
        return propertySupport;
    }

    public void setPropertySupport(PropertyChangeSupport propertySupport) {
        this.propertySupport = propertySupport;
    }
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public patient() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
