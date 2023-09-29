package project;

public class SmartTv {

  boolean onOff = false;
  int channel = 1;
  int volume = 15;

  public void changeChannel(int newChannel) {
    channel = newChannel;
  }

  public void channelUp() {
    channel++;
  }

  public void channelDown() {
    channel--;
  }

  public void volumeUp() {
    volume++;
  }

  public void volumeDown() {
    volume--;
  }

  public void turnOn() {
    onOff = true;
  }

  public void turnOff() {
    onOff = false;
  }
}
