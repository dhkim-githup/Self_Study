package book.oopforsprings.lec05.solid;

public class LSP_Rectagle {
	
	public static void main(String[] args) {
		
		
		Rectangle_사각형 r = new Rectangle_사각형();
		r.setHeight(5);
		r.setWidth(4);
		System.out.printf("this Size is %d \n",r.area());
		
		Square_정사각형 s = new Square_정사각형();
		s.setHeight(5);
		s.setWidth(4);
		System.out.printf("this Size is %d \n",s.area());
		
		// 자료형 T(Rectangle_직사각형) 의 객체를 자료형 S(Square_정사각형)의 객체로 교체할 수 있어야 한다.
		// 아래는 계산식의 오류가 발생하는 잘못된 다형성을 가지고 있음.
		// 상위 클래스 사각형의 객체를 정사각형의 객체로 교체 시 오류가 발생하게 된다.
		// 사각형의 클래스에서는 아래의 결과값이 20이 되어야 한다.
		Rectangle_사각형 rs = new Square_정사각형();
		rs.setHeight(5);
		rs.setWidth(4);
		System.out.printf("this Size is %d \n",rs.area());
		
	}

}

// 자료형 T
class Rectangle_사각형 {
    public int width;
    public int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public int area() {
        return this.width * this.height;
    }
}

// 자료형 S
class Square_정사각형 extends Rectangle_사각형 {
	
    @Override
    public void setHeight(int value) {
        this.width = value;
        this.height = value;
    }

    @Override
    public void setWidth(int value) {
        this.width = value;
        this.height = value;
    }
}

