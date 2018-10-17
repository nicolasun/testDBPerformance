package hello.controller;

import org.springframework.web.bind.annotation.RestController;

import hello.repository.FriendsRepository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FriendsController {

	private static final Logger log = LoggerFactory.getLogger(FriendsController.class);
	
	@Autowired
	private FriendsRepository friendsRepository;
	
	private String friendsList = "";
	private String friendTree = "";
	private String friendTreeByCity = "";
	@RequestMapping("/friendslist")
    public String friendslist(@RequestParam(value="id", required=true, defaultValue="1") String id) {
		friendsList = friendTree = friendTreeByCity = "";
		List<String> friendsListAll =  friendsRepository.getFriendNameList(id);
		friendsListAll.forEach((e)->{
			log.info("Friends list + "+e);
			friendsList += e;
		});
		List<String> friendsTree =  friendsRepository.getFriendsTree(id);
		friendsTree.forEach((e)->{
			log.info("Friends list + "+e);
			friendTree += e;
		});
		
		List<String> friendsTreeByCity =  friendsRepository.getFriendsTreeByCity(id);
		friendsTreeByCity.forEach((e)->{
			log.info("Friends list + "+e);
			friendTreeByCity += e;
		});
		return friendsList+" <br/>" + friendTree + "<br/>" + friendTreeByCity;
	}
	
}
