
public class Score2 {

	// public static void main(String[] args) { } Score1에서 로드할거라 static void가 필요없음.
	// 사용자 정보 확인 및 데이터 검수 파트

	private String name;
	private String subject;
	private String sign = "false";
	private String score = null;
	
    
	public void stdata(String name, String subject) { // setter
		this.name = name;
		this.subject = subject;

		String st[][] = { { "박은경", "이경훈", "장운", "조기현", "김진수" }, 
				{ "80", "78", "92", "67", "40" },
				{ "40", "80", "80", "92", ",100" },
				{ "95", "30", "55", "90", "65" },
				{ "20", "80", "100", "95", "30" } };

	//	System.out.println(name + "," + subject);
		int w = 0;
		int ea = st.length;
		int index= 0;
		
		while (w < ea) {
			if (this.subject == null ) { // if(this.subject==null && this.name !=null) {세밀하게 확인시 .
				if (this.name.equals(st[0][w])) {
					this.sign = "true";
				}
			}
			
			else if (this.name.equals(st[0][w])) {
				this.sign = "true";
				
			   	index = w;           // 인덱스번호 w값 switch문으로 가져가기. 
			                         //w=index..준괄호안에 있으면 밖으로 나가지 못하니 따로변수처리해줘야됨.
			}
			
			else if (this.subject!=null) {
				
				//this.sign = this.sign + index;
				
				switch(this.subject) {
				
				case "국어":  
				this.score = st[1][index];
					break;
					
				case "수학":
				this.score = st[2][index];
					break;		
					
				case "과학":
				this.score = st[3][index];
					break;
					
				case "역사":
				this.score = st[4][index];
				
				
				
					break;
					
				default : 
				 this.score = st[1][index] +","+ st[2][index] +","+ st[3][index] +"," +st[4][index]; 
				 	 
					break;
						
			   }
			}
			w++;
		}

	}

	public String gtdata() {   //getter 출력  ->string 보내면 score1 check에도 string으로 보내야됨.
				if(this.subject==null) {
				return this.sign;
			}
				else {
				return this.score;
							}
			
		
	}

}
