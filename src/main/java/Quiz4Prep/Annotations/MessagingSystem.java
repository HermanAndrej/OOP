package Quiz4Prep.Annotations;

public class MessagingSystem {

    @CanSendMessage
    @RequiresPermission(2)
    public static void sendMessage(Admin admin, String message){
        if(admin.getClass().isAnnotationPresent(UserPermission.class)){
            UserPermission userPermission = admin.getClass().getAnnotation(UserPermission.class);
                    if(userPermission.value() == 1){
                        System.out.println("Admin " + admin + " sent: " + message);
                    }else {
                        System.out.println("Only admin is allowed to send a message!");
                    }
        }
    }

    @CanSendMessage
    @RequiresPermission(1)
    public static void sendMessage(User user, String message){
        if(user.getClass().isAnnotationPresent(UserPermission.class)){
            UserPermission userPermission = user.getClass().getAnnotation(UserPermission.class);
            if(userPermission.value() == 1){
                System.out.println("Admin " + user + " sent: " + message);
            }else {
                System.out.println("Only admin is allowed to send a message!");
            }
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Ryan");
        Admin admin1 = new Admin("Zvonko");

        sendMessage(user1, "Helloooooo");
        sendMessage(admin1, "Helloooooooooo");

    }
}
