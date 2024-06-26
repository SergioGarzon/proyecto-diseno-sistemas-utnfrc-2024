package edu.utnfrc.ppai_diseno_siistemas_utn_frc.domain.entidad;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@Data
public class RegionVitivinicola {

    private String descripcion;
    private String nombre;
    private Provincia provincia;

    public RegionVitivinicola(String descripcion, String nombre, Provincia provincia) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public Pais getPais() {
        return this.provincia.getPais();
    }

    public void conocerBodega() {

    }

    public void contarBodegas() {

    }
}