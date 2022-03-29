package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
   List<Subscriber> li=new ArrayList<>();
   String channelName="";
   Channel(String name)
   {
       this.channelName=name;
   }
   void addSubscriber(Subscriber s) 
   {
       li.add(s);
   }
   void deleteSubscriber(Subscriber s)
   {
       li.remove(s);
   }
   void notifySubscribers()
   {
       for(Subscriber s: li)
       {
           s.update(this.channelName);
       }
   }
}
