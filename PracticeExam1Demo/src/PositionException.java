
@SuppressWarnings("serial")
public class PositionException extends Exception {
	public PositionException()
	{
		super("Position is invalid");
	}
	public PositionException(String message)
	{
		super(message);
	}

}