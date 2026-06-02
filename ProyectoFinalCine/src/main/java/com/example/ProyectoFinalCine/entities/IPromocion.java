package com.example.ProyectoFinalCine.entities;

/**
 * Interfaz que define el comportamiento de una promoción dentro del sistema.
 *
 * <p>Permite calcular el descuento aplicado según el tipo de promoción
 * implementada por una clase concreta.</p>
 */
public interface IPromocion {

    /**
     * Calcula y devuelve el porcentaje o valor de descuento aplicado.
     *
     * @return descuento correspondiente a la promoción.
     */
    float obtenerDescuento();
}