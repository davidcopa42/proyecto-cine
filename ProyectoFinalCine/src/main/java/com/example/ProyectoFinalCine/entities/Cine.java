package com.example.ProyectoFinalCine.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un cine dentro del sistema.
 *
 * <p>Un cine posee información básica como nombre y dirección,
 * además de mantener relaciones con películas, ventas, salas,
 * compras y empleados asociados.</p>
 */
@Entity
@Table(name = "cine")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Cine extends Base {

    /**
     * Nombre del cine.
     */
    @Column(name = "nombre")
    private String nombre;

    /**
     * Dirección física del cine.
     */
    @Column(name = "direccion")
    private String direccion;

    /**
     * Lista de películas disponibles en el cine.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_cine")
    private List<Pelicula> peliculas = new ArrayList<>();

    /**
     * Lista de ventas realizadas en el cine.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_cine")
    private List<Venta> ventas = new ArrayList<>();

    /**
     * Lista de salas VIP pertenecientes al cine.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_cine")
    private List<SalaVIP> salasVip = new ArrayList<>();

    /**
     * Lista de salas comunes pertenecientes al cine.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_cine")
    private List<Sala> salas = new ArrayList<>();

    /**
     * Lista de compras registradas en el cine.
     */
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_cine")
    private List<Compra> compras = new ArrayList<>();

    /**
     * Lista de empleados que trabajan en el cine.
     */
    @OneToMany(mappedBy = "cine", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Empleado> empleados = new ArrayList<>();
}
