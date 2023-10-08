class InmuebleVivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroBanos;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("numero de habitaciones: " + numeroHabitaciones);
        System.out.println("numero de baños: " + numeroBanos);
    }
}