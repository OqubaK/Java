public class DemoPhoneCalls {
    public static void main(String[] args){
        IncomingPhoneCall i = new IncomingPhoneCall("734-309-6157");
        OutgoingPhoneCall o = new OutgoingPhoneCall("734-309-6155", 10);

        System.out.println(i.getInformation());
        System.out.println(o.getInformation());
    }
}
