package com.example.ProyectoFinalCine.config;

import com.example.ProyectoFinalCine.entities.*;
import com.example.ProyectoFinalCine.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Componente encargado de cargar datos iniciales en la base de datos
 * al iniciar la aplicación.
 *
 * <p>La carga se realiza únicamente si no existen registros de cines
 * almacenados previamente. Se generan entidades de ejemplo para
 * películas, entradas, funciones, salas, clientes, pagos, ventas,
 * cines y empleados.</p>
 */
@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CineRepository cineRepository;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private SalaVIPRepository salaVIPRepository;

    @Autowired
    private FuncionRepository funcionRepository;

    @Autowired
    private EntradaRepository entradaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PagoRepository pagoRepository;

    @Autowired
    private VentaRepository ventaRepository;

    /**
     * Ejecuta la carga inicial de datos al iniciar la aplicación.
     *
     * <p>Si ya existe al menos un cine registrado, el proceso se cancela
     * para evitar duplicar información.</p>
     *
     * @param args argumentos de línea de comandos recibidos por la aplicación.
     * @throws Exception si ocurre algún error durante la carga de datos.
     */
    @Override
    public void run(String... args) throws Exception {

        if (cineRepository.count() > 0) {
            return;
        }

        // ==========================
        // PELICULAS
        // ==========================

        Pelicula p1 = new Pelicula();
        p1.setTitulo("John Wick");
        p1.setGenero(Genero.ACCION);
        peliculaRepository.save(p1);

        Pelicula p2 = new Pelicula();
        p2.setTitulo("Superbad");
        p2.setGenero(Genero.COMEDIA);
        peliculaRepository.save(p2);

        Pelicula p3 = new Pelicula();
        p3.setTitulo("El Origen");
        p3.setGenero(Genero.SUSPENSO);
        peliculaRepository.save(p3);

        Pelicula p4 = new Pelicula();
        p4.setTitulo("Titanic");
        p4.setGenero(Genero.DRAMA);
        peliculaRepository.save(p4);

        // ==========================
        // ENTRADAS
        // ==========================

        Entrada e1 = new Entrada();
        e1.setPrecio(5000);
        e1.setAsiento("A1");
        entradaRepository.save(e1);

        Entrada e2 = new Entrada();
        e2.setPrecio(5000);
        e2.setAsiento("A2");
        entradaRepository.save(e2);

        Entrada e3 = new Entrada();
        e3.setPrecio(5500);
        e3.setAsiento("B1");
        entradaRepository.save(e3);

        Entrada e4 = new Entrada();
        e4.setPrecio(5500);
        e4.setAsiento("B2");
        entradaRepository.save(e4);

        Entrada e5 = new Entrada();
        e5.setPrecio(7000);
        e5.setAsiento("C1");
        entradaRepository.save(e5);

        Entrada e6 = new Entrada();
        e6.setPrecio(7000);
        e6.setAsiento("C2");
        entradaRepository.save(e6);

        Entrada e7 = new Entrada();
        e7.setPrecio(7500);
        e7.setAsiento("D1");
        entradaRepository.save(e7);

        Entrada e8 = new Entrada();
        e8.setPrecio(7500);
        e8.setAsiento("D2");
        entradaRepository.save(e8);

        // ==========================
        // FUNCIONES
        // ==========================

        Funcion f1 = new Funcion();
        f1.setHorario("14:00");
        f1.setPelicula(p1);
        f1.getEntradas().add(e1);
        f1.getEntradas().add(e2);
        funcionRepository.save(f1);

        Funcion f2 = new Funcion();
        f2.setHorario("16:30");
        f2.setPelicula(p2);
        f2.getEntradas().add(e3);
        f2.getEntradas().add(e4);
        funcionRepository.save(f2);

        Funcion f3 = new Funcion();
        f3.setHorario("19:00");
        f3.setPelicula(p3);
        f3.getEntradas().add(e5);
        f3.getEntradas().add(e6);
        funcionRepository.save(f3);

        Funcion f4 = new Funcion();
        f4.setHorario("22:00");
        f4.setPelicula(p4);
        f4.getEntradas().add(e7);
        f4.getEntradas().add(e8);
        funcionRepository.save(f4);

        // ==========================
        // SALAS COMUNES
        // ==========================

        Sala s1 = new Sala();
        s1.setNumero(1);
        s1.setCapacidad(100);
        s1.getFunciones().add(f1);
        salaRepository.save(s1);

        Sala s2 = new Sala();
        s2.setNumero(2);
        s2.setCapacidad(120);
        s2.getFunciones().add(f2);
        salaRepository.save(s2);

        // ==========================
        // SALAS VIP
        // ==========================

        SalaVIP vip1 = new SalaVIP();
        vip1.setNumero(101);
        vip1.setCapacidad(50);
        vip1.setBeneficios("Butacas reclinables");
        vip1.getFunciones().add(f3);
        salaVIPRepository.save(vip1);

        SalaVIP vip2 = new SalaVIP();
        vip2.setNumero(102);
        vip2.setCapacidad(40);
        vip2.setBeneficios("Servicio de comida");
        vip2.getFunciones().add(f4);
        salaVIPRepository.save(vip2);

        // ==========================
        // CLIENTES
        // ==========================

        Cliente c1 = new Cliente();
        c1.setNombre("Juan Perez");
        c1.setEmail("juan@gmail.com");
        clienteRepository.save(c1);

        Cliente c2 = new Cliente();
        c2.setNombre("Maria Gomez");
        c2.setEmail("maria@gmail.com");
        clienteRepository.save(c2);

        Cliente c3 = new Cliente();
        c3.setNombre("Pedro Lopez");
        c3.setEmail("pedro@gmail.com");
        clienteRepository.save(c3);

        // ==========================
        // PAGOS
        // ==========================

        Pago pago1 = new Pago();
        pago1.setMonto(10000);
        pago1.setTipo(TipoPago.TARJETA);
        pagoRepository.save(pago1);

        Pago pago2 = new Pago();
        pago2.setMonto(14000);
        pago2.setTipo(TipoPago.EFECTIVO);
        pagoRepository.save(pago2);

        // ==========================
        // VENTAS
        // ==========================

        Venta v1 = new Venta();
        v1.setFecha("01-06-2026");
        v1.setPago(pago1);
        v1.getClientes().add(c1);
        v1.getClientes().add(c2);
        v1.getFunciones().add(f1);
        ventaRepository.save(v1);

        Venta v2 = new Venta();
        v2.setFecha("02-06-2026");
        v2.setPago(pago2);
        v2.getClientes().add(c3);
        v2.getFunciones().add(f3);
        ventaRepository.save(v2);

        // ==========================
        // CINE
        // ==========================

        Cine cine = new Cine();
        cine.setNombre("Cine Mendoza Center");
        cine.setDireccion("Av. San Martin 123");

        cine.getPeliculas().add(p1);
        cine.getPeliculas().add(p2);
        cine.getPeliculas().add(p3);

        cine.getSalas().add(s1);
        cine.getSalas().add(s2);

        cine.getSalasVip().add(vip1);
        cine.getSalasVip().add(vip2);

        cine.getVentas().add(v1);
        cine.getVentas().add(v2);

        cineRepository.save(cine);

        // ==========================
        // EMPLEADOS
        // ==========================

        Empleado emp1 = new Empleado();
        emp1.setNombre("Carlos Fernandez");
        emp1.setDni(30111222);
        emp1.setCine(cine);
        empleadoRepository.save(emp1);

        Empleado emp2 = new Empleado();
        emp2.setNombre("Laura Martinez");
        emp2.setDni(28999888);
        emp2.setCine(cine);
        empleadoRepository.save(emp2);

    }
}
