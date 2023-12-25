package _Inheritance;

public class Main {

    public static void main(String[] args) {

        // 동물 animal = new 동물("동물", "동물", 20000);
        // System.out.println("======== 동물 Driver02 =======");
        // 동물 bird = new 조류("조류", "조류", 30);
        // System.out.println("======== 조류 Driver02 =======");
        조류 sparrow = new 참새("참새", "참새", 100);

        System.out.println("======== Driver02 =======");

        // animal.showMe();
        // bird.showMe();
        sparrow.showMe();
        // bird.showMe();
        // animal.showMe();
        // sparrow.doFly();
    }
}
