package com.example.ProyectoFinalCine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

/**
 * Representa un proveedor dentro del sistema del cine.
 *
 * <p>Almacena la información de contacto y ubicación de los proveedores
 * que suministran productos o insumos al cine.</p>
 */
@Entity
@Table(name = "proveedor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Proveedor extends Base {

    /**
     * Nombre del proveedor.
     */
    @Column(name = "nombre")
    private String nombre;

    /**
     * Número de teléfono de contacto del proveedor.
     */
    @Column(name = "telefono")
    private String telefono;

    /**
     * Dirección física del proveedor.
     */
    @Column(name = "direccion")
    private String direccion;
}
