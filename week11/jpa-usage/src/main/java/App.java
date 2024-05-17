import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // JPA uzerinde entity yonetebilecegimiz bir yapi kurmaliyiz.
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // Veritabani baglantisi saglanmis oldu.
        // Transaction ve Rollback islemlerini baslatalim.
        EntityTransaction transaction = entityManager.getTransaction();


        transaction.begin();
        // Add Supplier
        /*
        Supplier supplier = new Supplier();
        supplier.setAddress("Adres");
        supplier.setCompany("Company");
        supplier.setContact("270960");
        supplier.setMail("info@batuhan.com");
        supplier.setPerson("Batuhan");
        entityManager.persist(supplier);

        Category category = new Category();
        category.setName("Phones");
        entityManager.persist(category);

        // Add Code
        Code code = new Code();
        code.setGroup("1112");
        code.setSerial("52454");
        entityManager.persist(code);


        // Add Product
        Product product = new Product();
        product.setName("iphone 7 plus");
        product.setPrice(111111);
        product.setStock(1223);
        product.setCode(code);
        product.setSupplier(supplier);
        product.setCategory(category);
        entityManager.persist(product);

        System.out.println(product.toString());
        */

        Color blue = new Color("Blue");
        Color red = new Color("Red");
        Color black = new Color("Black");
        entityManager.persist(blue);
        entityManager.persist(black);
        entityManager.persist(red);

        Product product = entityManager.find(Product.class, 1);
        List<Color> colorList = new ArrayList<>();
        colorList.add(blue);
        colorList.add(black);
        product.setColorList(colorList);

        entityManager.persist(product);

        transaction.commit();


    }
}