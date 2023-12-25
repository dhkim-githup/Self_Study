package _Inheritance;

public class Driver02 {
    public static void main(String[] args) {
        동물 animal = new 동물("동물", "동물", 20000);
        동물 mammalia = new 포유류();
        동물 bird = new 조류();
        동물 whale = new 고래();
        동물 bat = new 박쥐();
        조류 sparrow = new 참새("참새", "참새", 100);
        동물 penguin = new 펭귄();

        System.out.println("======== Driver02 =======");

        animal.showMe();
        mammalia.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        sparrow.doFly();
        penguin.showMe();
    }
}
