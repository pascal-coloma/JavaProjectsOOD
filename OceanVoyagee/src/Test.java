/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author colom
 */
public class Test {
    public static void main(String[] args) {
        
        cruceSolteros cruce1 = new cruceSolteros("SOLT1", "Extasis Popular", "Habana", 9, 150, 8);
        cruceFamiliar cruceFam1 = new cruceFamiliar("FAMI1", "Diversion en Familia", "Buzios", 12, 200);
        crucePerfectDay perfect1 = new crucePerfectDay("Mexico", "PD12", "Manso Dia", "Mexico",7, 350);
        
        Auxiliar auxiliar1 = new Auxiliar();
        
        auxiliar1.agregarCrucero(cruce1);
        auxiliar1.agregarCrucero(cruceFam1);
        auxiliar1.agregarCrucero(perfect1);
   
        System.out.println("***************");
        
        auxiliar1.filtrarPorTipo("perfect day");
        
        
    }
}
