package self._enum.youtube2;

public class EnumExam {
	
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	
	public static void main(String[] args) {
		//String gender1;		
		
		Gender gender1;
			
		gender1 = Gender.MALE;
		System.out.println(gender1);
		gender1 = Gender.FEMALE;
		System.out.println(gender1);
		
		/* 성별에는 MALE, FEMALE 만 사용 가능, 아래 구문은 오류   */
		//gender1 = "boy";
		//System.out.println(gender1);
	
	}	
}

enum Gender{
	MALE, FEMALE
}
