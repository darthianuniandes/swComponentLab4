/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioPersistenciaMock.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.excepciones.OperacionInvalidaException;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 * Implementación de los servicios de persistencia
 */
@Stateless
public class ServicioPersistencia implements IServicioPersistenciaMockLocal,IServicioPersistenciaMockRemote, Serializable {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    
   
    
    
    @PersistenceContext 
    EntityManager entityManager;
    
    /**
     * La entidad encargada de persistir en la base de datos
     */
    //TODO

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase. Inicializa los atributos.
     */
    public ServicioPersistencia() {
         
         
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------
    
    /**
     * Permite crear un objeto dentro de la persistencia del sistema.
     * @param obj Objeto que representa la instancia de la entidad que se quiere crear.
     * @throws com.losalpes.excepciones.OperacionInvalidaException
     */
    @Override
    public void create(Object obj) throws OperacionInvalidaException {
       entityManager.persist(obj);
    }

    /**
     * Permite modificar un objeto dentro de la persistencia del sistema.
     * @param obj Objeto que representa la instancia de la entidad que se quiere modificar.
     */
    @Override
    public void update(Object obj) {
       entityManager.merge(obj);
    }

    /**
     * Permite borrar un objeto dentro de la persistencia del sistema.
     * @param obj Objeto que representa la instancia de la entidad que se quiere borrar.
     * @throws com.losalpes.excepciones.OperacionInvalidaException
     */
    @Override
    public void delete(Object obj) throws OperacionInvalidaException {
       entityManager.remove(obj);
    }

    /**
     * Retorna la lista de todos los elementos de una clase dada que se encuentran en el sistema.
     * @param c Clase cuyos objetos quieren encontrarse en el sistema.
     * @return list Listado de todos los objetos de una clase dada que se encuentran en el sistema.
     */
    @Override
    public List findAll(Class c) {
        return entityManager.createQuery("select O from " + c.getSimpleName() + " O").getResultList();
    }

    /**
     * Retorna la instancia de una entidad dado un identificador y la clase de la entidadi.
     * @param c Clase de la instancia que se quiere buscar.
     * @param id Identificador unico del objeto.
     * @return obj Resultado de la consulta.
     */
    @Override
    public Object findById(Class c, Object id) {
        List<Object> result = entityManager.createQuery("SELECT p FROM " + c.getSimpleName() + " p where p.login = '" + id+"'").getResultList();
        System.out.println("ISM:" + result.get(0));
        System.out.println("ISM tamaño en servicio:" + result.size());
        return result.get(0); 
    }
}
