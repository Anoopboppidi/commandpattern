/**
 *
 * @author Anoop
 */
package anoop.command.americanbread;


public class AmericanBreadTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Baker baker = new Baker();
        
        Adobe adobe = new Adobe("Adobe");
        AnadamaBread anadamaBread = new AnadamaBread("Anadama Bread");
        Biscuit biscuit = new Biscuit("Biscuit");
        
        Command bakeAdobeCommand = () -> {
            adobe.dough();
            adobe.nuts();
            adobe.seeds();
            adobe.vegetables();
        };
        baker.setCommands(0, bakeAdobeCommand);
        
        Command bakeAnadamaBreadCommand = () -> {
            anadamaBread.cornMeal();
            anadamaBread.molasses();
            anadamaBread.rye();
            anadamaBread.wheatFlour();
        };
        baker.setCommands(1, bakeAnadamaBreadCommand);
        
        Command bakeBiscuitCommand = () -> {
            biscuit.firmCrust();
            biscuit.softInterior();
        };
        baker.setCommands(2, bakeBiscuitCommand);
        
        System.out.println(baker);
        
        baker.onBake(0);
        System.out.println("\n");
        
        baker.onBake(1);
        System.out.println("\n");
        
        baker.onBake(2);

        
    }
}
