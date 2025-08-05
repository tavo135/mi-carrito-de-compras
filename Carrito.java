import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ItemCarrito> items = new ArrayList<>();
    
    // Añadir producto al carrito
    public void agregarProducto(Producto producto, int cantidad) {
        // Verificar si el producto ya existe en el carrito
        for(ItemCarrito item : items) {
            if(item.getProducto().getId().equals(producto.getId())) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        // Si no existe, añadir nuevo ítem
        items.add(new ItemCarrito(producto, cantidad));
    }
    
    // Eliminar producto del carrito
    public void eliminarProducto(String productoId) {
        items.removeIf(item -> item.getProducto().getId().equals(productoId));
    }
    
    // Actualizar cantidad de un producto
    public void actualizarCantidad(String productoId, int nuevaCantidad) {
        for(ItemCarrito item : items) {
            if(item.getProducto().getId().equals(productoId)) {
                item.setCantidad(nuevaCantidad);
                return;
            }
        }
    }
    
    // Calcular total del carrito
    public double calcularTotal() {
        double total = 0;
        for(ItemCarrito item : items) {
            total += item.getSubtotal();
        }
        return total;
    }
    
    // Mostrar contenido del carrito
    public void mostrarCarrito() {
        System.out.println("\n--- CARRITO DE COMPRAS ---");
        for(ItemCarrito item : items) {
            System.out.printf("%s x%d - $%.2f%n", 
                             item.getProducto().getNombre(),
                             item.getCantidad(),
                             item.getSubtotal());
        }
        System.out.printf("TOTAL: $%.2f%n", calcularTotal());
    }
}
