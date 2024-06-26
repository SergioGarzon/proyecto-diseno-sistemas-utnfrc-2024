package edu.utnfrc.ppai_diseno_siistemas_utn_frc.domain.entidad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Pais {

    private String nombre;
    private List<Provincia> provincia;

    public void contarBodegas() {

    }

    public String getNombre() {
        return nombre;
    }
}
