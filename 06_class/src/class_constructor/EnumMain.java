package class_constructor;

//class EnumColor{
//	//��� ����
//	public static final String RED = "����";
//	public static final String GREEN = "�ʷ�";
//	public static final String BLUE = "�Ķ�";
//	public static final String MAGENTA = "����";
//	
//}

enum EnumColor{
	RED, GREEN, BLUE, MAGENTA
}

public class EnumMain {
	String colorName;
	EnumColor color;
	
	public static void main(String[] args) {
		System.out.println(EnumColor.RED);
		
		EnumMain em = new EnumMain();
		em.colorName = "����";
		em.color = EnumColor.RED;
		System.out.println(em.colorName+"\t"+em.color);
		System.out.println();
		
		em.colorName = "����";
		EnumColor VIOLET = EnumColor.MAGENTA;
		System.out.println(em.colorName+"\t"+VIOLET);
		System.out.println();
		
		for(EnumColor data: EnumColor.values()) {
			System.out.println(data+"\t"
					+ data.ordinal()+"\t"
					+ data.valueOf(data+""));
						
		}
		

		
	}
}