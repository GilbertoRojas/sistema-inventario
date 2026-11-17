import java.util.ArrayList;
import java.util.List;

/**
 * Busqueda de productos en el inventario.
 * Rama: feature/busqueda-productos
 */
public class BusquedaProductos {

    /** Busca un producto por su codigo exacto. Regresa null si no existe. */
    public static Producto buscarPorCodigo(List<Producto> productos, String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    /** Busca todos los productos cuyo nombre contenga el texto indicado. */
    public static List<Producto> buscarPorNombre(List<Producto> productos, String texto) {
        List<Producto> resultados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getNombre().toLowerCase().contains(texto.toLowerCase())) {
                resultados.add(p);
            }
        }
        return resultados;
    }

    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<>();
        inventario.add(new Producto("P001", "Teclado USB", 249.90, 15));
        inventario.add(new Producto("P002", "Mouse inalambrico", 199.00, 30));
        inventario.add(new Producto("P003", "Teclado mecanico", 899.50, 5));

        System.out.println("Busqueda por codigo (P002):");
        Producto encontrado = buscarPorCodigo(inventario, "P002");
        if (encontrado != null) {
            encontrado.mostrarInformacion();
        } else {
            System.out.println("Producto no encontrado");
        }

        System.out.println("\nBusqueda por nombre (\"teclado\"):");
        for (Producto p : buscarPorNombre(inventario, "teclado")) {
            p.mostrarInformacion();
        }
    }
}
