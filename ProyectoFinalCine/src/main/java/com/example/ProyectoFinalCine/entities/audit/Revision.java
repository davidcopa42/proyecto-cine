package com.example.ProyectoFinalCine.entities.audit;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionListener;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;
import java.util.Date;

/**
 * Entidad utilizada por Hibernate Envers para almacenar la información
 * de las revisiones generadas durante las operaciones de auditoría.
 *
 * <p>Cada registro representa una revisión realizada sobre alguna entidad
 * auditada del sistema, almacenando un identificador único y la fecha
 * en que ocurrió el cambio.</p>
 */
@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(RevisionListener.class)
@Data
public class Revision {

    /**
     * Identificador de versión para serialización.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Identificador único de la revisión.
     * Es generado automáticamente mediante una secuencia de base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(
            name = "revision_seq",
            sequenceName = "rbac.seq_revision_id"
    )
    @RevisionNumber
    private int id;

    /**
     * Fecha y hora en que se realizó la revisión.
     * Este valor es asignado automáticamente por Hibernate Envers.
     */
    @Column(name = "REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
