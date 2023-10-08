class Apartaestudio extends Apartamento {
    private double valorArea;

    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, double valorArea, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
        this.valorArea = valorArea;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("valor de area: " + valorArea);
    }
}