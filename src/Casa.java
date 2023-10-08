class Casa extends InmuebleVivienda {
    private int numeroPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("num. de pisos: " + numeroPisos);
    }
}