import jakarta.persistence.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // JPA uzerinde entity yonetebilecegimiz bir yapi kurmaliyiz.
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // Veritabani baglantisi saglanmis oldu.
        // Transaction ve Rollback islemlerini baslatalim.
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Customer customer = new Customer();
        customer.setName("Batuhan");
        customer.setMail("batuhan@mail.com");
        customer.setGender(Customer.GENDER.MALE);
        customer.setOnDate(LocalDate.now());
        entityManager.persist(customer);
        transaction.commit();

        Customer customer1 = entityManager.find(Customer.class, 1);
        System.out.println(customer1.toString());


    }
}