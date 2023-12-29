package ByteShortMinMax;

public class minMaxByte {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(findMax(a,b));
        Long bigNumber = 10L;
        short smallNumber = bigNumber.shortValue();
        System.out.println(smallNumber);
    }
    private static byte findMax(byte firstNumber, byte secondNumber){
        return (byte) Integer.max((int)firstNumber, (int)secondNumber);
    }
}
