class CasaConjuntoCerrado extends CasaUrbana {
    private double valorArea;
    private double valorAdministracion;
    private boolean tienePiscina;
    private boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos, double valorArea, double valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
        this.valorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("valor área: " + valorArea);
        System.out.println("valor administración: " + valorAdministracion);
        System.out.println("tiene piscina: " + tienePiscina);
        System.out.println("tiene campos deportivos: " + tieneCamposDeportivos);
    }
}