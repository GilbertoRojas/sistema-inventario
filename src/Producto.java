/**
 * Representa un producto del sistema de inventario.
 * Rama: feature/registro-productos
 */
public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int existencia;

    public Producto(String codigo, String nombre, double precio, int existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getExistencia() { return existencia; }

    /** Muestra la informacion del producto en pantalla. */
    public void mostrarInformacion() {
        System.out.println("----------------------------");
        System.out.println("Codigo:     " + codigo);
        System.out.println("Nombre:     " + nombre);
        System.out.println("Precio:     $" + String.format("%.2f", precio));
        System.out.println("Existencia: " + existencia + " unidades");
        System.out.println("Producto disponible");
    }

    public static void main(String[] args) {
        Producto p = new Producto("P001", "Teclado USB", 249.90, 15);
        p.mostrarInformacion();
    }
}
