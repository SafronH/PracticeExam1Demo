/**
 * 
 */

/**
 * @author safron
 *
 */
public class TeeBallPlayer implements Player {
	
	private String name;
	private String age;
	private String jerseyNumber;
	private String position;
	
	public TeeBallPlayer(String name, String age, String jerseyNumber, String position) {
		super();
		this.name = name;
		this.age = age;
		this.jerseyNumber = jerseyNumber;
		this.position = position;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the jerseyNumber
	 */
	public String getJerseyNumber() {
		return jerseyNumber;
	}

	/**
	 * @param jerseyNumber the jerseyNumber to set
	 */
	public void setJerseyNumber(String jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "\n\tName: " + getName() +
				"\n\tLeague: Tee-Ball" +
				"\n\tAge: " + getAge() +
				"\n\tDesired Jersey Number: " + getJerseyNumber() +
				"\n\tDesired Postion: " + getPosition();
	}

}
