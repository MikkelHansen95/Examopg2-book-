package com.mycompany.ormexam2;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-23T14:01:01")
@StaticMetamodel(Book.class)
public abstract class Book_ { 

    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, Integer> price;
    public static volatile SingularAttribute<Book, Long> isbn;
    public static volatile SingularAttribute<Book, String> title;

}