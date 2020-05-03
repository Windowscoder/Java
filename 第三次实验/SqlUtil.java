package like;

import java.util.List;

public interface SqlUtil {
	
	String query(User user);
	
	String insert(User user);
	
	String insert(List<User> users);
	
	String delete(User user);
	
	String update(User user);
}

