package hello.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class FriendsRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(FriendsRepository.class);
	
	public List<String> getFriendNameList(String id){
		String sql = "SELECT friendName FROM friends_list where personID = "+id;
		log.info(sql);
		List<String> friendsNameList=  jdbcTemplate.queryForList(sql, String.class);
		return friendsNameList;
	}
	
	public List<String> getFriendsTree(String id){
		String sql = "WITH RECURSIVE friendsList (friend_next) AS (" + 
					 "   VALUES("+id+")" + 
				     "   UNION" + 
				     "   SELECT friend FROM friends, friendsList WHERE person = friend_next " + 
				     "   ) SELECT friend_next FROM friendsList;";
		log.info(sql);
		List<String> friendsTree=  jdbcTemplate.queryForList(sql, String.class);
		return friendsTree;
	}
}
