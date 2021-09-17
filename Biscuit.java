
package anoop.command.americanbread;

public class Biscuit {
    //property
    String name;
    /*
    Constructor
    @param String name 
    @return None
    */
    public Biscuit( String name ) {
        this.name = name;
    }
    /*
    Create firm crust function
    @param void
    @return void
    */
    public void firmCrust(){
        System.out.println( name + " firm crust");
    }
    /*
    Create soft interior
    @param void
    @return void
    */
    public void softInterior(){
        System.out.println( name + " soft interior");
    }
    
}
