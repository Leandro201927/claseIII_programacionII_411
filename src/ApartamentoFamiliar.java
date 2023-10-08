class ApartamentoFamiliar extends Apartamento {
    private double valorArea;
    private int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, double valorArea, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("valor de area: " + valorArea);
        System.out.println("valor de administración: " + valorAdministracion);
    }
}