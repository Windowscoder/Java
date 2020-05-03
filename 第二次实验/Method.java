package come;

import java.util.Comparator;

public class  Method implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		if(IO.counter.get(a) > IO.counter.get(b)) {
			return -1;
		}else if(IO.counter.get(a) == IO.counter.get(b)) {
			return 0;
		}else {
			return 1;
		}
	}
}
