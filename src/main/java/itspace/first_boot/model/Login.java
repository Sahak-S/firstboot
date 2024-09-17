package itspace.first_boot.model;

import itspace.first_boot.controller.LoginCountServices;
import itspace.first_boot.services.LoggerUserManagementServices;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Getter
@Setter
@Component
@RequestScope
public class Login {

    private final LoggerUserManagementServices loggerUserManagementServices;
    private final LoginCountServices loginCountServices;

    public Login(LoggerUserManagementServices loggerUserManagementServices,LoginCountServices loginCountServices) {
        this.loginCountServices=loginCountServices;
        this.loggerUserManagementServices = loggerUserManagementServices;
    }

    public String username;
    public String password;


    public boolean login() {
        loginCountServices.increment();
        String username = this.username;
        String password = this.password;
        boolean loginResult = false;

        if ("admin".equals(username) && "admin".equals(password)) {
            loginResult = true;
            loggerUserManagementServices.setUsername(username);

        }
        return loginResult;
    }
}
