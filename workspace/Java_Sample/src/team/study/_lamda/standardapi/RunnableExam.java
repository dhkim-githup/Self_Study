package team.study._lamda.standardapi;

public class RunnableExam {

	public static void main(String[] args) { 
		
		
		Runnable ra = new Runnable() {			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) 
				{ 
					System.out.println(i); 
				} 				
			}
		};
		
		ra.run();
		
		System.out.println("--------------------------------"); 
		
		/* lamda expression */
		Runnable runnable = () -> { 
			for (int i = 0; i < 10; i++) 
			{ 
				System.out.println(i); 
			} 
		}; 
		
		Thread thread = new Thread(runnable); 
		thread.start(); 
	} 
}

