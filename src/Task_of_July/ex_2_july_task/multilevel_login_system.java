package Task_of_July.ex_2_july_task;

public class multilevel_login_system {
    public static void main(String[] args) {
        SuperAdmin a1 = new SuperAdmin();
        a1.shutdownSystem();
        a1.accessAdminPanel();
        a1.login();
    }
}

class User {
    void login() {
        System.out.println("This is User");
    }
}

class AdminUser extends User {
    void accessAdminPanel() {
        System.out.println("This is AdminUser");
    }
}

class SuperAdmin extends AdminUser {
    void shutdownSystem() {
        System.out.println("This is SuperAdminUser");
    }
}
