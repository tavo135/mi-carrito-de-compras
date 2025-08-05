public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto laptop = new Producto("P001", "Laptop Gamer", 1200.99);
        Producto mouse = new Producto("P002", "Mouse Inalámbrico", 45.50);
        Producto teclado = new Producto("P003", "Teclado Mecánico", 89.99);
        
        // Crear carrito
        Carrito carrito = new Carrito();
        
        // Añadir productos
        carrito.agregarProducto(laptop, 1);
        carrito.agregarProducto(mouse, 2);
        carrito.agregarProducto(teclado, 1);
        
        // Mostrar carrito
        carrito.mostrarCarrito();
        
        // Actualizar cantidad
        carrito.actualizarCantidad("P002", 3);
        System.out.println("\nDespués de actualizar mouse:");
        carrito.mostrarCarrito();
        
        // Eliminar producto
        carrito.eliminarProducto("P003");
        System.out.println("\nDespués de eliminar teclado:");
        carrito.mostrarCarrito();
        
        // Calcular total
        System.out.printf("\nTotal final: $%.2f", carrito.calcularTotal());
    }
}
