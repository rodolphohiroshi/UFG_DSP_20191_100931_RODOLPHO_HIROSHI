package br.com.rodolphohiroshi.dsp20191.aula2528jpa.persistencia;

import br.com.rodolphohiroshi.dsp20191.aula2528jpa.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class VeiculoRepositoryImpl implements VeiculoRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.rodolphohiroshi.jpaexemplo");
    private EntityManager em;

    public VeiculoRepositoryImpl(){
        em = emf.createEntityManager();
    }

    @Override
    public Veiculo create(Veiculo person) {
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        return person;
    }

    @Override
    public Veiculo read(Long id) {
        //em.getTransaction().begin();
        Veiculo person = em.find(Veiculo.class, id);
        //em.getTransaction().commit();
        return person;
    }

    @Override
    public List<Veiculo> findByName(String name) {
        Query query = em.createQuery("Select p from Veiculo p where p.nome like :name");
        query.setParameter("name", name);
        return query.getResultList();
    }

    @Override
    public Veiculo update(Veiculo person) {
        em.getTransaction().begin();
        person = em.merge(person);
        em.getTransaction().commit();
        return person;
    }

    @Override
    public void delete(Veiculo person) {
        em.getTransaction().begin();
        em.remove(person);
        em.getTransaction().commit();
    }

    @Override
    public void close() {
        emf.close();
    }
}
