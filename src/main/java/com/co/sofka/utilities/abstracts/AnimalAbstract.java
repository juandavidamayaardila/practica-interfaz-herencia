package com.co.sofka.utilities.abstracts;

/**
 * Clase abstracta que determina los atributos y comportamientos* @version  01.02.003 27/05/2022
 *  * @author CW-DV-JDAA
 *  * @since 01.
 *  en  comun que tiene los animales
 *
 */
public abstract class AnimalAbstract {

    /**
     * Atributo que determina si el animal
     * esta vivo o no, segun el estado.
     */
    private Boolean living;

    /**
     * Atributo que almacena el numero de patas
     * del animal.
     */
    private final int numberLegs;

    /**
     *  Atributo que almacena el nombre del
     * animal.
     */
    private final String name;

    /**
     *  Metodo constructor permite inicializar los
     *       atributos.
     * @param living atributo que determina si esta vivo
     * @param numberLegs numero de patas
     * @param name nombre del animal
     */
    protected AnimalAbstract(Boolean living, int numberLegs, String name) {
        this.living = living;
        this.numberLegs = numberLegs;
        this.name = name;
    }

    /**
     * Metodo que sera implementendo por las
     * clases que extiendan esta clase.
     */
    public abstract void setDown();

    /**
     * Metodo que camiba el estado del atributo live,
     * el cual determina si esta vivo.
     */
    public void live() {
        living = true;
    }

    /**
     *  Metodo que cambia el estado del atributo live
     *       cuando el anima ya no esta vivo.
     */
    public void noLive() {
        living = false;
    }

    /**
     * Metodo que permite acceder al valor del atributo vivo.
     *
     * @return valor del atributo living
     */
    public Boolean getLiving() {
        return living;
    }

    /*
     * Metodo que permite asignar un valor al atributo livig.
     * en caso que el animal ya no este vivo.
     *
     * @param living valor del atributo living
     */
    public void setLiving(Boolean living) {
        this.living = living;
    }

    /*
     * Meotodo que permite acceder al valor del atributo
     * numeroLegs el cual representa el numero de patas del animal.
     *
     * @return valor del numero de patas del animal
     */
    public int getNumberLegs() {
        return numberLegs;
    }

    /*
     *  Metodo que permite acceder al valor del atributo name
     *       el cual representa el nombre del animal.
     *
     * @return el nombre del animal.
     */
    public String getName() {
        return name;
    }

}
