package empleado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VANESSA
 */
public class Empresa {
    
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void calcularNomina() {
        double totalNomina = 0;
        System.out.println("Nómina de Empleados:");
        for (Empleado e : empleados) {
            double salarioMensual = e.calcularSalarioMensual();
            System.out.println(e.getNombre() + " " + e.getApellidos() + ": " + salarioMensual);
            totalNomina += salarioMensual;
        }
        System.out.println("Total de la Nómina: " + totalNomina);
    }

    public void guardarArchivo(String ruta) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta + "/Nómina.txt"))) {
            double totalNomina = 0;
            for (Empleado e : empleados) {
                double salarioMensual = e.calcularSalarioMensual();
                writer.write(e.toString() + "\n");
                totalNomina += salarioMensual;
            }
            writer.write("Total de la Nómina: " + totalNomina);
        }
    }

    public void editarEmpleado(int indice, Empleado e) {
        if (indice >= 0 && indice < empleados.size()) {
            empleados.set(indice, e);
        }
    }

    public void eliminarEmpleado(int indice) {
        if (indice >= 0 && indice < empleados.size()) {
            empleados.remove(indice);
        }
    }

    public void leerArchivo(String ruta) throws IOException {
        empleados.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(" ");
                String nombre = datos[0];
                String apellidos = datos[1];
                String cargo = datos[2];
                String genero = datos[3];
                double salarioPorDia = Double.parseDouble(datos[4]);
                int diasTrabajados = Integer.parseInt(datos[5]);
                double otrosIngresos = Double.parseDouble(datos[6]);
                double pagosSalud = Double.parseDouble(datos[7]);
                double aportePensiones = Double.parseDouble(datos[8]);

                Empleado e = new Empleado(nombre, apellidos, cargo, genero, salarioPorDia, diasTrabajados, otrosIngresos, pagosSalud, aportePensiones);
                agregarEmpleado(e);
            }
        }
    }
}
