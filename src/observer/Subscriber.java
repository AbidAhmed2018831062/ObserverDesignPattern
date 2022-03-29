package observer;

public class Subscriber {
  String name;
  Channel ch;
  Subscriber(String name)
  {
      this.name=name;
  }

  void subChannel(Channel ch)
  {
this.ch=ch;
  }
  void update(String channelName)
  {
      System.out.println("Hey,"+this.name+" "+channelName+" uploaded a new video");
  }
}
