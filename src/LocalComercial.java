class LocalComercial extends Local {
    private double valorArea;
    private String centroComercial;

    public LocalComercial(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal, double valorArea, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.valorArea = valorArea;
        this.centroComercial = centroComercial;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("valor de area: " + valorArea);
        System.out.println("centro cmercial: " + centroComercial);
    }
}
