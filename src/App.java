public class App {
    public static void main(String[] args) throws Exception {
        CasaRural casaRural = new CasaRural(1, 200, "calle 123", 3, 2, 2, 1500000, 500, 1000);
        // pienso que 'tienePiscina' debería ser booleano, aunque en el diagrama de clases marca como double.
        CasaConjuntoCerrado casaConjuntoCerrado = new CasaConjuntoCerrado(2, 150, "calle 456", 4, 3, 1, 2500000, 200, true, true);
        CasaIndependiente casaIndependiente = new CasaIndependiente(3, 100, "calle 789", 3, 2, 2, 3000000);
        Apartaestudio apartaestudio = new Apartaestudio(4, 50, "calle 101", 1500000, 2, 2);
        ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(5, 80, "calle 202", 2, 2, 2000000, 500);
        LocalComercial localComercial = new LocalComercial(6, 100, "avenida sur", Local.Tipo.CALLE, 3000000, "palmetto");
        Oficina oficina = new Oficina(7, 60, "avenida b norte", Local.Tipo.CALLE, 3500000, false);

        casaRural.imprimir();
        casaConjuntoCerrado.imprimir();
        casaIndependiente.imprimir();
        apartaestudio.imprimir();
        apartamentoFamiliar.imprimir();
        localComercial.imprimir();
        oficina.imprimir();
    }
}
