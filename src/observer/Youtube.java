package observer;

public class Youtube {
    public static void main(String[]args)
    {
        Channel abid=new Channel("Learn with Abid");

        Subscriber s1=new Subscriber("Abid");
        Subscriber s2=new Subscriber("Shakib");
        Subscriber s3=new Subscriber("Shrijon");
        Subscriber s4=new Subscriber("Raju");
        Subscriber s5=new Subscriber("Fahim");

        s1.subChannel(abid);
        s2.subChannel(abid);
        s3.subChannel(abid);
        s4.subChannel(abid);
        s5.subChannel(abid);
        s1.subChannel(abid);
      
        abid.addSubscriber(s1);
        abid.addSubscriber(s2);
        abid.addSubscriber(s3);
        abid.addSubscriber(s4);
        abid.addSubscriber(s5);

        abid.notifySubscribers();



    }
}
