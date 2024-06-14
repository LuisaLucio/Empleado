package empleado;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author VANESSA
 */
public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Calcular nomina");
            System.out.println("3. Guardar archivo");
            System.out.println("4. Editar empleado");
            System.out.println("5. Eliminar empleado");
            System.out.println("6. Leer archivo");
            System.out.println("7. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Genero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Salario por dia: ");
                    double salarioPorDia = scanner.nextDouble();
                    System.out.print("Dias trabajados: ");
                    int diasTrabajados = scanner.nextInt();
                    System.out.print("Otros ingresos: ");
                    double otrosIngresos = scanner.nextDouble();
                    System.out.print("Pagos por salud: ");
                    double pagosSalud = scanner.nextDouble();
                    System.out.print("Aporte pensiones: ");
                    double aportePensiones = scanner.nextDouble();
                    scanner.nextLine();

                    Empleado e = new Empleado(nombre, apellidos, cargo, genero, salarioPorDia, diasTrabajados, otrosIngresos, pagosSalud, aportePensiones);
                    empresa.agregarEmpleado(e);
                    break;
                case 2:
                    empresa.calcularNomina();
                    break;
                case 3:
                    System.out.print("Ingrese la ruta de la carpeta: ");
                    String rutaGuardar = scanner.nextLine();
                    try {
                        empresa.guardarArchivo(rutaGuardar);
                    } catch (IOException ex) {
                        System.out.println("Error al guardar el archivo: " + ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Índice del empleado a editar: ");
                    int indiceEditar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    apellidos = scanner.nextLine();
                    System.out.print("Cargo: ");
                    cargo = scanner.nextLine();
                    System.out.print("Genero: ");
                    genero = scanner.nextLine();
                    System.out.print("Salario por dia: ");
                    salarioPorDia = scanner.nextDouble();
                    System.out.print("Dias trabajados: ");
                    diasTrabajados = scanner.nextInt();
                    System.out.print("Otros ingresos: ");
                    otrosIngresos = scanner.nextDouble();
                    System.out.print("Pagos por salud: ");
                    pagosSalud = scanner.nextDouble();
                    System.out.print("Aporte pensiones: ");
                    aportePensiones = scanner.nextDouble();
                    scanner.nextLine();

                    e = new Empleado(nombre, apellidos, cargo, genero, salarioPorDia, diasTrabajados, otrosIngresos, pagosSalud, aportePensiones);
                    empresa.editarEmpleado(indiceEditar, e);
                    break;
     }
}
    }
}