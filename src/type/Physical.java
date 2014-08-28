/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package type;

/**
 *
 * @author Kryštof
 */
public class Physical {
    protected String id;

    public Physical(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }    
    
    private static Enviroment enviroment;

    public static Enviroment getEnviroment() {
        return enviroment;
    }

    public static void setEnviroment(Enviroment e) {
        enviroment = e;
    }
    
    
}
