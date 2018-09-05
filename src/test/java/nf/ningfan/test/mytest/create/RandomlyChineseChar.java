package nf.ningfan.test.mytest.create;

public class RandomlyChineseChar {

    public static char getRandomChar() {
        return (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
    }

    public static void main(String[] args) {
        char randomChar = getRandomChar();

        for(int j = 0; j < 100; j++) {

            for (int i = 0; i < 2; i++) {
                System.out.print(getRandomChar());
            }
            System.out.println();

        }

    }

}
