package homeWork;

public class Board01 {

	//���� ����
		private String title;
		private String name;
		private String contents;
		private int id;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		//���� ���� �ۼ�
		public void setTitle(String title) {
			this.title = title;
		}
		public String getTitle() {
			return title;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
		public void setContents(String contents) {
			this.contents = contents;
		}
		
		public String getContents() {
			return contents;
		}
		
		
		
		//������
		
		public Board01 () {
			title = new String();
			name = new String();
			contents = new String();
		}
		
		public Board01(String title, String name, String contents) {
			this.title = title;
			this.name = name;
			this.contents = contents;
			
		}
		
		
		//equals �������̵�
		
		public boolean equals(Object obj) {
			if(obj instanceof Board01) {
				Board01 b = (Board01)obj;
				if(title.equals(b.title) && name.equals(b.name)) {
					return true;
				}
			}
			return false;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
