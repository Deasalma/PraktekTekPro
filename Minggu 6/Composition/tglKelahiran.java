package Composition;

import java.util.List;

public class tglKelahiran {
private final List<Personal> personals;
		tglKelahiran (List<Personal> personals){
			this.personals = personals;
		}
		public List<Personal> getPersonal(){
			return personals;
		}
	

}

