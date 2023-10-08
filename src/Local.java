class Local extends Inmueble {
    public enum Tipo { INTERNO, CALLE }
    private Tipo tipoLocal;

    public Local(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("tipo de local: " + tipoLocal);
    }
}