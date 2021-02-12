public class Variables {
    public static void main(String[] args) {
        int myInt = 660478;
        short myShort = 2353; // -32000 до 32000
        long myLong = 213524624; // очень большие числа

        double myDouble = 245.34;
        float myFloat = 245.34f; // Вещественные числа( не забудь поставить в конце 'f')

        boolean myBoolean = true; // True and false
        char c = 'f'; // буквы

        byte myByte = 127; // от -128 до 127
        System.out.println(myInt);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myBoolean);
        System.out.println(c);
        System.out.println(myByte);
    }
}
