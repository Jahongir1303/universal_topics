package com.company.hibernate.onetomany;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OneToManyApp {
    public static void main(String[] args) {
        Configuration configuration = new org.hibernate.cfg.Configuration().addAnnotatedClass(Human.class).addAnnotatedClass(Item.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        try (sessionFactory) {
            Session currentSession = sessionFactory.getCurrentSession();
            currentSession.beginTransaction();

//            Human human = currentSession.get(Human.class, 3);
//            System.out.println(human);

//            List<Item> items = human.getItems();
//            items.forEach(System.out::println);


//            Item item = currentSession.get(Item.class, 5);
//            System.out.println(item);

//            Human owner = item.getOwner();
//            System.out.println(owner);

//            Human human = currentSession.get(Human.class, 2);
//            Item newItem = new Item();
//            newItem.setItemName("Item from Hibernate");
//            newItem.setOwner(human);
//
//            human.getItems().add(newItem);
//
//            currentSession.persist(newItem);

//            Create human
//            Human human = new Human();
//            human.setName("Test name");
//            human.setAge(30);
//
//            Item item = new Item();
//            item.setItemName("Item from hibernate 2");
//            item.setOwner(human);
//
//            human.setItems(new ArrayList<>((Collections.singletonList(item))));
//
//            currentSession.persist(human);
//
//            currentSession.persist(item);

//            Delete human items
//            Human human = currentSession.get(Human.class, 11);
//
//            System.out.println("Took person");
//
//            Hibernate.initialize(human.getItems());
//            List<Item> items = human.getItems();
//
//            items.forEach(currentSession::remove);
//
//            human.getItems().clear();


//            Delete human
//            Human human = currentSession.get(Human.class, 1);
//
//            currentSession.remove(human);

//            Change owner of item
//            Human human = currentSession.get(Human.class, 11);
//
//            Item item = currentSession.get(Item.class, 3);
//
//            item.setOwner(human);
//
//            human.getItems().add(item);
            currentSession.getTransaction().commit();
        }


    }
}
