package nested;


//추상 클래스는 new 할 수 없다
// 추상클래스 안의 메소드는 빈 body로 한다
//추상클래스이기 때문에 누군가(*자식, 익명Inner) override를 해서 써야하기 때문에ㅐ
//내용을 갖고 있을 필요가 없다.

//개발자가 메소드 선택해서 원하는 메소드만 Override
public abstract class AbstractExam {
	public void cc() {
		
	}
	public void dd() {
		
	}
}
