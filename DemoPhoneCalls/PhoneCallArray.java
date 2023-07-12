public class PhoneCallArray {
    public static void main(String[] args){
        PhoneCall[] pc = new PhoneCall[8];

        pc[0] = new IncomingPhoneCall("734-309-6190");
        pc[1] = new OutgoingPhoneCall("734-309-6157", 1);
        pc[2] = new IncomingPhoneCall("734-309-6612");
        pc[3] = new IncomingPhoneCall("734-516-1545");
        pc[4] = new IncomingPhoneCall("734-934-1283");
        pc[5] = new OutgoingPhoneCall("734-934-3516", 5);
        pc[6] = new OutgoingPhoneCall("734-382-8418", 3);
        pc[7] = new IncomingPhoneCall("734-309-6157");

        for (int x = 0; x < pc.length; x++){
            System.out.println(pc[x].getInformation());
        }
    }
}
