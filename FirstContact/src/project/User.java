package project;

public class User {

  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV on ? " + smartTv.onOff);
    System.out.println("TV channel is " + smartTv.channel);
    System.out.println("TV volume is " + smartTv.volume);

    smartTv.turnOn();
    System.out.println("New Income -> TV on ? " + smartTv.onOff);
    smartTv.volumeDown();
    smartTv.volumeDown();
    smartTv.volumeDown();
    smartTv.volumeUp();

    smartTv.changeChannel(29);
    System.out.println("You choose the channel " + smartTv.channel);
  }
}
