package Lab8.Task1;

public class MessagingSystem {

    /*
    @CanSendMessage
    @RequiresPermission(1)
    public static void sendMessage(User user, String message){
        System.out.println("User " + user.getUsername() + " sent a message: " + message);
    }

    @RequiresPermission(2)
    public static void sendMessage(Admin admin, String message){
        System.out.println("Admin " + admin.getUsername() + " sent a message: " + message);
    }
     */

    @RequiresPermission(2)
    public static void sendMessage(Object object, String message){
        if(object.getClass().isAnnotationPresent(UserPermission.class)){
            UserPermission userPermission = object.getClass().getAnnotation(UserPermission.class);
            if(userPermission.value()==2){
                System.out.println("Admin " + object + " sent a message: " + message);
            }else{
                System.out.println("User " + object + " is not allowed to send a message!");
            }
        }
    }



    public static void main(String[] args) {
        User user1 = new User("Amar");

        Admin admin1 = new Admin("Ryan");

        sendMessage(user1, "So, what else is new?");

        sendMessage(admin1, "Amazinggg");
    }
}
