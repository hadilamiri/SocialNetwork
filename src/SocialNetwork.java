import controllers.*;

public class SocialNetwork {

	public static void main(String[] args) {
		MemberController mc = new MemberController();
		mc.login();
		//mc.sendFriendRequest();
		//mc.acceptDenyRequest();
		GroupsController gc = new GroupsController();
		gc.joinGroup();
		
		

	}

}
