package observer;

public class Subscriber {
  String name;
  Subscriber(String name)
  {
      this.name=name;
  }
  void update(String channelName)
  {
      System.out.println("Hey,"+channelName+" uploaded a new video");
  }
}
