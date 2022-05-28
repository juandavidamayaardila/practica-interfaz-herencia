package com.co.sofka;

import com.co.sofka.utilities.Cat;
import com.co.sofka.utilities.Dog;
import com.co.sofka.utilities.MessagesAnimal;

/**
 * Clase principal, donde se isntancias las demas clases
 *
 * @author CW-DV-JDAA
 * @version 01.02.003 27/05/2022
 * @since 01.
 */
public class Main {
    /**
     * Instancia de la clase Dog.
     */
    static Dog dog = new Dog(true, 4, "Firulais");

    /**
     * Instancia de la clase Cat.
     */
    static Cat cat = new Cat(true, 4, "Michi");

    /**
     * Instancia de la clase MessagesAnimal.
     */
    static MessagesAnimal messages = MessagesAnimal.getInstance();

    /**
     * Metodo Principal por donde inicial a aplicacion.
     *
     * @param args parametro de inicialización.
     */
    public static void main(String[] args) {
        init();
    }

    /**
     * Metodo que ejecuta toda las implementacion e invoca los
     * mensajes que se van a mostrar
     */
    private static void init() {

        dog.bark(); //activamos la accion de ladrar.
        messages.showMessageDogBark(dog.getName()); // Mostramos el mensaje correspondiente
        dog.setBarking(false); // cambiamos el estao del atributo bark

        cat.eat(); //activamos la accion de comer.
        messages.showMessageCatEat(cat.getName()); //mostramos el mensaje correspondiente
        cat.setEat(false); //cambiamos el estado del atributo eat

        dog.jump(); //activamos la accion de saltar
        messages.showMessageDogJum(dog.getName()); //mostramos el mensaje correspondiente.
        dog.setJumping(false); // cambiamos el estado del atributo jumping.

        cat.run(); // activamos la accion de correr
        messages.showMessageCatRun(cat.getName()); // mostramos el mensaje correspondiente.
        cat.setRun(false); // cambiamos el estado del atributo run.

        cat.setDown(); // cayamos las acciones de bark y eat. (false,false)
        messages.showMessageCatSetDown(); //Mostramos el mensaje correspondiente.

        dog.setDown(); // cayamos las acciones
        messages.showMessageDogSetDown(); // mostramos el mensaje correspondiente

        dog.noLive(); // cambiamos el estado del animal
        messages.showMessageStateAnimal(dog.getName(),dog.getLiving()); //mostrmos el mensaje correspondiente.
        dog.live(); // cambiamos el estado del animal.
        messages.showMessageStateAnimal(dog.getName(), dog.getLiving()); // mostramos el mensaje correspondiente.

        dog.setLiving(false); // cambiamos el estado del atributo living
        messages.showMessageStateAnimal(dog.getName(), dog.getLiving()); // mostramos el mensaje correspondiente

        cat.noLive(); // cambiamos el estado del atributo living
        messages.showMessageStateAnimal(cat.getName(), cat.getLiving()); // mostramos el mensaje correspondiente
        cat.live(); // revivimos el gatico.
        messages.showMessageStateAnimal(cat.getName(), cat.getLiving());

        cat.setLiving(false); // cambiamos el estado del atributo living

        if(dog.getBarking() && dog.getLiving() && Boolean.TRUE.equals(dog.getJumping())){
            messages.showMessageStateAnimal(dog.getName(), dog.getLiving()); // mostramos el mensaje correspondiente
        }

        if(cat.getLiving() && cat.getEat() && Boolean.TRUE.equals(cat.getRun()) && cat.getNumberLegs() > 2){
            messages.showMessageStateAnimal(cat.getName(), cat.getLiving()); // mostramos el mensaje correspondiente
        }
    }
}