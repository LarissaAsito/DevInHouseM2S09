import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public void save(Item item){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("itens_senai");
    EntityManager em = factory.createEntityManager();
    em.getTransaction().begin();
    persist(item);
    em.getTransaction().commit();
    em.close();
}