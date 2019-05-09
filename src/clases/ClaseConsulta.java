package clases;

public class ClaseConsulta extends ClasePadreAbstracta{
     
    @Override
    public void Transacciones(){
        System.out.println("------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("------------------------------------");
    }    
}
