/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ormexam2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mikkel Lindstrøm <Mikkel.Lindstrøm>
 */
public class RunMe {
    
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_ORMexam2_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        Persistence.generateSchema("com.mycompany_ORMexam2_jar_1.0-SNAPSHOTPU", null);
        
        Facade f = new Facade();
        
//        f.createBook();
        f.createBook1();
        f.createBook2();
        f.getAllBooks();
        f.findBook((long)12345);
        f.updateBook();
//        f.deleteBook((long)12345);
        
        
    }
    
    
}
