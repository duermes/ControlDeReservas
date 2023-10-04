package database.modelo;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double valor;
    private String FormaPago;

    public Reserva() {

    }
    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, String formaPago) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.FormaPago = formaPago;
        this.calcularValor(fechaEntrada, fechaSalida);
    }

    public double calcularValor(LocalDate fechaEntrada, LocalDate fechaSalida) {
        int diaEntrada = fechaEntrada.getDayOfYear();
        int diaSalida = fechaSalida.getDayOfYear();
        int daysToStay = diaSalida-diaEntrada;
        double dailyTax = 50;
        this.valor = 50*daysToStay;
        return valor;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String formaPago) {
        FormaPago = formaPago;
    }
}
