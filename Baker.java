
package anoop.command.americanbread;

public class Baker {
    Command[] onBakeCommands;
    /*
    Constructor
    @param void
    @return none
    */
    public Baker(){
        onBakeCommands = new Command[7];
        
        for( int j = 0; j < 7; j++ ){
            onBakeCommands[j] = ()->{};
        }
    }
    /*
    Setup the commands to be invoked by invoker class
    @param int slot the index of command in commands array
    @param Command onBakeCommand the command to be invoked
    @return None
    */
    public void setCommands( int slot, Command onBakeCommand ){
        onBakeCommands[slot] = onBakeCommand;
    }
    /*
    Function executes a command specifed by the slot in the commands array
    @param int slot the index of the command to execute
    @return None
    */
    public void onBake(int slot){
        onBakeCommands[slot].execute();
    }
    /*
    Display the object as a string
    @param None
    @return String buffer The description of the object as a string
    */
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n-----Baker Control-----\n");
        for ( int i = 0; i < onBakeCommands.length; i++ ) {
            buffer.append("[slot " + i + "]" + onBakeCommands[i].getClass().getName() + "\n" );
        }
        return buffer.toString();
    }    
    
}
