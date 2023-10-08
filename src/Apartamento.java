class Apartamento extends InmuebleVivienda {
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
    }
    // no es necesario prque no hay nada para sobreescribirla, el 'imprimir()' ya lo heredará del padre.
    // @Override
    // public void imprimir() {
    //     super.imprimir();
    // }
}