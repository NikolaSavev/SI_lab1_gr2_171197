import java.util.ArrayList;

class Student {
	String index;
	String firstName;
	String lastName;

	//TODO constructor
	ArrayList<Integer> grades=new ArrayList<>();
	//TODO seters & getters
	
	
	public String getIndex() {
		return this.index
	}
	
	public String getFistName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}

	public double getAverage() {
		float sum=0;
		for(int i=0;i<grades.size();i++) {
			sum+=grades.get(i);
		}
		return sum/grades.size();
	}

	public int ECTSCredits() {
		int krediti=0
		for(int i=0;i<grades.size();i++) {
			if(grades.get(i)>5) {
				krediti+=6;
			}
		}
		return krediti;
	}
}
