/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ormexam2;

import javax.persistence.Entity;

@Entity
public class Paperbook extends Book {

    private static final long serialVersionUID = 1L;
    
    private Long shipingWeight;
    private int InStock;

    public Paperbook() {
    }

    public Paperbook(Long shipingWeight, int stock) {
        this.shipingWeight = shipingWeight;
        this.InStock = stock;
    }
    
    public Long getShipingWeight() {
        return shipingWeight;
    }

    public int getInStock() {
        return InStock;
    }

    public void setShipingWeight(Long shipingWeight) {
        this.shipingWeight = shipingWeight;
    }

    public void setInStock(int InStock) {
        this.InStock = InStock;
    }



    
    
    
}
