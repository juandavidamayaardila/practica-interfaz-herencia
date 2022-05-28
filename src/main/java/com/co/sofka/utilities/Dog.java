package com.co.sofka.utilities;

import com.co.sofka.utilities.abstracts.AnimalAbstract;
import com.co.sofka.utilities.interfaces.DogInterface;

/**
 * Clase que representa un animal, en este caso
 * un Dog, la cual extiende de animal e implementa
 * la interfaz correspondiente
 *
 * @author CW-DV-JDAA
 * @version 01.02.003 27/05/2022
 * @since 01.
 */
public class Dog extends AnimalAbstract implements DogInterface {

    /**
     * Atributo que representa si el animal esta ladrando.
     */
    private Boolean barking;

    /**
     * Atributo que representa si el animal esta saltando
     */
    private Boolean jumping;

    /**
     * Metodo constructor que permite iniciliazar las variables e invocar
     * el metodo super de la clase padre.
     *
     * @param living     Atributo de la clase padre representa si esta vivo
     * @param numberLegs atributo de la clase padre representa el numero de patas
     * @param name       atributo de la clase padre representa el nombre del animal
     */
    public Dog(Boolean living, int numberLegs, String name) {
        super(living, numberLegs, name);
        this.barking = false;
        this.jumping = false;
    }

    /**
     * Ejecuta la accion de ladrar. cambiando el estado
     * a true.
     */
    public void bark() {
        barking = true;
    }

    /**
     * Ejecuta la ccion de saltar, cambiando el estado
     * a true.
     */
    public void jump() {
        jumping = true;
    }

    /**
     * Meotodo implementedo, indicado en la clase padre.
     * el cual inactiva las acciones del animal.
     */
    @Override
    public void setDown() {
        jumping = false;
        barking = false;
    }

    /**
     * Permite acceder al estado del atributo.
     *
     * @return estado del atributo true o false.
     */
    public Boolean getBarking() {
        return barking;
    }

    /**
     * Actualiza el estado del atributo.
     *
     * @param barking estado a actualizar.
     */
    public void setBarking(Boolean barking) {
        this.barking = barking;
    }

    /**
     * Permite acceder al valor del atributo jumping
     *
     * @return el valor del atributo true o false.
     */
    public Boolean getJumping() {
        return jumping;
    }

    /**
     * Permite actualizar el estado del atributo.
     *
     * @param jumping estado a ser actualizado.
     */
    public void setJumping(Boolean jumping) {
        this.jumping = jumping;
    }
}
