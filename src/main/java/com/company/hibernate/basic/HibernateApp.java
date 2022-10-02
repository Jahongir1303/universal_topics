package com.company.hibernate.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateApp {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        try (sessionFactory) {
            Session currentSession = sessionFactory.getCurrentSession();
            currentSession.beginTransaction();

//            ******Create Person******
//            Person person1 = Person.builder().age(25).name("Jahongir").build();
//            Person person2 = Person.builder().age(20).name("Otabek").build();
//            Person person3 = Person.builder().age(27).name("Aslonbek").build();
//            currentSession.persist(person1);
//            currentSession.persist(person2);
//            currentSession.persist(person3);

//            ******Update Person******
//            Person updatePerson = currentSession.get(Person.class, 2);
//            updatePerson.setName("Javohir");

//            ******Delete Person******
//            Person deletePerson = currentSession.get(Person.class, 5);
//            currentSession.remove(deletePerson);

//            ******Get All People ******
//            case a)
//            List<Person> personListUsingHQL = currentSession.createQuery("from Person", Person.class).getResultList(); // We used HQL(Hibernate Query Language) in this case
//            case b)
//            List<Person> personListUsingNativeQuery = currentSession.createNativeQuery("select * from persontable", Person.class).getResultList(); // We used SQL(Native query) in this case

//            personListUsingHQL.forEach(System.out::println);
//            personListUsingNativeQuery.forEach(System.out::println);

//            ******Get All People By Age Criteria ******
//            List<Person> personListUsingHQLByAgeCriteria = currentSession.createQuery("from Person where age > 23", Person.class).getResultList();
//            personListUsingHQLByAgeCriteria.forEach(System.out::println);

//            ******Get All People By Name Criteria ******
//            List<Person> personListUsingHQLByNameCriteria = currentSession.createQuery("from Person where LOWER(name) like 'j%'", Person.class).getResultList(); // 'j%' means that after letter 'j' there can be any number of symbol, letter, number etc. (like regex pattern)
//            personListUsingHQLByNameCriteria.forEach(System.out::println);

//            ******Update All People By Age Criteria ******
//            currentSession.createMutationQuery("update Person set name='Shakhriyor' where age < 25 ").executeUpdate();

//            ******Delete All People By Age Criteria ******
            currentSession.createMutationQuery("delete Person where age < 25").executeUpdate();

            currentSession.getTransaction().commit();
        }
    }

}
