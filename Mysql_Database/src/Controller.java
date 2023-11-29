
public class Controller {

	public static void main(String[] args) {
		
		
		BackBencher backBencher=new BackBencher();
		backBencher.setId(6);
		backBencher.setName("hari");
		backBencher.setMarks(70);
		backBencher.setSubject("computer");
		
		
		Inserction dao=new Inserction();
		dao.save(backBencher);

	}
}
