package empleado;

/**
 *
 * @author VANESSA
 */
public class Empleado {

    private String nombre;
    private String apellidos;
    private String cargo;
    private String genero;
    private double salarioPorDia;
    private int diasTrabajados;
    private double otrosIngresos;
    private double pagosSalud;
    private double aportePensiones;

    public Empleado(String nombre, String apellidos, String cargo, String genero, double salarioPorDia, int diasTrabajados, double otrosIngresos, double pagosSalud, double aportePensiones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.genero = genero;
        this.salarioPorDia = salarioPorDia;
        this.diasTrabajados = diasTrabajados;
        this.otrosIngresos = otrosIngresos;
        this.pagosSalud = pagosSalud;
        this.aportePensiones = aportePensiones;
    }

    public double calcularSalarioMensual() {
        return (diasTrabajados * salarioPorDia) + otrosIngresos - pagosSalud - aportePensiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalarioPorDia() {
        return salarioPorDia;
    }

    public void setSalarioPorDia(double salarioPorDia) {
        this.salarioPorDia = salarioPorDia;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public double getPagosSalud() {
        return pagosSalud;
    }

    public void setPagosSalud(double pagosSalud) {
        this.pagosSalud = pagosSalud;
    }

    public double getAportePensiones() {
        return aportePensiones;
    }

    public void setAportePensiones(double aportePensiones) {
        this.aportePensiones = aportePensiones;
    }

    

    @Override
    public String toString() {
        return nombre + " " + apellidos + " - " + calcularSalarioMensual();
    }
}
    

