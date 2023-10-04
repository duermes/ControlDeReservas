package database.modelo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="reservas")
public class Reservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double valor;
    private String FormaPago;
}
