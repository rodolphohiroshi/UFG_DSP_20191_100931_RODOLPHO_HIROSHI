package br.com.rodolphohiroshi.dsp20191.aula2528jpa.persistencia;


import br.com.rodolphohiroshi.dsp20191.aula2528jpa.model.Veiculo;

import java.util.List;

public interface VeiculoRepository {
    /**
     * Create a new Person
     *
     * @param veiculo
     * @return Person
     */
    Veiculo create(Veiculo veiculo);

    /**
     * Read Person by id
     *
     * @param id
     * @return Veiculo
     */
    Veiculo read(Long id);

    /**
     *
     * @param name
     * @return
     */
    List<Veiculo> findByName(String name);

    /**
     * Update person
     *
     * @param veiculo
     */
    Veiculo update(Veiculo veiculo);

    /**
     * Delete person
     *
     * @param veiculo
     */
    void delete(Veiculo veiculo);

    /**
     * close the model manager factory
     */
    void close();


}
