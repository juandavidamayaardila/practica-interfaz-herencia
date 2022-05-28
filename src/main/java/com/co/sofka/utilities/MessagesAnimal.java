package com.co.sofka.utilities;

import org.jboss.logging.Logger;

/**
 * Clase que permite configurar y mostrar los mensajes al usuario.
 *
 * @author CW-DV-JDAA
 * @version 01.02.003 27/05/2022
 * @since 01.
 */
public class MessagesAnimal {
    /**
     * Constante que permite mostrar los mensajes al usuario.
     */
    private static final Logger logger = Logger.getLogger(MessagesAnimal.class);

    /**
     * Permite acceder a la instancia de la clase.
     *
     * @return la instancia de la clase.
     */
    public static MessagesAnimal getInstance() {
        return new MessagesAnimal();
    }

    /**
     * Permite mostrar el mensaje al usuario cuando el
     * perro esta ladrando.
     *
     * @param name estado actual del atributo Bark
     */
    public void showMessageDogBark(String name) {
        logger.info("El perro " + name + " esta ladrando");
    }

    /**
     * Permite mostrar el mensaje al usuario cuando el
     * perro esta saltando.
     *
     * @param name estado actual del atributo jumping
     */
    public void showMessageDogJum(String name) {
        logger.info("El perro " + name + " esta saltando");
    }

    /**
     * Permite mostrar el mensaje al usuario cuando el
     * cat esta comiendo.
     *
     * @param name estado actual del atributo eat.
     */
    public void showMessageCatEat(String name) {
        logger.info("El gato " + name +" esta comiendo" );
    }

    /**
     * Permite mostrar el mensaje al usuario cuando el
     * cat esta corriendo.
     *
     * @param name estado actual del atributo run.
     */
    public void showMessageCatRun(String name) {
        logger.info("El gatos " + name + " esta corriendo" );
    }

    /**
     * Permite mostrar el mensaje al usuario cuando el
     * cat este sentado.
     *
     */
    public void showMessageCatSetDown() {
        logger.info("El gatos esta sentado y callado");
    }

    /**
     * Permite mostrar el mensaje al usuario cuando el
     * cat este sentado.
     */
    public void showMessageDogSetDown() {
        logger.info("El perro esta sentado y callado");
    }

    /**
     * Permite mostrar el mensaje al usuario cuando el
     * animal este vivo o no.
     *
     * @param name estado del animal true o false (vino o noVivo)
     */
    public void showMessageStateAnimal(String name, Boolean state){
        if (Boolean.TRUE.equals(state)) {
            logger.info("El animal " + name + " esta  vivo" );
        } else {
            logger.info("El animal " + name + " esta no vivo ");
        }
    }
}
