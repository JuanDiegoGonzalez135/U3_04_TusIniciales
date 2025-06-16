package utez.edu.mx.Aplicacion.de.principios.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class Almacen{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clave;
    private LocalDate fechaRegistro;
    private Double precioVenta;
    private String tamaño; // G, M, P

    @ManyToOne
    @JoinColumn(name = "cede_id")
    private Cedes cede;

    @OneToMany(mappedBy = "almacen", cascade = CascadeType.ALL)
    private List<Clientes> clientes;
}
