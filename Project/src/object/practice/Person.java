package object.practice;

public class Person {
	int age;
	String name;
	Boolean isMarriage;
	int childrenCnt;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name, Boolean isMarriage, int childrenCnt) {
		super();
		this.age = age;
		this.name = name;
		this.isMarriage = isMarriage;
		this.childrenCnt = childrenCnt;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsMarriage() {
		return isMarriage;
	}

	public void setIsMarriage(Boolean isMarriage) {
		this.isMarriage = isMarriage;
	}

	public int getChildrenCnt() {
		return childrenCnt;
	}

	public void setChildrenCnt(int childrenCnt) {
		this.childrenCnt = childrenCnt;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", isMarriage=" + isMarriage + ", childrenCnt=" + childrenCnt
				+ "]";
	}
	
}
