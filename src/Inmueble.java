public class Inmueble {
  private int identificadorInmobiliario;
  private int area;
  private String direccion;
  private double precioVenta;

  public Inmueble(int identificadorInmobiliario, int area, String direccion) {
      this.identificadorInmobiliario = identificadorInmobiliario;
      this.area = area;
      this.direccion = direccion;
  }

  public double calcularPrecioVenta(double valorArea) {
      return valorArea * this.area;
  }

  public void imprimir() {
      System.out.println("identificador: " + identificadorInmobiliario);
      System.out.println("area: " + area + " metros cuadrados");
      System.out.println("direccion: " + direccion);
  }
}