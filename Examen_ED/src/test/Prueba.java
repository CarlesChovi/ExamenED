package test;

import static org.junit.Assert.*; 

import org.junit.Test; 

import codigo.Menor;

public class Prueba { 

 @Test 

 public void testResta() { 

 

 Menor menor = new Menor(3, 1); 

 int resultado = menor.menor(); 

 assertTrue(resultado == 1); 

 

 System.out.println(menor);

 } 

 }
