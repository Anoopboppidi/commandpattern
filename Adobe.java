
package anoop.command.americanbread;

public class Adobe {
    //property
    String name;
    /*
    Constructor
    */
    public Adobe( String name ) {
        this.name = name;
    }
    /*
    Dough function
    @param void
    @return void
    */
    public void dough(){
        System.out.println( name + " dough added");
    }
    /*
    add vegetables function
    @param void
    @return void
    */
    public void vegetables(){
        System.out.println(name + " add vegetables");
    }
    /*
    Add seeds function
    @param void
    @return void
    */
    public void seeds(){
        System.out.println( name + " add Seeds");
    }
    /*
    Add nuts function
    @param void
    @return void
    */
    public void nuts(){
        System.out.println( name + " add nuts ");
    }
}
