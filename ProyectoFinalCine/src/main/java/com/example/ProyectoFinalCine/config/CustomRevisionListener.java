package com.example.ProyectoFinalCine.config;

import com.example.ProyectoFinalCine.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

/**
 * Implementación personalizada de {@link RevisionListener} utilizada por
 * Hibernate Envers para interceptar la creación de nuevas revisiones de auditoría.
 *
 * <p>Permite agregar información adicional a la entidad de revisión antes de que
 * sea almacenada en la base de datos.</p>
 */
public class CustomRevisionListener implements RevisionListener {

    /**
     * Se ejecuta automáticamente cada vez que Hibernate Envers crea una nueva
     * revisión de auditoría.
     *
     * @param revisionEntity entidad de revisión creada por Envers.
     */
    @Override
    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
