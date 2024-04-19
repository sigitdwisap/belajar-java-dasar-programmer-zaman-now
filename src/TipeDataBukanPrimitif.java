public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 10;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int age = 30;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        float floatAge = ageObject.floatValue();

        System.out.println(ageObject);
        System.out.println(shortAge);
        System.out.println(byteAge);
        System.out.println(floatAge);
    }
}
