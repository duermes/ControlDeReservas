package database.modelo;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="huespedes")
public class Huespedes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String nacionalidad;
    private int telefono;
    @ManyToOne
    private Reservas idReserva;
}
