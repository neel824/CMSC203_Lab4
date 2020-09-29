
public class Television
{
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;
	
public Television(String brand, int size)
{
	this.MANUFACTURER = brand;
	this.SCREEN_SIZE = size;
	this.powerOn = false;
	this.volume = 20;
	this.channel = 2;
}
	
	public void power()
	{
		powerOn = !powerOn;
	}
	public void setChannel(int station)
	{
		this.channel = station;
	}
	public void increaseVolume()
	{
		this.volume = volume + 1;
	}
	public void decreaseVolume()
	{
		this.volume = volume - 1;
	}
	public int getChannel()
	{
		return channel;
	}
	public int getVolume()
	{
		return volume;
	}
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}

}

