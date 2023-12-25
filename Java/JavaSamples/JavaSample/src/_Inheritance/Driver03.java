package _Inheritance;

public class Driver03 {
    public static void main(String[] args) {
        동물[] animal = new 동물[7];

        animal[0] = new 동물();
        animal[1] = new 포유류();
        animal[2] = new 조류();
        animal[3] = new 고래();
        animal[4] = new 박쥐();
        animal[5] = new 참새();
        animal[6] = new 펭귄();

        for (동물 a : animal) {
            a.showMe();
        }
    }
}
