package BbangBrotherLecture._40_오버로드;

public class Compute {
    int result;

    void setValue(int val) {
        this.result += val;
    }

    void setValue(int val1, int val2) {
        result += val1 + val2;
    }

    int getValue() {
        return result;
    }
}
