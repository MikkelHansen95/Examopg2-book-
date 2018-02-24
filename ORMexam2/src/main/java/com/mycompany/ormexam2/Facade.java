/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ormexam2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Mikkel Lindstrøm <Mikkel.Lindstrøm>
 */
public class Facade {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_ORMexam2_jar_1.0-SNAPSHOTPU");
     
     
//     public void createBook(){
//        EntityManager em = emf.createEntityManager();
//        Book b = new Book() {};
//        b.setAuthor("John");
//        b.setIsbn((long)123456);
//        b.setPrice(10);
//        b.setTitle("Den store hemmelighed");
//        em.getTransaction().begin();
//        em.persist(b);
//        em.getTransaction().commit(); 
//     }
     public void createBook1(){
        EntityManager em = emf.createEntityManager();
        Book b = new Ebook("Se Min URL",(long)123);
        b.setAuthor("Hans");
        b.setIsbn((long)12345);
        b.setPrice(20);
        b.setTitle("Musen");
        em.getTransaction().begin();
        em.persist(b);
        em.getTransaction().commit(); 
     }
     public void createBook2(){
        EntityManager em = emf.createEntityManager();
        Book b = new Paperbook((long)130, 20);
        b.setAuthor("Anders");
        b.setIsbn((long)54321);
        b.setPrice(20);
        b.setTitle("Hesten");
        em.getTransaction().begin();
        em.persist(b);
        em.getTransaction().commit(); 
     }
     
     
     public Book findBook(Long isbn){
         EntityManager em = emf.createEntityManager();
         Query q1 = em.createQuery("Select b FROM Book b WHERE b.isbn = :isbn");
         q1.setParameter("isbn", isbn);
         em.getTransaction().begin();
         Book b = (Book) q1.getSingleResult();
         em.getTransaction().commit();
         System.out.println(b.toString());
         return b;
          
     }
     public void updateBook(){
         EntityManager em = emf.createEntityManager();
         Query q1 = em.createQuery("UPDATE Book b SET b.price = 60000 WHERE b.price = 20");
         em.getTransaction().begin();
         int rowCount = q1.executeUpdate();
         em.getTransaction().commit();

     }
     public void deleteBook(Long isbn){
         EntityManager em = emf.createEntityManager();
         Query q1 = em.createQuery("DELETE FROM Book b WHERE b.isbn = :isbn");
         q1.setParameter("isbn", (long)isbn);
         em.getTransaction().begin();
         int rowCount = q1.executeUpdate();
         em.getTransaction().commit();
         
     }
     
     public List getAllBooks(){
         EntityManager em = emf.createEntityManager();
         Query q1 = em.createQuery("Select b FROM Book b");
         em.getTransaction().begin();
         List myList =  q1.getResultList();
         em.getTransaction().commit();
         
         for (int i =0;i < myList.size();i++){
             System.out.println(myList.get(i));
         }
         
         return myList;
     }
    
    
}
