public class ItemCarrito {
    private Producto producto;
    private int cantidad;
    
    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    // Getters
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    
    // Setters
    public void setCantidad(int cantidad) {
        if(cantidad > 0) this.cantidad = cantidad;
    }
    
    public double getSubtotal() {
        return producto.getPrecio() * cantidad;
    }
}
