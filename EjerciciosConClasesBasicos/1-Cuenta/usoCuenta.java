
package Cuenta;

/**
 *
 * @author Gsancho
 */
public class usoCuenta {
    
    
    public static void main(String[] args) {
        
        
        Cuenta Davinia = new Cuenta("Davinia", 75000);
        
        
        System.out.println(Davinia);
        
        Davinia.Ingresar(-5);
        
        System.out.println(Davinia);
        
        Davinia.Ingresar(200);
        
        System.out.println(Davinia);
        
        Davinia.Retirar(250);
        
        System.out.println(Davinia);
        
        Davinia.Retirar(250000);
        
        System.out.println(Davinia);
        
    }
    
}
