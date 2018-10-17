package hello;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import hello.repository.FriendsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendsRepositoryTest {
	@Autowired
	private FriendsRepository friendsRepository;
	
	@Test
	public void getFriendList_1() {
		//get id 1 friendList
		List<String> friendList = new ArrayList<String>();
		friendList.add("Alice");
		
		List<String> friendsListAll =  friendsRepository.getFriendNameList("1");
		assertThat(friendList).isEqualTo(friendsListAll);
	}
	@Test
	public void getFriendList_2() {
		//get id 2 friendList
		List<String> friendList = new ArrayList<String>();
		friendList.add("Alice");
		friendList.add("Charlie");
		friendList.add("Davina");
		friendList.add("John");
		
		List<String> friendsListAll =  friendsRepository.getFriendNameList("2");
		assertThat(friendList).isEqualTo(friendsListAll);
	}
	@Test
	public void getFriendTree_1() {
		//get id 1 friend tree
		List<String> friendTree = new ArrayList<String>();
		friendTree.add("1");
		
		List<String> friendsTreeAll =  friendsRepository.getFriendsTree("1");
		assertThat(friendTree).isEqualTo(friendsTreeAll);
	}
	@Test
	public void getFriendTree_4() {
		//get id 1 friend tree 4 will get all 
		List<String> friendTree = new ArrayList<String>();
		friendTree.add("1");
		friendTree.add("2");
		friendTree.add("3");
		friendTree.add("4");
		friendTree.add("5");
		
		List<String> friendsTreeAll =  friendsRepository.getFriendsTree("4");
		assertThat(friendTree).isEqualTo(friendsTreeAll);
	}
	@Test
	public void getFriendTreeByCity_5() {
		//get id 1 friend tree 4 will get all 
		List<String> friendTree = new ArrayList<String>();
		friendTree.add("4");
		friendTree.add("1");
		friendTree.add("2");
		friendTree.add("5");
		friendTree.add("3");
		
		List<String> friendsTreeAll =  friendsRepository.getFriendsTreeByCity("5");
		assertThat(friendTree).isEqualTo(friendsTreeAll);
	}
}
