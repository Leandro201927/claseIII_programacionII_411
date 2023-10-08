class Oficina extends Local {
    private double valorArea;
    private boolean esGobierno;

    public Oficina(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal, double valorArea, boolean esGobierno) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.valorArea = valorArea;
        this.esGobierno = esGobierno;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("valor de área: " + valorArea);
        System.out.println("es del Gobierno: " + esGobierno);
    }
}