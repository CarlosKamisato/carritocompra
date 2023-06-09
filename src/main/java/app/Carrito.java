package app;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
  
  private List<Producto> productos;

  public Carrito() {
    productos = new ArrayList<>();
  }
  
  // método que nos sirve para poder obtener los productos del carrito
  public List<Producto> getProductos() {
    return productos;
  }
  
  public void agregarProducto(Producto producto) {
    this.productos.add(producto);
  }
  
  public void eliminarProducto(Producto producto) {
    this.productos.remove(producto);
  }
  
  public double calcularTotal() {
    double total = 0.0;
    
    for(Producto producto: productos) {
      // total = producto.getPrecio() + total;
      total += producto.getPrecio();
    }  
    return total;
  }
  
}