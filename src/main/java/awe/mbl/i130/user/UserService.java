package awe.mbl.i130.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>(Arrays.asList(
			new User("1", "fonzarelli@awews.com", "Earl", "E-40", "Stevens"),
			new User("2", "facemob@awews.com", "Brad", "Scarface", "Jordan"),
			new User("3", "r@awews.com", "Rakim", "God MC", "Allah")
			));
	
	public List<User> getAllUsers() {
		return users;
	}
	
	public User getUser(String id) {
		return users.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		return user;
	}

	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
		for (int i = 0; i < users.size(); i++) {
			User t = users.get(i);
			if (t.getId().equals(id)) {
				users.set(i, user);
				return user;
			}
		}
		return user;
	}

	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		users.removeIf(t -> t.getId().equals(id));
	}

}
