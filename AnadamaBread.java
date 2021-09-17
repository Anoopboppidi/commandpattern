
package anoop.command.americanbread;

public class AnadamaBread {
    //property
    String name;
    /*
    Constructor
    @param String name name of bread
    @return void
    */
    public AnadamaBread( String name ){
        this.name = name;
    }
    /*
    add wheat flour
    @param void
    @return void
    */
    public void wheatFlour(){
        System.out.println( name + " add wheat flour");
    }
    /*
    add corn meal
    @param void
    @return void
    */
    public void cornMeal(){
        System.out.println( name + " add corn meal");
    }
    /*
    add molasses 
    @param void
    @return void
    */
    public void molasses(){
        System.out.println( name + " add molasses");
    }
    /*
    Add rye flour
    @param void
    @return void
    */
    public void rye(){
        System.out.println( name + " add rye flour");
    }
}
