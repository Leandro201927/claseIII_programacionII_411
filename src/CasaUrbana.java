class CasaUrbana extends Casa {
    public CasaUrbana(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos, numeroPisos);
    }
    // no sobreescribiremos nada, entonces no es necesario el override. Ya la hereda del padre.
    // @Override
    // public void imprimir() {
    //     super.imprimir();
    // }
}
