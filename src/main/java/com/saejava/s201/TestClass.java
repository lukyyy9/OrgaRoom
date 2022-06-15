package com.saejava.s201;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass extends MainController {

    @Test
    public void AjoutSalle() {
        assertEquals(0, listeSalles.size());
        Salle B100 = new Salle("B203", 10, 20, 30, true, true, true);
        assertEquals(1, listeSalles.size());
    }

    @Test
    public void IncorrAjoutSalle() {
        assertEquals(0, listeSalles.size());
        Salle B100 = new Salle("B203", -10, -20, 30, true, true, true);
        assertEquals(1, listeSalles.size());
    }


    @Test
    public void IncorrSupprSalle() {
        assertEquals(0, listeSalles.size());
        suppressionSalleButton();
        assertEquals(0, listeSalles.size());
    }

    @Test
    public void SupprSalle() {
        assertEquals(0, listeSalles.size());
        Salle B100 = new Salle("B203", 10, 20, 30, true, true, true);
        assertEquals(1, listeSalles.size());
        suppressionSalleButton();
        assertEquals(0, listeSalles.size());
    }

//    @Test
//    public void ModifierSalle() throws IOException {
//        assertEquals(0, listeSalles.size());
//        Salle B100 = new Salle("B203", 10, 20, 30, true, true, true);
//        modificationSalleButton();
//        assertEquals(0, listeSalles.size());
//    }

//    @Test
//    public void IncorrModifierSalle() throws IOException {
//        assertEquals(0, listeSalles.size());
//        Salle B100 = new Salle("B203", 10, 20, 30, true, true, true);
//        modificationSalleButton();
//        assertEquals(0, listeSalles.size());
//    }



}