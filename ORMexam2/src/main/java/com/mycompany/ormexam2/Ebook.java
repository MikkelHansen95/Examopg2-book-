/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ormexam2;

import javax.persistence.Entity;

@Entity
public class Ebook extends Book {

    private static final long serialVersionUID = 1L;

    private String downloadURL;
    private Long sizeMB;

    public Ebook() {
    }

    public Ebook(String downloadURL, Long sizeMB) {
        this.downloadURL = downloadURL;
        this.sizeMB = sizeMB;
    }

    public String getDownloadURL() {
        return downloadURL;
    }

    public Long getSizeMB() {
        return sizeMB;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public void setSizeMB(Long sizeMB) {
        this.sizeMB = sizeMB;
    }

}
