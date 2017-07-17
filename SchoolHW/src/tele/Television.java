package tele;
/**
 * A television class
 * @author Dennis Castro
 *
 */
public class Television {
	
	/*
	 * Attribute fields
	 */
	private String manufacturer; 
	private int screen_size;
	private boolean mPowerOn;
	private int channel;
	private int volume;
	
	/**
	 * 
	 * making the constructor defaults of the television
	 * @param volume = 20
	 * @param channel = 2
	 * @param powerOn = false
	 * 
	 */
	
	public Television(String brand, int size) 
	{
		manufacturer = brand;
		screen_size = size;
		mPowerOn = false;
		volume = 20;
		channel = 2;
		
	}
	


	public void Power() {
		
		
		mPowerOn=!mPowerOn;
	}


	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void increaseVolume() {
		volume += 1;
	}
	
	public void decreaseVolume()
	{
		if (volume > 0)
		{
			volume -= 1;
		}
	}


	public int getScreen_size() {
		return screen_size;
	}


	public void setScreen_size(int screen_size) {
		this.screen_size = screen_size;
	}

}
