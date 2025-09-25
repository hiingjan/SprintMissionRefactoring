import com.sprint.mission.discodeit.entity.User;

public class main {
    public static void main(String[] args) {
    
        User user1 = new User("John Doe", "john.doe@example.com");
        
        System.out.println(user1.getUserName());
        System.out.println(user1.getUserEmail());
        System.out.println(user1.getId());
        System.out.println(user1.getCreatedAt());
        System.out.println(user1.getUpdatedAt());
        
        


        
    }
}
