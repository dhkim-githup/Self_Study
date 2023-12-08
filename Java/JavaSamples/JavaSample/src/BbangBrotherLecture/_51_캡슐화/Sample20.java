package BbangBrotherLecture._51_캡슐화;

/**
 * 빵형의 실전 Java #051 - 캡슐화
 * https://www.youtube.com/watch?v=pMzVoI90UYk&list=PL2lVRutSfJd_84EoQ_4YrXDZFTZ-nfbxy&index=53
 */

public class Sample20 {

    /* 정보 은식 - 캡슐화 - private */
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
