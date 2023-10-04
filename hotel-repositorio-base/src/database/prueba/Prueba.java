package database.prueba;

import net.bytebuddy.asm.Advice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Prueba {
    public static void main(String[] args) {
        EntityManagerFactory em = Persistence.createEntityManagerFactory("sistema_de_reservas");
        em.createEntityManager();
        LocalDate fecha = LocalDate.now();
        double dia = fecha.getDayOfYear();
        double dia2 = LocalDate.of(2023,9,4).getDayOfYear();
        double resultado = dia-dia2;
        System.out.println(resultado);
    }
}
