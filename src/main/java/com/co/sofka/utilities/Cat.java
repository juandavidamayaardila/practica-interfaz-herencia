package com.co.sofka.utilities;

import com.co.sofka.utilities.abstracts.AnimalAbstract;
import com.co.sofka.utilities.interfaces.CatInterface;

/**
 * Clase que representa un animal, en este caso
 * un gato, la cual extiende de animal e implementa
 * la interfaz correspondiente
 *
 *  @version  01.02.003 27/05/2022
 *  @author CW-DV-JDAA
 *  @since 01.
 *
 */
public class Cat extends AnimalAbstract implements CatInterface {

    /**
     * Atributo que representa si el gato esta
     * comiendo o no, segun sea el estado.
     */
    private Boolean eat;

    /**
     * Atributo que representa si el gato esta
     * corriendo o no, segun el estado.
     */
    private Boolean run;

    /**
     * Metodo constructo permite inicializar los atributos  e invocar el
     * metodo constructor de la clase padre.
     *
     * @param living Atributo de la clase padre representa si esta vivo
     * @param numberLegs atributo de la clase padre representa el numero de patas
     * @param name atributo de la clase padre representa el nombre del animal
     */
    public Cat(Boolean living, int numberLegs, String name){
        super(living, numberLegs, name);
        eat = false;
        run = false;

    }

    /**
     * Metodo que ejecuta activa la accion de comer.
     */
    public void eat() {
        eat = true;
    }


    /**
     * Metodo que ejecuta activa la accion de correr
     */
    public void run() {
        run = true;
    }

    /**
     * Meotodo implementedo, indicado en la clase padre.
     * el cual inactiva las acciones del animal.
     */
    @Override
    public void setDown() {
        eat = false;
        run = false;
    }

    /**
     * Permite acceder al estado del atributo eat.
     *
     * @return el estado del atributo true o false.
     */
    public Boolean getEat() {
        return eat;
    }

    /**
     * Permite actualizar el estado del atributo.
     *
     * @param eat estado a actual del atributo
     */
    public void setEat(Boolean eat) {
        this.eat = eat;
    }

    /**
     * Permite accder al estado del atributo run
     *
     * @return estado del atributo true o false.
     */
    public Boolean getRun() {
        return run;
    }

    /**
     * Permite actualizar el valor del estado run
     *
     * @param run estado a actualizar
     */
    public void setRun(Boolean run) {
        this.run = run;
    }
}
